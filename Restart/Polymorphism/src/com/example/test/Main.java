package com.example.test;

class Movie {
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws(){
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    // No plot method
}


public class Main {

    public static void main(String[] args) {
	// write your code here
        // Polymorphism is really the method or the mechanism in object oriented programming, that allows actions
        // to act differently based on the actual object thhat the action is being performed on.
        // I am going to create classes all whithin thia main public class, or this main.java source file.
        // Which is another way of creating classes that are not going to be reused. Is useful to create classes in the same
        // java source files if they are quite small and compact. I am going to create a base class called movie, and
        // then we are gonna create a number of classes that relate to a specific movie that's coming out of the pass.
        // I'm just gonna inherit from that. I'm gonna show you how polymorphism works.
        for (int i=1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");

        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }

        return null;
    }
}
