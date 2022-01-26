package com.song.mycomparators;

import api.Song;

import java.util.Comparator;

public class ArtistNameComparator implements Comparator<Song> {

    @Override
    public int compare(Song song1, Song song2) {

        // By default String class compareTo() method will sort
        // everything in ascending order, but i want descending order
        // so i put minus here.
        return song1.getArtist().compareTo(song2.getArtist());
    }
}
