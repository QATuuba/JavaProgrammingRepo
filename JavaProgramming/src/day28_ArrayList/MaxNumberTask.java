package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxNumberTask {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        int max = Collections.max(list);
        System.out.println(max);

    }

}
