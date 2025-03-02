package Dev;

import Dev.domain.Employee;
import Dev.domain.EmployeeComparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>(List.of(
                new Employee(101,"Shashank",2025),
                new Employee(102,"Shreyas",2026),
                new Employee(103,"Mizba",2025),
                new Employee(104,"Aditya",2025)
        )
        );

        var compartor = new EmployeeComparator<>();
        employee.sort(compartor);

        for(Employee e: employee){
            System.out.println(e);
        }
    }
}