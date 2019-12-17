package SongsList;

import java.util.*;
import java.util.stream.Collectors;

public class MusicBox {
    public static void main(String[] args) {
        //MusicLibrary path = new MusicLibrary("");
        ArrayList<MusicPlayer> path = new ArrayList<>();
        path.addAll(Arrays.asList(
                new MusicPlayer("Sviridov.wav", "Sviridov", "\"Vals\"", "Classic", "Symphony", Type.SHORT),
                new MusicPlayer("Vivaldi.wav", "Vivaldi", "\"Flute Concert\"", "Classic", "Symphony", Type.SHORT),
                new MusicPlayer("Kenton.wav", "Kenton", "\"New Concepts of Artistry in Rhythm\"", "Jazz", "Progressive Jazz", Type.SHORT),
                new MusicPlayer("Davis.wav", "Davis", "\"Birth of the Cool\"", "Jazz", "Cool Jazz", Type.LONG),
                new MusicPlayer("Mingus.wav", "Mingus", "\"Ah Um\"", "Jazz", "Post Bop", Type.LONG),
                new MusicPlayer("Williamson.wav", "Williamson", "\"Help me\"", "Blues", "Chicago blues", Type.SHORT)
        ));

        //SORTED CLASSICAL ARTISTS
        printf("Please choose genre:%n 1.Classic %n 2.Jazz %n 3.Blues %n");
        Scanner in = new Scanner(System.in);
        String genre = in.nextLine();
        switch (genre) {
            case "1":
                List<Object> classic_artists = path.stream().filter(s -> {
                    if (s.getGenre() == "Classic") {
                        return s.getSub_genre() == "Symphony";
                    } else {
                        return false;
                    }
                }).peek(s -> printf("Artist - %s%n", s.getArtist())).collect(Collectors.toList());
                classic_artists.stream().sorted();
                //END SORTING

                //CHOOSE FIRST CLASSICAL ARTIST
                printf("Please type artist name %n");
                Scanner in1 = new Scanner(System.in);
                String class_artist = in1.nextLine();
                switch (class_artist) {
                    case "Sviridov":
                        List<Object> album_list = path.stream().filter(s -> {
                            if (s.getArtist() == "Sviridov") {
                                return s.getAlbum() == "\"Vals\"";
                            } else {
                                return false;
                            }
                        }).peek(s -> printf("Album - %s (%s) %n", s.getAlbum(), s.type.getType())).collect(Collectors.toList());
                        album_list.stream().sorted();
                        //EDN CHOSING

                        //START LISTEN MUSIC
                        printf("Do you want start listen music? %n");
                        Scanner in2 = new Scanner(System.in);
                        String play1 = in2.nextLine();
                        switch (play1) {
                            case "Yes":
                                path.get(0).playMusic("Sviridov.wav");
                                break;
                            default:
                                System.out.println("Absent");
                                System.exit(0);
                            case "No":
                                printf("By...");
                                System.exit(0);
                        }
                        break;
                    default:
                        System.out.println("Absent");
                        System.exit(0);
                        //END LISTEN MUSIC

                        //CHOOSE SECOND CLASSICAL ARTIST
                    case "Vivaldi":
                        List<Object> album_list2 = path.stream().filter(s -> {
                            if (s.getArtist() == "Vivaldi") {
                                return s.getAlbum() == "\"Flute Concert\"";
                            } else {
                                return false;
                            }
                        }).peek(s -> printf("Album - %s (%s) %n", s.getAlbum(), s.type.getType())).collect(Collectors.toList());
                        album_list2.stream().sorted();
                        //END CHOSING

                        //START LISTEN MUSIC
                        printf("Do you want start listen music? %n");
                        Scanner in3 = new Scanner(System.in);
                        String play2 = in3.nextLine();
                        switch (play2) {
                            case "Yes":
                                path.get(0).playMusic("Vivaldi.wav");
                                System.out.println("Absent");
                                System.exit(0);
                                break;
                            case "No":
                                printf("By...");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Absent");
                                System.exit(0);
                        }

                        //END LISTEN MUSIC
                }
                //SORTED JAZZ ARTISTS
            case "2":
                List<Object> jazz = path.stream().filter(s -> {
                    if (s.getGenre() == "Jazz") {
                        return s.getSub_genre() == "Progressive Jazz" | s.getSub_genre() == "Cool Jazz" | s.getSub_genre() == "Post Bop";
                    } else {
                        return false;
                    }
                }).peek(s -> printf("Artist - %s%n", s.getArtist())).collect(Collectors.toList());
                jazz.stream().sorted();
                //END SORTING

                //CHOOSE FIRST JAZZ ARTIST
                printf("Please type artist name %n");
                Scanner in4 = new Scanner(System.in);
                String class_artist3 = in4.nextLine();
                switch (class_artist3) {
                    case "Kenton":
                        List<Object> album_list3 = path.stream().filter(s -> {
                            if (s.getArtist() == "Kenton") {
                                return s.getAlbum() == "\"New Concepts of Artistry in Rhythm\"";
                            } else {
                                return false;
                            }
                        }).peek(s -> printf("Album - %s (%s) %n", s.getAlbum(), s.type.getType())).collect(Collectors.toList());
                        album_list3.stream().sorted();
                        //EDN CHOSING

                        //START LISTEN MUSIC
                        printf("Do you want start listen music? %n");
                        Scanner in5 = new Scanner(System.in);
                        String play3 = in5.nextLine();
                        switch (play3) {
                            case "Yes":
                                path.get(0).playMusic("Kenton.wav");
                                System.out.println("Absent");
                                System.exit(0);
                                break;
                            case "No":
                                printf("By...");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Absent");
                                System.exit(0);
                        }

                        //END LISTEN MUSIC

                        //CHOOSE SECOND JAZZ ARTIST
                    case "Davis":
                        List<Object> album_list4 = path.stream().filter(s -> {
                            if (s.getArtist() == "Davis") {
                                return s.getAlbum() == "\"Birth of the Cool\"";
                            } else {
                                return false;
                            }
                        }).peek(s -> printf("Album - %s (%s) %n", s.getAlbum(), s.type.getType())).collect(Collectors.toList());
                        album_list4.stream().sorted();
                        //END CHOSING

                        //START LISTEN MUSIC
                        printf("Do you want start listen music? %n");
                        Scanner in6 = new Scanner(System.in);
                        String play4 = in6.nextLine();
                        switch (play4) {
                            case "Yes":
                                path.get(0).playMusic("Davis.wav");
                                System.out.println("Absent");
                                System.exit(0);
                                break;
                            case "No":
                                printf("By...");
                                System.exit(0);
                        }
                        break;
                    default:
                        System.out.println("Absent");
                        System.exit(0);

                        //END LISTEN MUSIC

                        //CHOOSE THIRD JAZZ ARTIST
                    case "Mingus":
                        List<Object> album_list5 = path.stream().filter(s -> {
                            if (s.getArtist() == "Mingus") {
                                return s.getAlbum() == "\"Ah Um\"";
                            } else {
                                return false;
                            }
                        }).peek(s -> printf("Album - %s (%s) %n", s.getAlbum(), s.type.getType())).collect(Collectors.toList());
                        album_list5.stream().sorted();
                        //END CHOSING

                        //START LISTEN MUSIC
                        printf("Do you want start listen music? %n");
                        Scanner in7 = new Scanner(System.in);
                        String play5 = in7.nextLine();
                        switch (play5) {
                            case "Yes":
                                path.get(0).playMusic("Mingus.wav");
                                System.out.println("Absent");
                                System.exit(0);
                                break;
                            case "No":
                                printf("By...");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Absent");
                                System.exit(0);
                        }
                        //END LISTEN MUSIC
                }
                //SORTED BLUES ARTISTS
            case "3":
                List<Object> blues = path.stream().filter(s -> {
                    if (s.getGenre() == "Blues") {
                        return s.getSub_genre() == "Chicago blues";
                    } else {
                        return false;
                    }
                }).peek(s -> printf("Artist - %s%n", s.getArtist())).collect(Collectors.toList());
                blues.stream().sorted();
                //END SORTING

                //CHOOSE FIRST BLUES ARTIST
                printf("Please type artist name %n");
                Scanner in5 = new Scanner(System.in);
                String class_artist6 = in5.nextLine();
            case "Williamson":
                List<Object> album_list6 = path.stream().filter(s -> {
                    if (s.getArtist() == "Williamson") {
                        return s.getAlbum() == "\"Help me\"";
                    } else {
                        return false;
                    }
                }).peek(s -> printf("Album - %s (%s) %n", s.getAlbum(), s.type.getType())).collect(Collectors.toList());
                album_list6.stream().sorted();
                //END CHOSING

                //START LISTEN MUSIC
                printf("Do you want start listen music? %n");
                Scanner in7 = new Scanner(System.in);
                String play5 = in7.nextLine();
                switch (play5) {
                    case "Yes":
                        path.get(0).playMusic("Williamson.wav");
                        System.out.println("Absent");
                        System.exit(0);
                        break;
                    case "No":
                        printf("By...");
                        System.exit(0);
                }
                break;
            default:
                System.out.println("Absent");
                System.exit(0);
                //END LISTEN MUSIC
        }
    }

    private static void printf(String s2, Object... objects) {
        System.out.printf(s2, objects);
    }
}


//        Scanner in = new Scanner(System.in);
//        String result = in.nextLine();
//        if (result.equals("1"))
//        path.get(0).showGenre();{
//            List<Object> symphony = path.stream().filter(s -> {
//                if (s.getGenre() == "Classic") {
//                    return s.getSub_genre() == "Symphony";
//                } else {
//                    return false;
//                }
//            }).peek(s -> System.out.printf("%s %n", s.getBand())).collect(Collectors.toList());
//            symphony.stream().sorted();
//            if (result.equals("2")) {
//                List<Object> jazz = path.stream().filter(j -> {
//                    if (j.getGenre() == "Jazz") {
//                        return j.getSub_genre() == "Country Jazz" | j.getSub_genre() == "Progressive Jazz" | j.getSub_genre() =="Modal Jazz";
//                    } else {
//                        return false;
//                    }
//                }).peek(j -> System.out.printf("%s %n", j.getBand())).collect(Collectors.toList());
//                jazz.stream().sorted();
//            }

//            System.out.printf("%nPlease insert artist name %n");
//
//            Scanner in1 = new Scanner(System.in);
//            String artist = in1.nextLine();
//            if(artist.equals("Sviridov")){
//                List<Object> album = path.stream().filter(a->{
//                    if(a.getAlbum()=="Vals"){
//                        return a.getType()==Type.SHORT | a.getType()==Type.LONG;
//                    }else{
//                        return false;
//                    }
//                }).peek(a-> System.out.printf("%s %n", a.getAlbum())).collect(Collectors.toList());
//                album.stream().sorted();
//                if(artist.equals("Vivaldi")){
//                    List<Object> album2 = path.stream().filter(l->{
//                        if(l.getAlbum()=="Suite"){
//                            return l.getType()==Type.SHORT | l.getType()==Type.LONG;
//                        }else{
//                            return false;
//                        }
//                    }).peek(l-> System.out.printf("%s %n", l.getAlbum())).collect(Collectors.toList());
//                    album2.stream().sorted();
//                }
//path.get(0).playMusic("GS.wav");




