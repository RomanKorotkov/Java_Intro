package Farm;

public class Farm {
    public static void main(String[] animal) {
        Cow burenka = new Cow("'Burenka'", "spotted", 1100, 4, 102);
        Horse leon = new Horse("'Leon'", "black", 1000, 2, 200);
        Sheep mikie = new Sheep("'Mikie'", "white", 160, 1, 1);

        burenka.information();
        burenka.introduction();
        burenka.running(Run.MEDIUM);
        burenka.voice(Voice.MOO);
        burenka.food("grass");

        leon.introduction();
        leon.running(Run.FAST);
        leon.voice(Voice.IGOGO);
        leon.food("hay");

        mikie.introduction();
        mikie.running(Run.SLOW);
        mikie.voice(Voice.BEEE);
        mikie.food("grass");
    }
}
