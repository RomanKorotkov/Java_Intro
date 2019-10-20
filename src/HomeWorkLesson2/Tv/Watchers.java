package HomeWorkLesson2.Tv;

public class Watchers {
    String name;
    String surname;
    int age;
    Tv tv;
    DVD dvd;

    public Watchers(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void watchTv(Tv tv){
        this.tv = tv;
        System.out.printf("%s %s wants to watch tv %n", name, surname);
    }


    public void dvd(DVD dvd){
        this.dvd = dvd;
        System.out.printf("%s %s wants to watch film on DVD player %n", name, surname);
    }

    public void coloring (ScreenColor screen_color){
        System.out.printf("This TV in %s screen %n", screen_color.getScreen_color());
    }

    public void watching(){
        System.out.printf("%s %s watching 3D film... %n", name, surname);
    }

    public void film(String film){
        System.out.printf("Film %s was ended %n", film);
    }

    public void on(){
        tv.on();
    }

    public void off(){
        tv.off();
    }

    public void channels(String channel){
        tv.channels(channel);
    }

    public void volume(String volume){
        tv.volume(volume);
    }

    public void search(){
        tv.search();
    }

    public void d(){
        tv.d();
    }

    public void connection(){
        dvd.connection();
    }

    public void turn_on(){
        dvd.turn_on();
    }

    public void turn_off(){
        dvd.turn_off();
    }

    public void insertCd(){
        dvd.insertCd();
    }

    @Override
    public String toString() {
        return "Watchers{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", tv=" + tv +
                ", dvd=" + dvd +
                '}';
    }

    public String getName() {
        return name;
    }

    public Watchers setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Watchers setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Watchers setAge(int age) {
        this.age = age;
        return this;
    }

    public Tv getTv() {
        return tv;
    }

    public Watchers setTv(Tv tv) {
        this.tv = tv;
        return this;
    }

    public DVD getDvd() {
        return dvd;
    }

    public Watchers setDvd(DVD dvd) {
        this.dvd = dvd;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Watchers watchers = (Watchers) o;

        if (age != watchers.age) return false;
        if (!name.equals(watchers.name)) return false;
        if (!surname.equals(watchers.surname)) return false;
        if (!tv.equals(watchers.tv)) return false;
        return dvd.equals(watchers.dvd);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + age;
        result = 31 * result + tv.hashCode();
        result = 31 * result + dvd.hashCode();
        return result;
    }
}
