package day14_String;

public class StringMethod2 {

    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java" , "Python"); // "python is fun, I love learning Java"

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";

        email = email.replace("yahoo", "gmail");//gmail
        //email.replace("yahoo", "gmail"); yahoo

        System.out.println("email = " + email);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 =  sentence.replace("Python", "");//"Java Java C# C# C++ C++"
        sentence2 = sentence2.replace("   ", " ");
        System.out.println("sentence2 = " + sentence2);

        String s = "Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat");//"Cat ....."
        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace(" C#", " Java");//C# is fun, Java is cool
        System.out.println("s2 = " + s2);

        String s3 = "Java";
        s3 = s3.replace("a", "e");//"Jeve"
        System.out.println("s3 = " + s3);

        System.out.println("______________________");

        String result = "Java Java Java";
        //result = result.replace("Java", "Python");//Python Python Python
        result = result.replaceFirst("Java", "Python");//Python Java Java
        System.out.println("result = " + result);

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java");
        System.out.println("result2 = " + result2);

        String result3 = "Java";
        //result3 = result3.replaceFirst("va", "o");//Jao
        result3 = result3.replaceFirst("va", "vo");//Javo
        System.out.println("result3 = " + result3);



    }

}
