public enum Holiday {
    NOHOLIDAY(), NEWYEAR("С НГ!", "01.01"), FEBRUARY23("С 23!", "23.02", Gender.MALE), MARCH8("С 8 Марта!", "08.03", Gender.FEMALE);

    private String typicalCongrats;
    private String dateOfHoliday; // решил не усложнять специальными типами данных
    private Gender genderHoliday;

    private Holiday(String typicalCongrats, String dateOfHoliday, Gender genderHoliday) {
        this(typicalCongrats, dateOfHoliday);
        this.genderHoliday = genderHoliday;
    }

    private Holiday(String typicalCongrats, String dateOfHoliday) {
        this.typicalCongrats = typicalCongrats;
        this.dateOfHoliday = dateOfHoliday;
    }

    private Holiday() {
    }

    public String getTypicalCongrats() {
        return typicalCongrats;
    }

    public String getDateOfHoliday() {
        return dateOfHoliday;
    }

    public Gender getGenderHoliday() {
        return genderHoliday;
    }
}