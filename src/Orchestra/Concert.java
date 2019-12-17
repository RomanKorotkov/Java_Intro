package Orchestra;

import java.util.*;
import java.util.stream.Collectors;

public class Concert {
    public static void main(String[] args){
        String filepath = "GS.wav";
        MusicClass musicObject = new MusicClass();

        //Violins
        Violin violin1 = new Violin("Bow", "Violin #1");
        Violin violin2 = new Violin("Bow", "Violin #2");
        Violin violin3 = new Violin("Bow", "Violin #3");
        Violin violin4 = new Violin("Bow", "Violin #4");
        //Cello
        Cello cello1 = new Cello("Bow", "Cello #1");
        Cello cello2 = new Cello("Bow", "Cello #2");
        //Double bass
        Bass bass1 = new Bass("String-bow", "Double bass #1");
        Bass bass2 = new Bass("String-bow", "Double bass #2");
        //Flute
        Flute flute = new Flute("Labial wind", "Flute");
        //Oboe
        Oboe oboe1 = new Oboe("Labial wind", "Oboe #1");
        Oboe oboe2 = new Oboe("Labial wind", "Oboe #2");
        //Trombone
        Trombone trombone = new Trombone("Labial wind", "Trombone");
        //Piano
        Piano piano = new Piano("String-shock-keyboard", "Piano");
        Piano piano2 = new Piano("String-shock-keyboard", "Forte-piano");
        //Drums
        Drum drum1 = new Drum("Drums", "Drums");
        Drum drum2 = new Drum("Drums", "Percussion");

        //ARRAYS
        ArrayList<Musicians> musicians = new ArrayList<>();
        musicians.add(new Musicians<Violin>("Antonio", "Vivaldi", 35, MusitionProfession.VIOLINIST, violin1));
        musicians.add(new Musicians<Violin>("Nikkolo", "Paganini", 30, MusitionProfession.VIOLINIST, violin2));
        musicians.add(new Musicians<Violin>("Leopold", "Auer", 25, MusitionProfession.VIOLINIST, violin3));
        musicians.add(new Musicians<Violin>("Gidon", "Kremer", 28, MusitionProfession.VIOLINIST, violin4));
        musicians.add(new Musicians<Bass>("Bill", "Black", 40, MusitionProfession.BASS, bass1));
        musicians.add(new Musicians<Bass>("Willie", "Dikson", 35, MusitionProfession.BASS, bass2));
        musicians.add(new Musicians<Cello>("Pol", "Tortie", 33, MusitionProfession.CELLIST, cello1));
        musicians.add(new Musicians<Cello>("Jaklin", "Du Pre", 34, MusitionProfession.CELLIST, cello2));
        musicians.add(new Musicians<Flute>("Djeims", "Goluei", 25, MusitionProfession.FLUTIST, flute));
        musicians.add(new Musicians<Piano>("Fryderyk", "Chopin", 38, MusitionProfession.PIANIST, piano));
        musicians.add(new Musicians<Piano>("Gabriella", "Chelintano", 33, MusitionProfession.PIANIST, piano2));
        musicians.add(new Musicians<Oboe>("Nancy", "Ambrose", 37, MusitionProfession.OBOIST, oboe1));
        musicians.add(new Musicians<Oboe>("Daniel", "Nikolas", 34, MusitionProfession.OBOIST, oboe2));
        musicians.add(new Musicians<Trombone>("George", "Roitfarb", 39, MusitionProfession.TROMBONE, trombone));
        musicians.add(new Musicians<Drum>("Andrew", "Powell", 22, MusitionProfession.DRUMMER, drum1));
        musicians.add(new Musicians<Drum>("Gabriel", "Logan", 33, MusitionProfession.DRUMMER, drum2));
        //ARRAYS

        ArrayList<Integer> hall = new ArrayList<>();
        hall.addAll(Arrays.asList(new Integer[]{}));

        //Implementation
        System.out.printf("Premier: new Symphony number 6 de l'amour in D# Cantata for scene \"Autumn Aurora\" %n" +
                "Orchestra are: %n");
        System.out.printf("%n");

        //Poster
        musicians.get(0).position(violin1);
        List<Object> bow = musicians.stream().filter(b->{
            if(b.getProfession()==MusitionProfession.VIOLINIST){
                return b.getAge()<2000;
            }
            if(b.getProfession()==MusitionProfession.CELLIST){
                return b.getAge()<2000;
            }else{
                return false;
            }
        }).peek(b-> System.out.printf("%s %s - %s (%s)%n", b.getName(), b.getSurname(),
                b.profession.getProfession(), b.getPersonalInstrument().getName())).collect(Collectors.toList());
        bow.stream().sorted();
        System.out.printf("%n");

        musicians.get(0).position(bass1);
        List<Object> string_bow = musicians.stream().filter(s->{
            if(s.getProfession()==MusitionProfession.BASS){
                return s.getAge()<2000;
            }else{
                return false;
            }
        }).peek(s-> System.out.printf("%s %s - %s (%s)%n", s.getName(), s.getSurname(),
                s.profession.getProfession(), s.getPersonalInstrument().getName())).collect(Collectors.toList());
        string_bow.stream().sorted();
        System.out.printf("%n");

        musicians.get(0).position(flute);
        List<Object> labial_wind = musicians.stream().filter(l->{
            if(l.getProfession()==MusitionProfession.OBOIST){
                return l.getAge()<2000;
            }
            if(l.getProfession()==MusitionProfession.FLUTIST){
                return l.getAge()<2000;
            }
            if(l.getProfession()==MusitionProfession.TROMBONE){
                return l.getAge()<2000;
            }else{
                return false;
            }
        }).peek(l-> System.out.printf("%s %s - %s (%s)%n", l.getName(), l.getSurname(),
                l.profession.getProfession(), l.getPersonalInstrument().getName())).collect(Collectors.toList());
        labial_wind.stream().sorted();
        System.out.printf("%n");

        musicians.get(0).position(piano);
        List<Object> keyboard = musicians.stream().filter(k->{
            if(k.getProfession()==MusitionProfession.PIANIST){
                return k.getAge()<2000;
            }else{
                return false;
            }
        }).peek(k-> System.out.printf("%s %s - %s (%s)%n", k.getName(), k.getSurname(),
                k.profession.getProfession(), k.getPersonalInstrument().getName())).collect(Collectors.toList());
        keyboard.stream().sorted();
        System.out.printf("%n");

        musicians.get(0).position(drum1);
        List<Object> drum = musicians.stream().filter(d->{
            if(d.getProfession()==MusitionProfession.DRUMMER){
                return d.getAge()<2000;
            }else{
                return false;
            }
        }).peek(d-> System.out.printf("%s %s - %s (%s)%n", d.getName(), d.getSurname(),
                d.profession.getProfession(), d.getPersonalInstrument().getName())).collect(Collectors.toList());
        drum.stream().sorted();
        System.out.printf("%n");

        System.out.printf("Ticket price on the concert 600 UAH. Do you want bye a ticket? %n");
        Scanner in = new Scanner(System.in);
        String result = in.nextLine();

        if (result.equals("yes") || result.equals("Yes") || result.equals("YEs") || result.equals("YES")
                || result.equals("yEs") || result.equals("yeS") || result.equals("yES") || result.equals("YeS")) {
            Optional<Integer> free_line = hall.stream().min(Integer::compare);
            Random line = new Random();
            Random place = new Random();
            System.out.printf("Welcome to the theatre. Your line is #%s with place #%s %n",
                    free_line.orElseGet(() -> line.nextInt(20)),
                    free_line.orElseGet(() -> place.nextInt(24)));
            System.out.printf("%n");
        } else if (result.equals("no") || result.equals("No") || result.equals(" NO") || result.equals("nO")) {
            System.out.println("Good by...");
            System.exit(0);
        } else {
            System.out.println("Are you sure that you can speak on human language? I don't understand you, please go" +
                    " out or I will call to Police");
            System.exit(0);
        }
        //Musicians get instruments
        musicians.get(0).getInstrument(violin1);
        musicians.get(1).getInstrument(violin2);
        musicians.get(2).getInstrument(violin3);
        musicians.get(3).getInstrument(violin4);

        musicians.get(0).getInstrument(bass1);
        musicians.get(1).getInstrument(bass2);

        musicians.get(0).getInstrument(cello1);
        musicians.get(1).getInstrument(cello2);

        musicians.get(0).getInstrument(flute);

        musicians.get(0).getInstrument(piano);

        musicians.get(0).getInstrument(oboe1);
        musicians.get(1).getInstrument(oboe2);

        musicians.get(0).getInstrument(trombone);

        musicians.get(0).getInstrument(drum1);
        musicians.get(1).getInstrument(drum2);
        System.out.printf("%n");

        //Instruments tuning
        musicians.get(0).tune();
        musicians.get(1).tune();
        musicians.get(2).tune();
        musicians.get(3).tune();

        musicians.get(0).tune();
        musicians.get(1).tune();

        musicians.get(0).tune();
        musicians.get(1).tune();

        musicians.get(0).tune();

        musicians.get(0).tune();

        musicians.get(0).tune();
        musicians.get(1).tune();

        musicians.get(0).tune();

        musicians.get(0).tune();
        musicians.get(1).tune();
        System.out.printf("%n");

        //Instruments starts sound
        musicians.get(0).play();

        musicians.get(0).play();
        musicians.get(1).stop();
        musicians.get(1).play();
        musicians.get(2).play();
        musicians.get(3).play();

        musicians.get(0).play();
        musicians.get(1).play();

        musicians.get(0).play();
        musicians.get(1).play();

        musicians.get(0).play();

        musicians.get(0).play();

        musicians.get(0).play();
        musicians.get(1).play();

        musicians.get(0).play();

        musicians.get(1).play();
        musicians.get(0).play();

        musicObject.playMusic(filepath);
        //musicians.get(0).playMusic(filepath);
        System.out.printf("%n");

//        //Symphony finished
//        musicians.get(1).stop();
//        musicians.get(0).stop();
//
//        cellist.get(0).stop();
//        cellist.get(1).stop();
//        violinist.get(2).stop();
//        violinist.get(3).stop();
//
//        bassist.get(0).stop();
//        bassist.get(1).stop();
//
//        violinist.get(0).stop();
//        violinist.get(1).stop();
//
//        flutist.get(0).stop();
//
//        pianist.get(0).stop();
//
//        oboist.get(0).stop();
//        oboist.get(1).stop();
//
//        trombone_p.get(0).stop();
//        System.out.printf("%n");
//        System.out.println("Concert was finished");
    }
}

