package Dev.domain;

import java.util.Comparator;

public class Employee {

    public static class EmployeeComparator <T extends  Employee> implements Comparator<Employee> {

        private String SortType;


        public EmployeeComparator() {
            this("name");
        }

        public EmployeeComparator(String sortType) {
            this.SortType = sortType;
        }

        @Override
        public int compare(Employee o1, Employee o2) {

            if(SortType.equalsIgnoreCase("yearsStarted")){
                return o1.yearsStarted - o2.yearsStarted;
            }

            return o1.name.compareTo(o2.name);
        }
    }

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
