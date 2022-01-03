package com.example.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        ArrayList<Album> albums = new ArrayList<>();

        Album eminem = new Album("8 mile", "Eminem");
        Album nirvana = new Album("Nirvana", "Curt Cobain");

        LinkedList<Song> playList = new LinkedList<>();

        eminem.addSong("Lose Yourself", 5.65);
        eminem.addSong("Rap God" , 6.65);
        eminem.addSong("MockingBird", 4.43);
        System.out.println("---------------------------------------------");

        nirvana.addSong("Smells Like Teen Spirit", 4.43);
        nirvana.addSong("Where did you sleep last night", 3.32);
        System.out.println("---------------------------------------------------");

        addAlbums(albums,eminem);
        addAlbums(albums,nirvana);

        addToPlayList(playList,albums);


//        System.out.println("--------------------------------------------");
//        albums.get(0).addToPlayList(1, playList);
//        albums.get(0).addToPlayList(2,playList);
//        albums.get(0).addToPlayList(3, playList);
//        albums.get(0).addToPlayList(4,playList);
//        System.out.println("----------------------------------------------");
//        albums.get(1).addToPlayList("Smells Like Teen Spirit", playList);
//        albums.get(1).addToPlayList("Where did you sleep last night", playList);
//        System.out.println("------------------------------------------------------");
        play(playList);

    }

    private static ArrayList<Album> addAlbums(ArrayList<Album> albums, Album album){
        albums.add(album);
        return albums;
    }

    private static void addToPlayList(LinkedList<Song> playList, ArrayList<Album> albums) {

        for (int i = 0; i < albums.size(); i++) {
            Album album = albums.get(i);
            for (int j = 0; j < album.getSongs().size(); j++ ) {
                albums.get(i).addToPlayList(j+1, playList);
            }
            System.out.println("-------------------------------");
        }
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        int action;
        ListIterator<Song> listIterator = playList.listIterator();
        System.out.println("My PlayList Songs: \n");
        if (playList.size() == 0){
            System.out.println("No Songs added to playList");
        } else {
            System.out.println("Now Playing: " + listIterator.next().toString());
        }
        System.out.println("--------------------------------------------------------------");

        while (!quit) {
            System.out.println("-----------------------\n");
            printMenu();
            System.out.println("-----------------------\n");
            action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("PlayList Complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward){
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached end of the play list!");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playList");
                        forward = true;
                    }
                    break;
                case 3:
                    printList(playList);
                    break;
                case 4:
                    printMenu();
                    break;
            }
        }
    }

    private static void printList(LinkedList<Song> playList){
        ListIterator<Song> listIterator = playList.listIterator();
        System.out.println("==============================================");
        System.out.println("My Play List Songs: \n");
        System.out.println("============================================");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("============================================");
    }

    private static void printMenu(){
        System.out.println("Press 0: exit from the program\n"+
                "Press 1 : go forward song in playList\n" +
                "Press 2 : go previous song in playList\n" +
                "Press 3 : print the available songs in the playList\n" +
                "Press 4 : see available options"
        );

    }



}

/*
LinkedList vs ArrayList

- both are implementation of List Interface
- Differences:
                1)
                - Dynamic Array -> Implementation of ArrayList,
                - Double LinkedList -> Implementation of LinkedList

                2)
                - in ArrayList is time consuming to add elements , remove elements
                - an element have 2 nodes next node and previous node in LinkedList,
                  not time consuming, not affect num of nodes after that if we insert
                  something forward or previous

                3)
                Fetch Values case:
                
                - in case of searching ArrayList is quick
                - in case of searching LinkedList become slow




 */
























