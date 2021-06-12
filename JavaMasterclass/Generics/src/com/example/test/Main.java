package com.example.test;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Generics allow us to create classes interfaces and methods that take type
        // as parameters called type parameters.
        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer tom = new FootballPlayer("Tom");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Becjham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        Team<FootballPlayer> adelaideNY = new Team<>("Adelaide NY");
        adelaideNY.addPlayer(tom);
        //adelaideCrows.addPlayer(pat);
        //adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> chicago_cubs = new Team<>("Chicago Cubs");
        chicago_cubs.addPlayer(pat);

        adelaideCrows.matchResult(adelaideNY, 0, 1);

        // !!! Note !!!
        // There are some problems here and at the moment the type parameter
        // T, in our team class can be applied, or can be supplied rather, any type,
        // except primitive types such as int, so in other words, any object.
        // So what we really need is some sort of way to validate the type of class
        // actually when we are using it for this team. So in other words the ability to
        // restrict the type that can be provided for this T argument from the T from
        // the team class.

        // !!! Note !!!
        // You can create instances of a class that implement an interface,
        // and then you can ensure that the interface methods you implement
        // act on a specific type of object or objects.

        // !!! Note !!!
        // public class Team<T extends Player & Coach & Manager>
        // You can only have one class, so these two here with this
        // scenario will actually have to be interfaces.
        // So this is the syntax if you want to use multiple bounds
        // So you put the player, in this case the class first,
        // then you actually put the interfaces after that if you wanted
        // to do that.


    }

}
