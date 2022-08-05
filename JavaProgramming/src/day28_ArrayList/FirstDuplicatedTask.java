package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicatedTask {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

        ArrayList<Integer> temp = new ArrayList<>();
        int frequency = 0;
        for (Integer each : list) {
            if (temp.contains(each)){
                break;
            }
            temp.add(each);
        }

        temp.retainAll(Arrays.asList(temp.get(temp.size()-1)));

        System.out.println(temp);

    }

}
