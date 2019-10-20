package lesson01.Delete;

public class Human {
    String name;
    String surname;
    int age;
    private Cell cell;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void takeCell(Cell cell){
        this.cell = cell;
    }

    public void insertSimCard(){
        cell.insertSimCard();
    }

    public void call(String number){
        cell.call(number);
    }
    public void accept(String number){
        cell.accept(number);
    }
    public void saveNumber(String number){
        cell.saveNumber(number);
    }
    public void lock(){
        cell.lock();
    }
    public void unlock(){
        cell.unlock();
    }

    public String getCellModel(){
        return getCellModel();
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
