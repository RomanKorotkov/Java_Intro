package TESTING;

enum Gender {
    MALE("Male"),
    FEMALE("Female");

    public String gender;

    Gender(String gender){
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
