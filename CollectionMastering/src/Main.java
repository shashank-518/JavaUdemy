import java.util.ArrayList;
import java.util.List;

class Student{
    private String name;

    private double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}


public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Shashank" , 7.4));
        students.add(new Student("Shreyas" , 7.9));
        students.add(new Student("Vishwas" , 8.4));
        students.add(new Student("Aditya" , 9.4));


        students.sort(((o1, o2) -> (int) (o2.getCgpa() - o1.getCgpa())));

        for(Student s : students){
            System.out.println(s.getName() + "  " + s.getCgpa());
        }

    }
}