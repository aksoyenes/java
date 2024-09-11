package Lablar;
interface ArticleScoreBehaviours{
    float ArticleScore();
}
interface ConferenceScoreBehavious{
    float ConferenceScore();
}
interface ProjectScoreBehaviour{
    float ProjectScore();
}
public abstract  class Student {
    private int id;
    private float mid;
    private float fin;
    public Student(int id, float mid,float fin){
        this.id=id;
        this.mid=mid;
        this.fin=fin;
    }
    abstract   float  computeTotalScore();
    float computeBaseScore(){
        return mid*0.4f+fin*0.6f;
    }
}
class MasterStudent extends Student implements ConferenceScoreBehavious{
   protected  int numberOfConf;
   public MasterStudent(int id,float mid,float fin,int numberOfConf){
       super(id, mid, fin);
       this.numberOfConf=numberOfConf;

   }

    @Override
    public float ConferenceScore() {
        return numberOfConf*5;
    }
    @Override
    float computeTotalScore() {
        return computeBaseScore()+ ConferenceScore();

    }
}
class BachelourStudent extends Student implements ProjectScoreBehaviour{
    public BachelourStudent(int id,float mid,float fin){
        super(id, mid, fin);
    }

    @Override
    float computeTotalScore() {
        return computeBaseScore()+ProjectScore();
    }

    @Override
    public float ProjectScore() {
        return 20;
    }
}
class PhDStudent extends MasterStudent implements ArticleScoreBehaviours {
    int numberOfArticles;

    public PhDStudent(int id, float mid, float fin, int conf, int numberOfArticles) {
        super(id, mid, fin, conf);
        this.numberOfArticles = numberOfArticles;

    }
    public float computeTotalScore(){
        return computeTotalScore()+ ArticleScore();
    }

    @Override
    public float ArticleScore() {
        return numberOfArticles*8;
    }
}
class StudentApp{
    public static void main(String[] args) {
        Student a= new MasterStudent(123,54f,48f,15);
        System.out.println(a.computeTotalScore());

    }
}


