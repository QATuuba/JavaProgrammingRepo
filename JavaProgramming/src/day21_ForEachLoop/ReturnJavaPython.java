package day21_ForEachLoop;

public class ReturnJavaPython {

    public static void main(String[] args) {

        String sentence = "java java python python java python";
        String[] words = sentence.split(" ");
        int countJava = 0;
        int countPython = 0;

        for (String each : words) {
            if (each.equals("java")){
                countJava++;
            } else if (each.equals("python")) {
                countPython++;
            }
        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);
    }

}
/*
Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
 */