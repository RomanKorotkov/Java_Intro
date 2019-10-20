package HomeWorkLesson2.Tv;

import java.util.Scanner;

public class OldTv extends BaseTv {
    public OldTv(String model, String screen_size) {
        super(model, screen_size);
    }

    @Override
    public void on() {
        System.out.printf("TV %s was turned on by button on the TV panel %n", model);
    }

    @Override
    public void off() {
        System.out.printf("TV %s was turned off by button on the TV panel %n", model);
    }

    @Override
    public void channels(String channel) {
        Scanner in = new Scanner(System.in);
        System.out.println("Select channel");
        channel = in.nextLine();
        System.out.printf("Picture is absent... %n");
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
        System.out.printf("Searching channels started manually %n");
    }

    @Override
    public void d() {
        System.out.printf("3D option is absent %n");
    }
}
