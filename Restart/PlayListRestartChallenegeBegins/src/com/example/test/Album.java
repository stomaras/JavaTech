package com.example.test;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String titleOfSong, double durationOfSong) {
        return this.songs.add(new Song(titleOfSong, durationOfSong));
    }

    public boolean addToPlayList(String titleOfSong, LinkedList<Song> playList) {
        Song song = this.songs.findSong(titleOfSong);
        if (song != null) {
            playList.add(song);
            System.out.println("New Song added in playList with name: " + song.getTitle());
            return true;
        }
        System.out.println("Song with name : " + song.getTitle() + " does not exist in album ");
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song song = this.songs.findSong(trackNumber);
        if (song != null){
            playList.add(song);
            System.out.println("Song with track number : " + trackNumber + " added to play List");
            return true;
        }
        System.out.println("Song with track number : " + trackNumber + " does not exist in the album");
        return false;
    }



    private class SongList {

        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean add(Song song) {
            Song newSong = findSong(song.getTitle());
            if (newSong != null) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        public Song findSong(String titleOfSong) {
            for (int i = 0; i < this.songs.size(); i++) {
                Song checkedSong = this.songs.get(i);
                if (checkedSong.getTitle().equals(titleOfSong)){
                    return checkedSong;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber) {
            int index = trackNumber -1;
            if (index >= 0 && (index < this.songs.size())) {
                return this.songs.get(trackNumber);
            }
            return null;
        }
    }

}
