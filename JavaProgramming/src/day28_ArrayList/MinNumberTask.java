package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinNumberTask {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        int min = Collections.min(list);
        System.out.println(min);

    }

}
