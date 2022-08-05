package day11_Switch_Scanner;

public class NumberOfDays {

    public static void main(String[] args) {

        int month = 2;
        String result = "";
        int year = 2000;




        if (month >= 1 && month <= 12) {

            switch (month) {

                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    result = "31 days";
                    break;

                case 2:
                    result = (year % 4 == 0)? "29 days" : "28 days";
                    break;

                default:
                    result = "30 days";


            }


        } else {
            System.out.println("Invalid");
        }

        System.out.println(result);



    }

}
/*
28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12

			If(1~12){


			}else{
				Invalid
			}
 */