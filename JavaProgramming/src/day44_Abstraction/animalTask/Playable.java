package day44_Abstraction.animalTask;

public interface Playable {

    /*static*/ boolean isFriendly = true;//static and final by default

    public static void method1(){
        System.out.println(isFriendly);
    }

    /*public abstract*/ void play();//These are given by default

}
