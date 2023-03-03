import java.util.Scanner;

public class BattingAverage {
    // In cricket, a player's batting average is the total number of runs they have
    // scored divided by the number of times they have been out
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int runs, innings, out;
        double average;
        System.out.println("Enter the number of Innings a player played");
        innings = input.nextInt();
        System.out.println("How much runs does the player made overall");
        runs = input.nextInt();
        System.out.println("How much time did he gets out");
        out = input.nextInt();
        if (out <= innings) {
            average = runs / out;
            System.out.println("The Batting Average is " + average);
        } else {
            System.out.println("The player cannot gets out more than the innings played by him." + "/n"
                    + "Enter the correct number of times the player gets out");
        }
        input.close();
    }
}
