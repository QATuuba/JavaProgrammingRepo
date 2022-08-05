package day12_Scanner;

public class GradeLevel {

    public static void main(String[] args) {

        int number = 10;

        switch (number){

            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Elementary School");
                break;

            case 6: case 7: case 8:
                System.out.println("Middle School");
                break;

            case 9: case 10: case 11: case 12:
                System.out.println("High School");
                break;

            case 13: case 14: case 15:
                System.out.println("Collage");
                break;

            case 16: case 17: case 18:
                System.out.println("Grad School");
                break;

            default:
                System.out.println("Invalid");

        }

        System.out.println("________________________");

        String result = "";

        if(number>= 1 && number <= 18){  // 1 ~ 18
            switch (number){ // 1 ~ 18:  case: 6~18,  default: 1~5
                case 6: case 7: case 8:
                    result = "Middle school";
                    break;
                case 9: case 10: case 11: case 12:
                    result = "High school";
                    break;
                case 13: case 14: case 15: case 16:
                    result = "College";
                    break;
                case 17: case 18:
                    result = "Grad School";
                    break;
                default: // 1~5
                    result = "Elementary school";
            }
        }else{
            result = "Invalid Grade Level";
        }

        System.out.println(result);

    }

}
