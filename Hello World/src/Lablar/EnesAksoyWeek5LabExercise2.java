package Lablar;


public class EnesAksoyWeek5LabExercise2 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, Branch.MATH);
        Teacher teacher2 = new Teacher(2, Branch.PHYSICS);
        Teacher teacher3 = new Teacher(3, Branch.CS);
        Teacher teacher4 = new Teacher(4, Branch.ENG);

        // Put them in an array
        Teacher[] teachers = {teacher1, teacher2, teacher3, teacher4};

        // Print their branches using a for loop
        for (Teacher teacher : teachers) {
            System.out.println("Teacher ID: " + teacher.getId() + ", Branch: " + teacher.getBranch() +
                    ", Description: " + teacher.getBranch().getDescription());
        }
    }
}
class Teacher{
    private int id;
    private Branch branch;

    // Constructor
    public Teacher(int id, Branch branch) {
        this.id = id;
        this.branch = branch;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public Branch getBranch() {
        return branch;
    }
}
enum Branch{
    MATH("information regarding math"),
    PHYSICS("information regarding physics"),
    CS("information regarding cs"),
    ENG("information regarding eng");
    ;
 private final String description;
    Branch(String description){
    this.description=description;
    }
    public String getDescription(){
        return description;
    }

}