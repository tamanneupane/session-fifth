package day2;

public class Student {

    // States

    // name
    // phoneNumber
    // dob
    // class
    // rollNumber
    // height
    // address
    // idNumber
    // email
    // username
    // password
    // emergencyContactNumber
    // socialSecurityNumber

    public String name;
    String phoneNumber;
    String dob;
    String sClass;
    String rollNumber;
    float height;
    String address;
    String idNumber;
    String email;
    String username;
    String password;
    String emergencyContactNumber;
    String socialSecurityNumber;
    char c;
    boolean isTrue;


    // behaviour

    // present
    public void present(){
        System.out.println("Student is present");
    }

    // studying
    public void studying(){
        System.out.println("Student is studying");
    }

    // playing

    public void playing(){
        System.out.println("Student is playing");
    }

    // working
    // teaching
    // discussing
    // eating

    public static void main(String[] args) {

        Student student1 = new Student(); // student object
        student1.name = "Ram";
        student1.playing();

        Student student2 = new Student();
        student2.name = "Hari";
        student2.playing();

        Student student3 = new Student();
        student3.name = "Sita";
        student2.playing();
    }

}
