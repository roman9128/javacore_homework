import java.time.LocalDate;

public enum Holiday {
    NOHOLIDAY(),
    NEWYEAR("С НГ!", LocalDate.of(LocalDate.now().getYear(), 1, 1)),
    FEBRUARY23("С 23!", LocalDate.of(LocalDate.now().getYear(), 2, 23), Gender.MALE),
    MARCH8("С 8 Марта!", LocalDate.of(LocalDate.now().getYear(), 3, 8), Gender.FEMALE);

    private String typicalCongrats;
    private LocalDate dateOfHoliday;
    private Gender genderHoliday;

    private Holiday(String typicalCongrats, LocalDate dateOfHoliday, Gender genderHoliday) {
        this(typicalCongrats, dateOfHoliday);
        this.genderHoliday = genderHoliday;
    }

    private Holiday(String typicalCongrats, LocalDate dateOfHoliday) {
        this.typicalCongrats = typicalCongrats;
        this.dateOfHoliday = dateOfHoliday;
    }

    private Holiday() {
    }

    public String getTypicalCongrats() {
        return typicalCongrats;
    }

    public LocalDate getDateOfHoliday() {
        return dateOfHoliday;
    }

    public Gender getGenderHoliday() {
        return genderHoliday;
    }
}