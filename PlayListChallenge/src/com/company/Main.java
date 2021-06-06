package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // PlayList
        // Create a program that implements a playlist of songs
        // To start you off implement the following classes
        // 1. Album
        // - it has three fields, two string s called name and artist, and an ArrayList that holds object of type
        //   Song called songs.
        // - A constructor that accepts two String s (name of the album and artist). It initialises the fields and
        //   instantiates songs.
        // - And three methods they are:
        //   - addSong(), has two parameters of type String(title of song), double(duration of song) and returns a boolean
        //     Return true if the song was added successfully or false otherwise.
        //   - findSong(), has one parameter of type String(title of song) and returns a Song. Returns the Song if it
        //     exists, null if it does not exists.
        //   - addToPlayList(), has two parameters of type int(track number of song in album) and LinkedList(the playlist)
        //     that holds objects of type Song, and returns a boolean. Returns true if it exists and it was added successfully
        //     using the track number, or false otherwise.
        //   - addToPlayList(), has two parameters of type String (title of the song) and LinkedList(the playList) that holds
        //     objects of type Song, and returns a boolean. Returns true if it exists and it was added successfully using
        //     the track number or false otherwise.
        // 2. Song
        // - it has two fields, a String called title and a double called duration.
        // - A constructor that accepts a String(title of the song) and a double(duration of the song). It initialises
        //   title and duration.
        // - And two methods, they are:
        //    - getTitle(), getter for title.
        //    - toString(), Song s overriding toString method. Returns a String in the following format: "title: duration"
        // TIP: In Album, use the findSong() method in addSong() and addToPlayList(String, LinkedList) to check if a song
        //      exists before proceeding
        // TIP: Be extremely careful with the spelling of the names of the fields , constructos and methods
        // TIP: Be extremely careful about spaces and spelling in the returned String from the toString() method

        ArrayList<Album> albums = new ArrayList<Album>();


        Album album = new Album("8 miles" , "Eminem");
        albums.add(album);
        album.addSong("Lose Yourself", 5.02);
        album.addSong("MockingBird", 4.30);
        album.addSong("I am not afraid", 5.0);
        System.out.println("Song's in Album: "+album.getName()+" are: ");
        album.printSongs();
        System.out.println("\n");
        Album album1 = new Album("Crazy World", "Scorpions");
        albums.add(album1);
        album1.addSong("Wind Of Change", 5.40);
        album1.addSong("No one like you", 3.55);
        album1.addSong("Rock you like a huriccance", 4.30);
        System.out.println("Song's in Album: "+album1.getName()+" are: ");
        album1.printSongs();
        ArrayList<Song> songs1 = album1.getSongs();

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("MockingBird", playList);
        albums.get(0).addToPlayList("Lose Yourself", playList);
        ListIterator<Song> list= playList.listIterator();
        while (list.hasNext()){
            System.out.println("Play : "
                    + list.next() + " from album: " + albums.get(0).getName());
        }

    }
}
