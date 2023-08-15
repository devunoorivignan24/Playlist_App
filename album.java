import java.util.*;
public class album {
    private String name;
    private String artist;
    private List<Song> songs;

    public album() {
    }

    public album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
    //functionalities 1. finding a song

    public boolean findSong(String title){
        for (Song song:songs){
            if(song.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }
    //adding a song to an album
   public String addSongToAlbum(String title,double duration){
        if(!findSong(title)){
            Song s=new Song(title,duration);
            this.songs.add(s);
            return "song has been added successfully";
        }
        return "song is already present";

    }
    //adding the song based on the song number
    public String addSongToPlaylist(String title,LinkedList<Song> playlist){
        for(Song song:songs){
            if(song.getTitle().equals(title)){
                playlist.add(song);
                return "song has been added successfully";
            }
        }
        return "song is not present in the album";
    }

    public String addSongToPlaylist(int songNo,LinkedList<Song> playlist){
        int index=songNo-1;
        while(index>=0 && index<songs.size()){
            playlist.add(songs.get(index));
            return "song has been added successfully";
        }
        return "incorrect song number";
    }


}
