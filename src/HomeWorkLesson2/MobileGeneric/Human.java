package HomeWorkLesson2.MobileGeneric;

//Class with human implementation with generic
public class Human<T extends BaseCell> {
    //Human fields
    String name;
    String surname;
    int age;
    //Generic
    private T personPhone;

    //Constructor with generic
    public Human(String name, String surname, int age, T personPhone) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personPhone = personPhone;
    }

    //Method for take phone by human
    public void getphone(T personPhone) {
        this.personPhone = personPhone;
    }

    //Phone methods. Human actions with phone
    public void takePhone() {
        System.out.printf("%s %s take a mobile %n", name, surname);
    }

    public void insertSim() {
        personPhone.insertSim();
    }

    public void callByNumber(String number) {
        personPhone.callByNumber(number);
    }

    public void getCall(String number) {
        personPhone.getCall(number);
    }

    public void saveNumber(String number) {
        personPhone.saveNumber(number);
    }

    public void lockPhone() {
        personPhone.lockPhone();
    }

    public void unlockPhone() {
        personPhone.unlockPhone();
    }

    //To String
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", cell=" + personPhone +
                '}';
    }

    //Getter/Setter with generic
    public String getName() {
        return name;
    }

    public Human<T> setName(String name) {
        this.name = name;
        return this;
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human<?> human = (Human<?>) o;

        if (age != human.age) return false;
        if (!name.equals(human.name)) return false;
        if (!surname.equals(human.surname)) return false;
        return personPhone.equals(human.personPhone);
    }

    //Hash code
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + age;
        result = 31 * result + personPhone.hashCode();
        return result;
    }
}
