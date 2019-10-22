package HomeWorkLesson2.Tv;

import java.util.Scanner;

public class Plazma extends BaseTv {
    public Plazma(String model, String screen_size) {
        super(model, screen_size);
    }

    @Override
    public void on() {
        System.out.printf("TV %s was turned on by remote control %n", model);
    }

    @Override
    public void off() {
        System.out.printf("TV %s was turned off by remote control %n", model);

    }

    @Override
    public void channels(String channel) {
        Scanner in = new Scanner(System.in);
        System.out.println("Select channel");
        channel = in.nextLine();

       // if (channel.equals("1") || channel.equals("2") || channel.equals("3"))
            switch (channel) {
                case "1":
                    System.out.printf("You watching 'Trofei' channel %n");
                    break;
                case "2":
                    System.out.printf("You watching 'National Geographic' channel %n");
                    break;
                case "3":
                    System.out.printf("You watching '1+1' channel %n");
                    break;
                default:
                    System.out.printf("You watching unknown channel %n");
            }
    }


    @Override
    public void volume(String volume) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Choose volume level %n");
        volume = in.nextLine();
        System.out.printf("You choose %s volume level %n", volume);

    }

    @Override
    public void search() {
        System.out.printf("Searching channels started automatically %n");

    }

    @Override
    public void d() {
        System.out.printf("You turned on 3D option on TV %n");

    }
}
