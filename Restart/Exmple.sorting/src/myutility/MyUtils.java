package myutility;

import java.util.ArrayList;

public class MyUtils {

    public static <T> void iterateList(ArrayList<T> integerList) {
        for (T temp : integerList) {
            System.out.println(temp);
        }
    }




}
