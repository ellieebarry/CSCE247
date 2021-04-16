package AdapterDesignPattern;

import java.util.*;

/**
 * Class that creates a CD
 * @author Eleanor Barry
 */

public class CD implements DigitalAlbum {

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
    public CD(String song1, String song2, String song3, String song4, String song5) {
        songs = new ArrayList<String>(5);
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);

        currentIndex = -1;
    }

    /**
     * Method that plays first song and advances to next song
     * @return String
     */
    public String playFromBeginning() {
        currentIndex = 1; // advances it to next song
        return "Playing song 1: " + songs.get(0);
    }

    /**
     * Method that plays current song and advance to next song
     * @param num plays song at that number
     * @return String
     */
    public String playSong(int num) {
        if (songs.get(num) != null) {
            currentIndex = num + 1;
            return "Playing song " + currentIndex + ": " + songs.get(currentIndex - 1);
        } else {
            return "Not a valid song number";
        }
    }

    /**
     * Method that goes back one song
     * @return String
     */
    public String prevSong() {
        if (currentIndex != 0) {
            currentIndex--;
        }
        return "Skipping back and playing: " + songs.get(currentIndex);
    }

    /**
     * Method that goes forward one song
     * @return String
     */
    public String nextSong() {
        if (currentIndex == 4) {
            currentIndex = 0;
        } else {
            currentIndex++;
        }
        return "Playing: " + (currentIndex + 1) + ": " + songs.get(currentIndex);
    }

    /**
     * Method that stops song
     * @return String
     */
    public String stop() {
        currentIndex = 0;
        return "Stopping CD";

    }

    /**
     * Method that pauses song
     * @return String
     */
    public String pause() {
        return "Pausing...";
    }

}
