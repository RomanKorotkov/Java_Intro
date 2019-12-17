package TESTING;

public class Peoples implements Comparable<Peoples> {
    String name;
    int age;
    Gender gender;

    public Peoples(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Peoples{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public String getName() {
        return name;
    }

    public Peoples setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Peoples setAge(int age) {
        this.age = age;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public Peoples setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Peoples peoples = (Peoples) o;

        if (age != peoples.age) return false;
        if (!name.equals(peoples.name)) return false;
        return gender == peoples.gender;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + gender.hashCode();
        return result;
    }

    @Override
    public int compareTo(Peoples o) {
        return this.age - o.getAge();
    }
}
