package HomeWorkLesson2.PeopleWithMobile;

public class Human {
    String name;
    String surname;
    int age;
    Cell cell;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void getPhone(Cell cell) {
        this.cell = cell;

    }

    public void takePhone() {
        System.out.printf("%s %s take a mobile %n", name, surname);
    }

    public void insertSim() {
        cell.insertSim();
    }

    public void callByNumber(String number) {
        cell.callByNumber(number);
    }

    public void getCall(String number) {
        cell.getCall(number);
    }

    public void saveNumber(String number) {
        cell.saveNumber(number);
    }

    public void lockPhone() {
        cell.lockPhone();
    }

    public void unlockPhone() {
        cell.unlockPhone();
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", cell=" + cell +
                '}';
    }

    public String getName() {
        return name;
    }

    public Human setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Human setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Human setAge(int age) {
        this.age = age;
        return this;
    }

    public Cell getCell() {
        return cell;
    }

    public Human setCell(Cell cell) {
        this.cell = cell;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        if (!name.equals(human.name)) return false;
        if (!surname.equals(human.surname)) return false;
        return cell.equals(human.cell);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + age;
        result = 31 * result + cell.hashCode();
        return result;
    }
}
