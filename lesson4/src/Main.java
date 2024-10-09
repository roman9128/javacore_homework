import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker("Mike", Gender.MALE);
        Worker worker2 = new Worker("Don", Gender.MALE);
        Worker worker3 = new Worker("Raph", Gender.MALE);
        Worker worker4 = new Worker("Leo", Gender.MALE);
        Worker worker5 = new Worker("Splinter", Gender.MALE);
        Worker worker6 = new Worker("April", Gender.FEMALE);

        Worker[] staff = { worker1, worker2, worker3, worker4, worker5, worker6 };
        
        System.out.println(congratulateStaff(staff));

    }

    private static String congratulateStaff(Worker[] staff) {
        StringBuilder builder = new StringBuilder();
        for (Holiday holiday : Holiday.values()) {
            if (holiday.getDateOfHoliday() != null && holiday.getDateOfHoliday().isEqual(LocalDate.now())) {
                for (Worker worker : staff) {
                    if (worker.getGender().equals(holiday.getGenderHoliday()) || holiday.getGenderHoliday() == null) {
                        builder.append(worker.getName());
                        builder.append(", ");
                        builder.append(holiday.getTypicalCongrats());
                        builder.append(System.lineSeparator());
                    } 
                }
            }
        }
        if (builder.isEmpty()) {
            builder.append("Сегодня без поздравлений");
        }
        return builder.toString();
    }
}