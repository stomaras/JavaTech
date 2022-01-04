package com.example.test;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("8 mile", "Eminem");
        album.addSong("Lose Yourself", 5.64);
        album.addSong("MockingBird", 4.56);
        album.addSong("Rap God", 7.00);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Lose Yourself", playList);
        albums.get(0).addToPlayList(45, playList);
        albums.get(0).addToPlayList(2, playList);
        albums.get(0).addToPlayList(1, playList);
    }
}
