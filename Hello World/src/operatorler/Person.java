package operatorler;

public class Person {
    int id;
    String firstName;
    String lastName;
    int age;

    public Person(int id,String firstName,String lastName,int age){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.age =age;


    }
    public Person(String firstName,String lastName){
        this(0, firstName, lastName, 0);


    }
    public Person(int id){
        this(id,"", "",0);

    }





}
    