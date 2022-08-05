package day15_ForLoop;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String str = "";//" " olursa arada space oldugu icin empty olmaz.blank olur, sadece "" empty ve blank olur. "            " olursa yine blank olur


        boolean r = str.isEmpty();

        System.out.println(r);

        boolean r1 = str.isBlank();

        System.out.println(r1);

        String str2 = "Cydeo     ";
        System.out.println(str2.isBlank());

        System.out.println("_________________________");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        //Yes,YES,yEs,YEs.....

        System.out.println("yEs".equals("Yes"));//false
        System.out.println("yEs".equalsIgnoreCase("Yes"));//true

        System.out.println("_____________________________");
        String sentence = "My favourite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        System.out.println(hasCSharp);//false

        boolean hasJava = sentence.contains("Java");
        System.out.println(hasJava);//true

        boolean hasJava2 = sentence.contains("java");
        System.out.println(hasJava2);//false

        boolean hasJava3 = sentence.toLowerCase().contains("java"); // true
        System.out.println(hasJava3);

        boolean r3 = sentence.contains("java") || sentence.contains("Java");
        System.out.println(r3);//true

        System.out.println("__________________");
        String input1 = "I love jAvA";
        String input2 = "Java";

        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase(input2));//false

        System.out.println(input1.contains("Java"));//false

        System.out.println(input1.toLowerCase().contains("java"));//true
        System.out.println(input1.toUpperCase().contains("JAVA"));//true

        System.out.println("_____________________");
        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");
        System.out.println(x);//true

        boolean y = a.startsWith("oo");
        System.out.println(y);//false

        boolean z = a.endsWith("Spoon");
        System.out.println(z);//true

        boolean b = a.startsWith("wooden");
        System.out.println(b);//false

        boolean c = a.toLowerCase().startsWith("wooden");
        // in order to ignore the case sensitivity we first create the lower case/upper case version of string and then compare it with lowercase/uppercase



    }

}
