package day20_Arrays;

public class Grade {

    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] >= 90 && scores[i] <= 100){
                grades[i] = 'A';
            } else if (scores[i] >= 80 && scores[i] < 90) {
                grades[i] = 'B';
            } else if (scores[i] >= 70 && scores[i] < 80) {
                grades[i] = 'C';
            }

            String result = names[i] + "'s score is " + scores[i] + ", and grade is " + grades[i];
            System.out.println(result);
        }

    }

}
