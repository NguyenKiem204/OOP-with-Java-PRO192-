import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nkiem
 */
 public class SongList extends TreeSet<Song>{
    public TreeSet<Song> songs;

    public SongList() {
        this.songs = new TreeSet<>();
    }

   
    public void addSong(Song song) {
        songs.add(song);
    }

    
    public Song getSongMaxDuration() {
        if (songs.isEmpty()) {
            return null; 
        }
        return songs.last(); 
    }

    
    public void printSongList() {
        for (Song song : songs) {
            System.out.println(song); 
        }
    }
}
