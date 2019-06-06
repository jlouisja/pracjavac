import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Athlete disknee = new Athlete();
        disknee.fName = "Jasmine";
        disknee.lName = "Louis-Jacques";

        System.out.println("Athlete: " + disknee.fName + " " + disknee.lName);
        System.out.println("Points: " + disknee.points);
        System.out.println("Wins: " + disknee.wins);
        System.out.println("Losses: " + disknee.loss);
        System.out.println("Did you win? (y/n)");
        String winOrLose = scan.nextLine();
        if (winOrLose == "y") {
            Athlete.addWinPoints(disknee);
            System.out.println("Congratulations! Here is your updated profile -");
                    }
        System.out.println("That's okay. Better luck next time!");
        System.out.println("Athlete: " + disknee.fName + " " + disknee.lName);
        System.out.println("Points: " + disknee.points);
        System.out.println("Wins: " + disknee.wins);
        System.out.println("Losses: " + disknee.loss);


    }
}
class Athlete {
    String fName;
    String lName;
    int points;
    int wins;
    int loss;
    public Athlete(){
        points = 0;
        wins = 0;
        loss = 0;
    }
    public static void addWinPoints(Athlete ath){
        int pts = ath.points;
        int wpts =  pts + 5;
        ath.points = wpts;
    }
}