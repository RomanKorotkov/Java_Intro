package SongsList;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;

public class MusicPlayer implements Comparable<MusicPlayer> {
    String path;
    String artist;
    String album;
    String genre;
    String sub_genre;
    Type type;

    public MusicPlayer(String path, String artist, String album, String genre, String sub_genre, Type type) {
        this.path = path;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.sub_genre = sub_genre;
        this.type = type;
    }

    public void playMusic(String musicLocation){
        try{
            File musicPath = new File(musicLocation);
            if(musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);

                JOptionPane.showMessageDialog(null, "Pause");
                long clipTimePosition = clip.getMicrosecondPosition();
                clip.stop();

                JOptionPane.showMessageDialog(null, "Resume");
                clip.setMicrosecondPosition(clipTimePosition);
                clip.start();

                JOptionPane.showMessageDialog(null, "Stop");
            } else{
                System.out.println("Can't find file");
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }


    public void play() {
        System.out.printf("Band: %s Album: %s playing now", artist, album);
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "path='" + path + '\'' +
                ", band='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", genre='" + genre + '\'' +
                ", sub_genre='" + sub_genre + '\'' +
                ", type=" + type +
                '}';
    }

    public String getPath() {
        return path;
    }

    public MusicPlayer setPath(String path) {
        this.path = path;
        return this;
    }

    public String getArtist() {
        return artist;
    }

    public MusicPlayer setBand(String band) {
        this.artist = band;
        return this;
    }

    public String getAlbum() {
        return album;
    }

    public MusicPlayer setAlbum(String album) {
        this.album = album;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public MusicPlayer setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public String getSub_genre() {
        return sub_genre;
    }

    public MusicPlayer setSub_genre(String sub_genre) {
        this.sub_genre = sub_genre;
        return this;
    }

    public Type getType() {
        return type;
    }

    public MusicPlayer setType(Type type) {
        this.type = type;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MusicPlayer that = (MusicPlayer) o;

        if (!path.equals(that.path)) return false;
        if (!artist.equals(that.artist)) return false;
        if (!album.equals(that.album)) return false;
        if (!genre.equals(that.genre)) return false;
        if (!sub_genre.equals(that.sub_genre)) return false;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        int result = path.hashCode();
        result = 31 * result + artist.hashCode();
        result = 31 * result + album.hashCode();
        result = 31 * result + genre.hashCode();
        result = 31 * result + sub_genre.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public int compareTo(MusicPlayer o) {
        return Integer.parseInt(this.genre = o.genre);
    }

}
