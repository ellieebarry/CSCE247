package AdapterDesignPattern;

/**
 * Class that adapts a CD to a cassett
 * @author Eleanor Barry
 */
public class AnalogAdapter implements AnalogAlbum {

    private DigitalAlbum album;

    /**
     * Constructor Method
     * @param album that will be converted
     */
    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }

    /**
     * Method that calls next song for the album
     * @return String
     */
    public String play() {
        return album.nextSong();
    }

    /**
     * Method that calls previous song for the album
     * @return String
     */
    public String rewind() {
        return album.prevSong();
    }

    /**
     * Method that calls next song for the album
     * @return String
     */
    public String ffwd() {
        return album.nextSong();
    }

    /**
     * Method that calls pause for the album
     * @return String
     */
    public String pause() {
        return album.pause();
    }

    /**
     * Method that calls stop for the album
     * @return String
     */
    public String stopEject() {
        return album.stop();
    }

}
