package lesson01.Metallica;

public class ConcertOfMetallica {
    public static void main (String[] concert){
        Musicians james = new Musicians("James", "Hetfield", "rhythm guitar, voice");
        Musicians kirk = new Musicians("Kirk", "Hammett", "lead guitar");
        Musicians robert = new Musicians("Robert", "Trujillo", "bass guitar");
        Musicians lars = new Musicians("Lars", "Ulrich", "drums");

        GuitarLTD ltd = new GuitarLTD("LTD", "guitar");
        GuitarESP esp = new GuitarESP("ESP", "guitar");
        BassWarwick warwick = new BassWarwick("Warwick", "bass guitar");
        DrumsTama tama = new DrumsTama("Tama", "drums");
        MicrophoneSure sure = new MicrophoneSure("Sure", "microphone");
        TunerTuner tuner = new TunerTuner("Tuner", "tuner");

        james.takeGuitar(ltd);
        james.cabelInGuitar();
        james.takeTuner(tuner);
        james.turnOn();
        james.connectToGuitar();
        james.tuning("");
        james.turnOff();
        james.cabelInCombik();
        james.turnVolume();
        james.turnDistortion();
        james.takeMicrophone(sure);
        System.out.printf("%n");

        kirk.takeGuitar(esp);
        kirk.cabelInGuitar();
        kirk.takeTuner(tuner);
        kirk.turnOn();
        kirk.connectToGuitar();
        kirk.tuning("");
        kirk.turnOff();
        kirk.cabelInCombik();
        kirk.turnVolume();
        kirk.turnDistortion();
        System.out.printf("%n");

        robert.takeGuitar(warwick);
        robert.cabelInGuitar();
        robert.takeTuner(tuner);
        robert.turnOn();
        robert.connectToGuitar();
        robert.tuning("");
        robert.turnOff();
        robert.cabelInCombik();
        robert.turnVolume();
        robert.turnDistortion();
        System.out.printf("%n");

        lars.takeDrums(tama);
        lars.takeSticks();
        System.out.printf("%n");

        kirk.playing();
        robert.playing();
        lars.startPlaying();
        james.playing();
        james.sing();
    }
}
