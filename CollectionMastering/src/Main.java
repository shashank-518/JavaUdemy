import java.util.ArrayList;
import java.util.List;

class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getCgpa() , this.getCgpa());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Shashank" , 7.4));
        students.add(new Student("Shreyas" , 7.9));
        students.add(new Student("Vishwas" , 8.4));
        students.add(new Student("Aditya" , 9.4));


//        students.sort(null);  ------> This doesnt work because there is no natural ordering for Student

//        List<Integer> Number = new ArrayList<>();
//        Number.add(4);
//        Number.add(34);
//        Number.add(2);
//        Number.add(1);
//
//        Number.sort(null);
//
//        System.out.println(Number);
        students.sort(null);
        System.out.println(students);

    }
}

/*


    Comparable has a method called CompareTo where we will compare one attribute to this
    Comparator has a method called Compare where there will be two parameters o1 and o2

    when will we use both??

    Comparable to find out natural Ordering using one of the fields
    Comparator to sort based on user requirements




 */