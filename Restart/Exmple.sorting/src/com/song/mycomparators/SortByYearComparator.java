package com.song.mycomparators;

import api.Song;

import java.util.Comparator;

public class SortByYearComparator implements Comparator<Song> {

    @Override
    public int compare(Song song, Song anotherSong) {

        // sort all the song object by the year in asc order

        if (song.getYear() > anotherSong.getYear()) {
            return 1;
        }

        if (song.getYear() < anotherSong.getYear()) {
            return -1;
        }

        return 0;
    }
}
