
/*
Takes judges inputs and provides the score for a competitive dive
Unit 2Problem 2
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 22 Aug 2016
*/

import java.util.Scanner;

public class U2_Problem2
{
    private static Scanner kb = new Scanner(System.in);

    private static double[] scores = {
        0, 0, 0, 0, 0, 0, 0 //place holders for 7 judges
    };

    private static double inputValidScore(int judge_number){
        //Prompts for, gathers and returns a valid judge score for inputAllScores()
        System.out.println("Input the score for judge " + judge_number);
        double score;
        do {
            System.out.println("Valid score is between 0 and 10");
            score = kb.nextDouble();
            String bad = kb.nextLine();
        } while((score < 0) || (score > 10));
        return score;
    }

    private static void inputAllScores(){
        //loop that collects using inputValidScores() method
        int num_judges = 7;
        double value;
        for(int i = 1; i <= 7; i++){
            value = inputValidScore(i);
            scores[i-1] = value;
        }
    }

    private static double inputValidDegreeOfDifficulty(){
        //collects the degree of difficulty, validates it and returns it
        System.out.println("Input the degree of difficulty from the dive.");
        double difficulty;
        do{
            System.out.println("Input a value between 1.2 and 3.8:");
            difficulty = kb.nextDouble();
            String bad = kb.nextLine();
        } while ((difficulty > 3.8) || (difficulty < 1.2)); 
        return difficulty;
    }

    private static double calculateScore(double difficulty){
        //calculates the score based on inputs
        //Score is calculated like this: 7 scores taken, highest and lowest thrown out
            //sum of remaining 5 is multiplied by degree of difficulty between 1.2 and 3.8
            //total is multiplied by .6 to get final score
        double high = 0.0;
        double low = 10.0;
        double total = 0.0;
        for (double score : scores){
            if (score > high){
                high = score;
            }
            if (score < low){
                low = score;
            }
            total += score;
        }
        total -= (low + high);
        double intermediate_score = total * difficulty;
        double final_score = intermediate_score * 0.6;
        final_score = (int)(final_score*100);
        final_score = (double)(final_score/100.0);
        return final_score;
    }

	public static void main(String[] args)
	{
        System.out.println("Wow, that was a great dive. Time to judge --");
		double difficulty = inputValidDegreeOfDifficulty();
	    inputAllScores();
        double final_score = calculateScore(difficulty);
        System.out.println("The Judges have spoken, the final score is: " + final_score);
	}
}
