import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Mike", "TNMT", 100000, LocalDate.of(1987, 12, 14));
        Employee employee2 = new Employee("Don", "TNMT", 110000, LocalDate.of(1987, 12, 14));
        Employee employee3 = new Employee("Raph", "TNMT", 120000, LocalDate.of(1987, 12, 14));
        Employee employee4 = new Employee("Leo", "TNMT", 130000, LocalDate.of(1987, 12, 14));
        Boss boss = new Boss("Splinter", "TNMT", 200000, LocalDate.of(1984, 1, 1));
        Employee[] staff = { employee1, employee2, employee3, employee4, boss };

        // 1 вариант
        Employee.setBonus(20000);
        print1(staff);

        // 2 вариант
        Boss.increaseSalary(staff, 10000);
        print2(staff);
    }

    private static void print1(Employee[] staff) {
        System.out.println("\t1. Salaries of staff:" + System.lineSeparator());
        System.out.println("Name:    \tOld salary:\tNew salary:");

        for (Employee employee : staff) {
            System.out.print("| " + employee.getName() + "     \t| " + employee.getSalaryAmonth());
            employee.updateSalary();
            System.out.println("  \t| " + employee.getSalaryAmonth());
        }
        System.out.println(System.lineSeparator());
    }

    private static void print2(Employee[] staff) {
        System.out.println("\t2. Salaries of staff:" + System.lineSeparator());
        System.out.println("Name:    \tSalary:");

        for (Employee employee : staff) {
            System.out.println("| " + employee.getName() + "     \t| " + employee.getSalaryAmonth());
        }
        System.out.println(System.lineSeparator());
    }
}