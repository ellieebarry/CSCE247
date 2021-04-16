import java.util.*;

public class Cassett implements AnalogAlbum{
    
    private ArrayList<String> songs;
    private  int currentIndex;

    public Cassett(String song1, String song2, String song3, String song4, String song5) {
        songs = new ArrayList<String>(5);
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);

        currentIndex = 0;
    }

    public String play() {

    }

    public String rewind() {

    }

    public String ffwd() {

    }

    public String pause() {

    }

    public String stopEject() {

    }

}
