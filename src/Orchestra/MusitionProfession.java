package Orchestra;

public enum MusitionProfession {
    VIOLINIST("Violinist"),
    BASS("Double bass player"),
    CELLIST("Cellist"),
    FLUTIST("Flutist"),
    PIANIST("Pianist"),
    OBOIST("Oboist"),
    TROMBONE("Trombone player"),
    DRUMMER("Drummer");

    public String profession;

    MusitionProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }
}
