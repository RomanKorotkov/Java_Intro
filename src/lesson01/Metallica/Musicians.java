package lesson01.Metallica;

public class Musicians {
    String name;
    String surname;
    String position;
    Guitars guitars;
    Tuner tuner;
    Drums drums;
    Microphone microphone;

    public Musicians(String name, String surname, String position) {
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public void takeGuitar(Guitars guitars) {
        this.guitars = guitars;
        System.out.printf("%s %s take guitar %n", name, surname);
    }

    public void takeTuner(Tuner tuner) {
        this.tuner = tuner;
        System.out.printf("%s %s take tuner %n", name, surname);
    }

    public void takeDrums(Drums drums) {
        this.drums = drums;
        System.out.printf("%s %s sit down on the drums %n", name, surname);
    }

    public void takeMicrophone(MicrophoneSure sure) {
        this.microphone = microphone;
        System.out.printf("%s %s take microphone %n", name, surname);
    }

    public void tuning(String string) {
        guitars.tuning(string);
    }

    public void cabelInGuitar() {
        guitars.cabelInGuitar();
    }

    public void cabelInCombik() {
        guitars.cabelInCombik();
    }

    public void turnVolume() {
        guitars.turnVolume();
    }

    public void turnDistortion() {
        guitars.turnDistortion();
    }

    public void playing() {
        guitars.playing();
    }

    public void turnOn() {
        tuner.turnOn();
    }

    public void connectToGuitar() {
        tuner.connectToGuitar();
    }

    public void turnOff() {
        tuner.turnOff();
    }

    public void takeSticks() {
        drums.takeSticks();
    }

    public void startPlaying() {
        drums.startPlaying();
    }

    public void sing(/*String lyrics*/) {
        microphone.singing(/*lyrics*/);

    }

    @Override
    public String toString() {
        return "Musicians{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", guitars=" + guitars +
                ", tuner=" + tuner +
                ", drums=" + drums +
                ", microphone=" + microphone +
                '}';
    }

    public String getName() {
        return name;
    }

    public Musicians setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Musicians setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public Musicians setPosition(String position) {
        this.position = position;
        return this;
    }

    public Guitars getGuitars(String s) {
        return guitars;
    }

    public Musicians setGuitars(Guitars guitars) {
        this.guitars = guitars;
        return this;
    }

    public Tuner getTuner(String s) {
        return tuner;
    }

    public Musicians setTuner(Tuner tuner) {
        this.tuner = tuner;
        return this;
    }

    public Drums getDrums(String s) {
        return drums;
    }

    public Musicians setDrums(Drums drums) {
        this.drums = drums;
        return this;
    }

    public Microphone getMicrophone(String s) {
        return microphone;
    }

    public Musicians setMicrophone(Microphone microphone) {
        this.microphone = microphone;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Musicians musicians = (Musicians) o;

        if (!name.equals(musicians.name)) return false;
        if (!surname.equals(musicians.surname)) return false;
        if (!position.equals(musicians.position)) return false;
        if (!guitars.equals(musicians.guitars)) return false;
        if (!tuner.equals(musicians.tuner)) return false;
        if (!drums.equals(musicians.drums)) return false;
        return microphone.equals(musicians.microphone);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + position.hashCode();
        result = 31 * result + guitars.hashCode();
        result = 31 * result + tuner.hashCode();
        result = 31 * result + drums.hashCode();
        result = 31 * result + microphone.hashCode();
        return result;
    }
}
