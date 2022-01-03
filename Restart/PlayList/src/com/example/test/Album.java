package com.example.test;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public boolean addSong(String titleOfSong, double durationOfSong) {
        if ( findSong(titleOfSong) == null) {
            this.songs.add(new Song(titleOfSong, durationOfSong));
            System.out.println("Song with name: " + titleOfSong + " added successfully");
            return true;
        }
        System.out.println("Song with name: " + titleOfSong + " already exists ");
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            System.out.println("Song with name: " + title + " added to playList");
            return true;
        }
        System.out.println(" The song " + title + " is not in the album");
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index < this.songs.size())){
            playList.add(this.songs.get(index));
            System.out.println("Song with name : " + this.songs.get(index).getTitle() + " added to playList");
            return true;
        } else {
            System.out.println("Song with track number " + trackNumber + " does not exist in this album");
            return false;
        }

    }

    public Song findSong(String titleOfSong) {
        for (Song checkedSong: this.songs) {
            if (checkedSong.getTitle().equals(titleOfSong)){
                return checkedSong;
            }
        }
        return null;
    }
}
