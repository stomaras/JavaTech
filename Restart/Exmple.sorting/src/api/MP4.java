package api;

import myutility.MyUtils;

import java.util.ArrayList;
import java.util.Collections;

public class MP4 {

    public static void main(String[] args) {

        Song song1 = new Song("Lose Yourself", "Eminem", 2002);
        Song song2 = new Song("Rap God", "Eminem", 2010);
        Song song3 = new Song("Till I Collapse", "Eminem", 2008);
        Song song4 = new Song("Mockingbird", "Eminem", 2004);

        ArrayList<Song> musicList = new ArrayList<>();
        musicList.add(song1);
        musicList.add(song2);
        musicList.add(song3);
        musicList.add(song4);

        MyUtils.iterateList(musicList);
        System.out.println("======================");
        Collections.sort(musicList);


    }
}
