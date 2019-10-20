package HomeWorkLesson2.Tv;

public class PeopleWatchTv {
    public static void main(String[] tv) {
        Watchers pablo = new Watchers("Pablo", "Puello", 56);
        Watchers robert = new Watchers("Robert", "Lidermann", 25);

        Plazma lg = new Plazma("LG 43UK6300PLB", "3840x2160");
        OldTv berezka = new OldTv("Berezka", "2730x1050");

        Vidik fisher = new Vidik("Fisher");


        robert.watchTv(lg);
        robert.on();
        robert.coloring(ScreenColor.COLOR);
        robert.search();
        robert.channels("");
        robert.volume("");
        robert.dvd(fisher);
        robert.connection();
        robert.turn_on();
        robert.insertCd();
        robert.d();
        robert.watching();
        robert.film("Harry Potter");
        robert.turn_off();
        robert.off();
        System.out.printf("%n");

        pablo.watchTv(berezka);
        pablo.on();
        pablo.coloring(ScreenColor.BLACKWHITE);
        pablo.search();
        pablo.channels("");
        pablo.volume("");
        //pablo.d();
        pablo.off();
        System.out.printf("%n");
    }


}
