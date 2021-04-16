package AdapterDesignPattern;
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
        return "Playing song " + (currentIndex+1) + ": " + songs.get(currentIndex);
    }

    public String rewind() {
        if(currentIndex == 0) {
            return "Fully Re-Wound";
        } else {
            currentIndex--;
            return "rewinding to song" + (currentIndex+1);
        }
    }

    public String ffwd() {
        if(currentIndex == 4) {
            return "At the end of the cassett you need to rewind";
        } else if(currentIndex == 3){
            currentIndex++;
            return "Forwarded to the end of the cassett";
        } else {
            currentIndex++;
            return "Forwarding to song " + (currentIndex+1);
        }
    }

    public String pause() {
        return "Pausing...";
    }

    public String stopEject() {
        return "Stopping cassett and ejecting";
    }

}
