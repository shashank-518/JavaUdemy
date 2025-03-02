package Dev.domain;

public class Employee {

    private int EmployeeId;

    private String name;

    private int yearsStarted;

    public Employee() {
    }

    public Employee(int employeeId, String name, int yearsStarted) {
        EmployeeId = employeeId;
        this.name = name;
        this.yearsStarted = yearsStarted;
    }


    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "%d %-8s %d".formatted(EmployeeId,name,yearsStarted);
    }
}
