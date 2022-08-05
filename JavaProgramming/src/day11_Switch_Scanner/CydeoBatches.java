package day11_Switch_Scanner;

public class CydeoBatches {

    public static void main(String[] args) {

        String batchType = "US morning";

        String result = "";

        if (batchType == "US morning" || batchType == "US evening" || batchType == "EU"){

            if (batchType == "US morning"){
                result = "Class times are 10-5 EST. M, T, Th, F.";
            } else if (batchType == "US evening") {
                result = "Class times are 7-10 EST. M, T, W, Th, S, S.";
            }else {
                result = "Class times are  10-5 EST. M, T, W, Th, F.";
            }

        }else {
            result = "Invalid Batch";
        }

        System.out.println(result);

        System.out.println("________________________-");

        switch (batchType){

            case "US morning":
                result = "Class times are 10-5 EST. M, T, Th, F.";
                break;

            case "US evening":
                result = "Class times are 7-10 EST. M, T, W, Th, S, S.";
                break;

            case "EU":
                result = "Class times are  10-5 EST. M, T, W, Th, F.";
                break;

            default:
                result = "Invalid Batch";

        }

        System.out.println(result);

        System.out.println("________________________");

        if (batchType == "US morning" || batchType == "US evening" || batchType == "EU"){

            switch (batchType) {

                case "US morning":
                    result = "Class times are 10-5 EST. M, T, Th, F.";
                    break;

                case "US evening":
                    result = "Class times are 7-10 EST. M, T, W, Th, S, S.";
                    break;

                default:
                    result = "Class times are  10-5 EST. M, T, W, Th, F.";
                    break;

            }

        }else {
            result = "Invalid Batch";
        }

            System.out.println(result);

    }

}
