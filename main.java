import java.util.Scanner;


class Main {
    public static void main(String[] args) {
  
        mF2(5);
    }
    static String mF(){
        return "Methods are my friend";
    }

    /*Write a method that takes in a number as a parameter and, based on that number, prints out Methods are my friend that number of times.
    */
    static void mF2(int a){
        for (int i = 0; i < a; i++) {
            System.out.println("Methods are my friend");
        }
    }
    /* Write a method that takes in a letter and returns whether or not that letter is a vowel.
    */
    static String vowel(String a){
        return "This is a vowel";
    }


}
