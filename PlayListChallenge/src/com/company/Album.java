package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
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
        if (findSong(titleOfSong) == null) {
            Song song = new Song(titleOfSong, durationOfSong);
            this.songs.add(song);
            return true;
        } else {
            return false;
        }
    }

    public boolean addToPlayList(String nameOfSong, LinkedList<Song> playList){
        Song checkedSong = findSong(nameOfSong);
        if (checkedSong != null) {
            playList.add(checkedSong);
            System.out.println("Song: " + nameOfSong + " added successfully ");
            return true;
        }
        System.out.println("This song: " + nameOfSong + " is not in the album");
        return false;
    }

    private Song findSong(String titleOfSong) {
        for (Song song: this.songs){
            if (song.getTitle().equals(titleOfSong)){
                return song;
            }
        }
        return null;
    }



    public void printSongs(){
        for (Song song: this.songs){
            System.out.println("Songs in this album are : " + song.getTitle());
        }
    }

}