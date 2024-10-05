import java.time.LocalDate;

public class Boss extends Employee {

    public Boss(String name, String department, int salaryAmonth, LocalDate birthDate) {
        super(name, department, salaryAmonth, birthDate);
    }

    public Boss(String name) {
        super(name);
    }

    // 1 вариант
    @Override
    public void updateSalary() {
    }

    // 2 вариант
    public static void increaseSalary(Employee[] staff, int bonusMoney) {
        for (Employee employee : staff) {
            if(!(employee instanceof Boss)){
                employee.increaseSalary(bonusMoney);
            }
        }
    }
}