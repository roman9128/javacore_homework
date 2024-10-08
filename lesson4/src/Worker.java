import java.time.LocalDate;

public class Worker {

    private String name;
    private String department;
    private int salaryAmonth;
    private LocalDate birthDate;
    private Gender gender;

    public Worker(String name, String department, int salaryAmonth, LocalDate birthDate, Gender gender) {
        this(name, gender);
        this.department = department;
        this.salaryAmonth = salaryAmonth;
        this.birthDate = birthDate;
    }

    public Worker(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
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

    public String getGenderInRussian() {
        return gender.getGenderInRussian();
    }

     public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}