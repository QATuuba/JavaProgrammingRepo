package day11_Switch_Scanner;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        String size = "";
        double price = 4.29;
        int calories = 150;

        if ((price == 3.69 && calories == 90) || (price == 3.99 && calories == 120) || (price == 4.29 && calories == 150)) {

            size = (price == 3.69 && calories == 90) ? "tall" : (price == 3.99 && calories == 120) ? "grande" : "venti";

        } else {
            System.out.println("Invalid");
        }

        System.out.println(size);

        System.out.println("____________________________");

        switch (size) {

            case "tall":
                price = 3.69;
                calories = 90;
                break;

            case "grande":
                price = 3.99;
                calories = 120;
                break;

            case "venti":
                price = 4.29;
                calories = 150;
                break;

            default:
                System.out.println("Invalid");

        }

        System.out.println(size);

        System.out.println("_________________________");

        if ((price == 3.69 && calories == 90) || (price == 3.99 && calories == 120) || (price == 4.29 && calories == 150)) {

            switch (size) {

                case "tall":
                    price = 3.69;
                    calories = 90;
                    break;

                case "grande":
                    price = 3.99;
                    calories = 120;
                    break;

                default:
                    size = "venti";


            }

        } else {
            System.out.println("Invalid");
        }

        System.out.println(size);

    }

}
