package dev.lpa.NestedClassesAndTypes.Exercise_Playlist;

import dev.lpa.LinkedListLesson.Exercise.Song;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String song, double duration){
        if(findSong(song) == null){
            songs.add(new Song(song, duration));
            return true;
        }
        System.out.println(song + " is already in " + this.name);
        return false;
    }

    private Song findSong(String title){
        for(Song s : songs){
            if(s.getTitle().equalsIgnoreCase(title)){
                return s;
            }
        }
        return null;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        // get the Song instance with the given title
            Song song = findSong(title);
            // song must be in the album first
            if(song != null){
                // in case of duplication
                if(playlist.contains(song)){
                    System.out.println(title + " is already in the Playlist.");
                    return false;
                }
                playlist.add(song);
                return true;
            }
            if(song == null){
                System.out.println(title + " was not found in the album " + this.name + ".");
            }
        return false;
    }

    public boolean addToPlayList(int track, LinkedList<Song> playlist){
        int index = track - 1;
        if(index < songs.size() && index >= 0){
            String title = songs.get(index).getTitle();
            return addToPlayList(title, playlist);
        }
        System.out.println("\"" +this.name + "\"" + " album has no track " + track + ".");
        return false;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", songs=" + songs +
                '}';
    }
}
