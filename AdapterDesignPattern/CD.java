package AdapterDesignPattern;
import java.util.*;

public class CD implements DigitalAlbum {
    
    private ArrayList<String> songs;
    private int currentIndex;

    public CD(String song1, String song2, String song3, String song4, String song5) {
        songs = new ArrayList<String>(5);
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);

        currentIndex = 0;
    }

    public String playFromBeginning() {
        currentIndex = 1; //advances it to next song
        return "Playing song 1: " + songs.get(0);
    }

    public String playSong(int num) {
        if(songs.get(num) != null) {
            currentIndex = num + 1;
            return "Playing song " + num + ": " + songs.get(num);
        } else {
            return "Not a valid song number";
        }
    }

    public String prevSong() {
        if(currentIndex != 0) {
            currentIndex--;
        }
        return "Skipping back and playing: " + songs.get(currentIndex);
    }

    public String nextSong() {
        if(currentIndex == 4) {
            currentIndex = 0;
        } else {
            currentIndex++;
        }
        return "Playing: " + songs.get(currentIndex);
    }

    public String stop() {
        currentIndex = 0;
        return "Stopping cassett and ejecting";

    }

    public String pause() {
        return "Pausing...";
    }

}
