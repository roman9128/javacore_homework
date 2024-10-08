public enum Gender {
    
    MALE("муж."), FEMALE("жен.");

    private final String genderInRussian;

    private Gender(String genderInRussian) {
        this.genderInRussian = genderInRussian;
    }

    public String getGenderInRussian() {
        return genderInRussian;
    }
}