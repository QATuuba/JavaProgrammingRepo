package day14_String;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";

        //domain:

        int beginningIndex = email.indexOf("@")+1;
        //int beginningIndex = email.indexOf("g")
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex, endingIndex);

        System.out.println(domain);

        System.out.println("_______________________");

        String str1 = "Java is fun, Java is cool, I love Java";
        //             1234567891011

        String s1 = str1.substring(0, 10+1); // Java is fun
        System.out.println("s1 = " + s1);

        int beg = str1.indexOf(" J");
        int end = str1.lastIndexOf(",");
        String s2 = str1.substring(beg, end);//Java is cool

        System.out.println("s2 = " + s2);

        String s3 = str1.substring(  str1.lastIndexOf("I")  );//I love Java
        System.out.println("s3 = " + s3);

    }

}
