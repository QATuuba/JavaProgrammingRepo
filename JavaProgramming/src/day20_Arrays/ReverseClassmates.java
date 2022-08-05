package day20_Arrays;

public class ReverseClassmates {

    public static void main(String[] args) {

        String[] names = {"Tugba", "Zeliha", "Zuleyha", "Senem", "Meryem", "Suleyman", "Khurshid", "Tarik", "Alper", "Ilhan"};

        for (int i = 0; i < names.length; i++) {

            StringBuilder sb = new StringBuilder(names[i]);
            System.out.println(sb.reverse());
        }

    }

}
