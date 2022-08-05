package day11_Switch_Scanner;

public class Elevator {

    public static void main(String[] args) {

        int floorNum = 2;
        String result = (floorNum == 1 || floorNum == 2 || floorNum == 3) ? (floorNum == 1) ?
                "Floor 1 selected. Companies: Lobby, Verizon, Sturbucks" : (floorNum == 2) ?
                "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
                : "Floor 3 selected. Companies: Lyft, BofA, Stake House" : "Invalid";

        System.out.println(result);

        System.out.println("_________________________");

        switch (floorNum) {

            case 1:
                result = "Floor 1 selected. Companies: Lobby, Verizon, Sturbucks";
                break;

            case 2:
                result = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                break;

            case 3:
                result = "Floor 3 selected. Companies: Lyft, BofA, Stake House";
                break;

            default:
                result = "Invalid";

        }

        System.out.println(result);

        System.out.println("__________________________");

        if (floorNum == 1 || floorNum == 2 || floorNum == 3) {

            switch (floorNum) {
                case 1:
                    result = "Floor 1 selected. Companies: Lobby, Verizon, Sturbucks";
                    break;

                case 2:
                    result = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                    break;

                default:
                    result = "Floor 3 selected. Companies: Lyft, BofA, Stake House";
                    break;
            }
        } else {
            result = "Invalid";
        }

        System.out.println(result);

    }

}
