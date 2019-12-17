package Orchestra;

public class Musicians <T extends BaseInstrumentData> implements Comparable<Musicians> {
    String name;
    String surname;
    int age;
    MusitionProfession profession;
    public T personalInstrument;

    public Musicians(String name, String surname, int age, MusitionProfession profession, T personalInstrument) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.profession = profession;
        this.personalInstrument = personalInstrument;
    }

    public void getInstrument(T personalInstrument){
        this.personalInstrument = personalInstrument;
        System.out.printf("%s %s take %s %n", name, surname, personalInstrument.getName());
    }

    public void position(T personalInstrument){
        this.personalInstrument = personalInstrument;
        System.out.printf("%s part - %n", personalInstrument.getType());
    }

    public void lineUp(){
        this.personalInstrument = personalInstrument;
        System.out.printf("%s %s - %s (%s) %n", name, surname, profession.getProfession(), personalInstrument.getName());
    }

    public void tune(){
        personalInstrument.tune();
    }

    public void play(){
        personalInstrument.play();
    }

    public void stop(){
        personalInstrument.stop();
    }




    @Override
    public String toString() {
        return "Musicians{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", profession=" + profession +
                ", personalInstrument=" + personalInstrument +
                '}';
    }

    public String getName() {
        return name;
    }

    public Musicians<T> setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Musicians<T> setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Musicians<T> setAge(int age) {
        this.age = age;
        return this;
    }

    public MusitionProfession getProfession() {
        return profession;
    }

    public Musicians<T> setProfession(MusitionProfession profession) {
        this.profession = profession;
        return this;
    }

    public T getPersonalInstrument() {
        return personalInstrument;
    }

    public Musicians<T> setPersonalInstrument(T personalInstrument) {
        this.personalInstrument = personalInstrument;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Musicians<?> musicians = (Musicians<?>) o;

        if (age != musicians.age) return false;
        if (!name.equals(musicians.name)) return false;
        if (!surname.equals(musicians.surname)) return false;
        if (profession != musicians.profession) return false;
        return personalInstrument.equals(musicians.personalInstrument);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + age;
        result = 31 * result + profession.hashCode();
        result = 31 * result + personalInstrument.hashCode();
        return result;
    }

    @Override
    public int compareTo(Musicians o) {
        return this.age = -o.getAge();
    }
}
