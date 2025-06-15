// Music Player App

class Song{
    public String title;
    protected String artist;
    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public void play(){
        System.out.println("Playing song: "+ title + " by " + artist);
    }
}

class PopSong extends Song{
    public PopSong(String title, String artist){
        super(title,artist);
    }
    @Override
    public void play(){
        System.out.println("Pumping the pop vibes: " + title + " by " + artist);
    }
}

class RockSong extends Song {
    public RockSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    public void play() {
        System.out.println("Rocking out to: " + title + " by " + artist );
    }
}

class JazzSong extends Song{
    public JazzSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    public void play() {
        System.out.println(" Smooth jazz playing: " + title + " by " + artist );
    }
}

public class MusicApp{
    public static void main(String[] args){
         Song[] playlist = new Song[3];

        playlist[0] = new PopSong("Blinding Lights", "The Weeknd");
        playlist[1] = new RockSong("Bohemian Rhapsody", "Queen");
        playlist[2] = new JazzSong("Take Five", "Dave Brubeck");

        // Play each song
        System.out.println("Now Playing from Playlist:\n");
        for (Song song : playlist) {
            song.play();
            System.out.println("-------------------------------------------------");
        }
    }
}