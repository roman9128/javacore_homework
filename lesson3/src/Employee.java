import java.time.LocalDate;
import java.time.Period;

public class Employee {

    private String name;
    private String department;
    private int salaryAmonth;
    private static int bonusMoney; // для первого варианта
    private LocalDate birthDate;

    public Employee(String name, String department, int salaryAmonth, LocalDate birthDate) {
        this(name);
        this.department = department;
        this.salaryAmonth = salaryAmonth;
        this.birthDate = birthDate;
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getSalaryAmonth() {
        return salaryAmonth;
    }

    public void setSalaryAmonth(int salaryAmonth) {
        this.salaryAmonth = salaryAmonth;
    }

    // 1 вариант

    public static void setBonus(int bonus) {
        bonusMoney = bonus;
    }

    public void updateSalary() {
        this.salaryAmonth = this.salaryAmonth + bonusMoney;
    }

    // 2 вариант

    public void increaseSalary(int money) {
        this.salaryAmonth = this.salaryAmonth + money;

    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", department=" + department + ", salaryAmonth=" + salaryAmonth
                + ", birthDate=" + birthDate + "]";
    }

    // Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий
    // две даты, представленные в виде трёх чисел гггг-мм-дд, без использования
    // условного оператора.

    // Логика следующая: из даты 1 вычитается дата 2, если результат положительный,
    // значит дата 1 больше, если отрицательный - дата 2 больше, при нуле -
    // равенство
    public int protoComparator1(LocalDate date1, LocalDate date2) {
        Period period = Period.between(date2, date1);
        return period.getDays();
    }

    // По сути то же самое, но короче
    public int protoComparator2(LocalDate date1, LocalDate date2) {
        return date1.compareTo(date2);
    }
}