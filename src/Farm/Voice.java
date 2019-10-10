package Farm;

public enum Voice {
    MOO("'Moo'"),
    IGOGO("'Igogo'"),
    BEEE("'Beee'");

    public String sound;

    Voice(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
