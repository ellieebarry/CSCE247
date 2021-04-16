package AdapterDesignPattern;

import java.util.*;

/**
 * Class that creates a Cassett from AnalogAlbum
 * @author Eleanor Barry
 */

public class Cassett implements AnalogAlbum {

    private ArrayList<String> songs;
    private int currentIndex;

    /**
     * Constructor method
     * @param song1 to add to array list
     * @param song2 to add to array list
     * @param song3 to add to array list
     * @param song4 to add to array list
     * @param song5 to add to array list
     */
    public Cassett(String song1, String song2, String song3, String song4, String song5) {
        songs = new ArrayList<String>(5);
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);

        currentIndex = 0;
    }

    /**
     * Method that plays the current song and moves index to next song
     * @return String
     */
    public String play() {
        currentIndex++;
        return "Playing song " + (currentIndex) + ": " + songs.get(currentIndex - 1);
    }

    /**
     * Method that goes back one song
     * @return String
     */
    public String rewind() {
        if (currentIndex == 0) {
            return "Fully Re-Wound";
        } else {
            currentIndex--;
            return "rewinding to song " + (currentIndex + 1);
        }
    }

    /**
     * Method that goes forward one song
     * @return String
     */
    public String ffwd() {
        if (currentIndex == 4) {
            return "At the end of the cassett you need to rewind";
        } else if (currentIndex == 3) {
            currentIndex++;
            return "Forwarded to the end of the cassett";
        } else {
            currentIndex++;
            return "Forwarding to song " + (currentIndex + 1);
        }
    }

    /**
     * Method that pauses the current song
     * @return String
     */
    public String pause() {
        return "Pausing...";
    }

    /**
     * Method that stops the current song
     * @return String
     */
    public String stopEject() {
        return "Stopping cassett and ejecting";
    }

}
