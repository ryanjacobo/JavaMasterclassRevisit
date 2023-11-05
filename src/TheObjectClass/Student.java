package TheObjectClass;

public class Student {
    private String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';

        return name + " is " + age;
    }
}
