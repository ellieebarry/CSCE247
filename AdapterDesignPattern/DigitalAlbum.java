package AdapterDesignPattern;

/**
 * Interface that creates a Digital Album
 * @author Eleanor Barry
 */

public interface DigitalAlbum {

    public String playFromBeginning();

    public String playSong(int num);

    public String prevSong();

    public String nextSong();

    public String stop();

    public String pause();

}
