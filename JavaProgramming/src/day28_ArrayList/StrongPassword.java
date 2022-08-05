package day28_ArrayList;

public class StrongPassword {

    public static void main(String[] args) {

        String password = "Cydeo1990@";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;//has uppercase letter
        boolean r3 = false;//has lowercase letter
        boolean r4 = false;//has special character
        boolean r5 = false;//has digit

        char[] chars = password.toCharArray();

        for (char each : chars) {
            if (Character.isUpperCase(each)){
                r2 = true;
            }else if (Character.isLowerCase(each)){
                r3 = true;
            }else if (Character.isDigit(each)){
                r5 = true;
            }else {
                r4 = true;
            }
        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;

        System.out.println("isStrongPassword = " + isStrongPassword);
        System.out.println(isStrongPassword("Cydeo1990@"));


    }

    public static boolean isStrongPassword(String password){

        String password2 = "Cydeo1990@";

        boolean r1 = password2.length() >= 8 && !password2.contains(" ");
        boolean r2 = false;//has uppercase letter
        boolean r3 = false;//has lowercase letter
        boolean r4 = false;//has special character
        boolean r5 = false;//has digit

        char[] chars = password2.toCharArray();

        for (char each : chars) {
            if (Character.isUpperCase(each)){
                r2 = true;
            }else if (Character.isLowerCase(each)){
                r3 = true;
            }else if (Character.isDigit(each)){
                r5 = true;
            }else {
                r4 = true;
            }
            /*
            if (r2 &&r3 &&r4 &&r5);
            break;

             */
        }

        boolean isStrongPassword2 = r1 && r2 && r3 && r4 && r5;

        return isStrongPassword2;


    }

}
/*
1.Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
        1.1 Password must be at least have 8 characters long, and should not contain space
        1.2 PassWord should at least contain one upper case letter
        1.3 PassWord should at least contain one lower case letter
        1.4 Password should at least contain one special characters
        1.5 Password should at least contain a digit
 */