package HomeWorkLesson2;

//Class
public final class Workers {
    private String firstName;
    private String secondName;
    private int age;
    private static int count = 0;

    //Constructor
    private Workers(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        count++;
    }

    //Worker introduction
    private void worker() {
        System.out.printf("My name is %s %s \n", firstName, secondName);
    }

    //Worker count
    private static int getCount() {
        return count;
    }

    //Count worker result
    static {
        System.out.println("Let's start to introduce our colleagues");
    }
    /*{
        System.out.println("A " + ++count + " B");
    }*/

    //Our workers
    public static void main(String[] args) {
        Workers w1 = new Workers("Gabriel", "Logan", 35);
        Workers w2 = new Workers("Gabriel", "Logan", 35);
        Workers w3 = new Workers("Lian", "Xing", 33);
        Workers w4 = w1;
        Workers w5 = new Workers("Roman", "Korotkov", 30);

        w1.worker();
        w2.worker();
        w3.worker();
        w4.worker();
        w5.worker();
        System.out.println("In our team " + Workers.getCount() + " member(s)");
        System.out.println("If w1 == w2 they are similar? " + (w1 == w2));
        System.out.println("If w1 == w3 they are similar? " + (w1 == w3));
        System.out.println("If w1 == w4 they are similar? " + (w1 == w4));
        System.out.println("If w1 equals w2 they are similar? " + (w1.equals(w2)));
        System.out.println("If w1 equals w3 they are similar? " + (w1.equals(w3)));
        System.out.println("If w1 equals w4 they are similar? " + (w1.equals(w4)));
        System.out.println("Driver(s) is - " + w1.toString() + w4.toString());
        System.out.println("Manager(s) is - " + w3.toString() + w2.toString());
        System.out.println("Hash code of w1 is - " + w1.hashCode() + ";" + " of w2 is - " + w2.hashCode() + ";"
                + " of w3 is - " + w3.hashCode() + ";" + " of w4 is - " + w4.hashCode() + ";");
        System.out.println("QA Engineer is - " + w5);

    }

    //Method equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Workers workers = (Workers) o;

        if (age != workers.age) return false;
        if (firstName != null ? !firstName.equals(workers.firstName) : workers.firstName != null) return false;
        return secondName != null ? secondName.equals(workers.secondName) : workers.secondName == null;
    }

    //Method hashCode()
    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    //Method toString()
    @Override
    public String toString() {
        return "" +
                "First Name: " + firstName +
                ", Second Name: " + secondName +
                ", age: " + age +
                "; ";
    }

    //Getter
    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    //Setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
