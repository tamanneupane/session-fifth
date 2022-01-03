package day5;

public class PolymorphismPractise {

    public static void main(String[] args) {
        Person person;

        person = new Student();
        person.setName("ABC");
        person.setAge((short) 12);
        ((Student)person).setStudentClass(6);

        person = new Teacher();
        person.setName("English Teacher");
        person.setAge((short) 50);
//        teacher.setSubject("English");


        //List of Person Class


    }

    public static void add(int a, int b){
        int temp = a + b;
        System.out.println(temp);
    }

    public static void add(int a, int b, int c){
        int temp = a + b + c;
        System.out.println(temp);
    }

    public static void add(float a, float b){
        float temp = a + b;
        System.out.println(temp);
    }
}
