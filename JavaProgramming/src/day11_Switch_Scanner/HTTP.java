package day11_Switch_Scanner;

public class HTTP {

    public static void main(String[] args) {

        int statusCode = 200;
        String result = "";

        switch (statusCode){

            case 200:
                result = "OK";
                break;

            case 201:
                result = "Created";
                break;

            case 202:
                result = "Accepted";
                break;

            case 301:
                result = "Move Permanently";
                break;

            case 303:
                result = "See Other";
                break;

            case 304:
                result = "Noy Modofied";
                break;

            case 307:
                result = "Temporary Redirect";
                break;

            case 400:
                result = "Bad Request";
                break;

            case 401:
                result = "Unauthorised";
                break;

            case 403:
                result = "Forbidden";
                break;

            case 404:
                result = "Not Found";
                break;

            case 410:
                result = "Gone";
                break;

            case 500:
                result = "Internal Server Error";
                break;

            case 503:
                result = "Service Unavailable";
                break;

            default:
                result = "Invalid";

        }

        System.out.println(result);

    }

}
