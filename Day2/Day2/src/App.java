import java.io.BufferedReader;
import java.io.FileReader;


public class App {
    public static void main(String[] args) throws Exception {
        /*
            Part 1 Instructions:
                A is rock
                B is paper
                C is scissors
                X is rock = 1
                Y is paper = 2
                Z is scissors = 3
                Win is 6 
                Draw is 3
                Lose is 0
        */

        /*
            Part 2 Instructions:
                A is rock
                B is paper
                C is scissors
                Rock = 1
                Paper = 2
                Scissors = 3
                X is lose = 0
                Y is draw = 3
                Z is win = 6
        */

        BufferedReader br = new BufferedReader(new FileReader("Day2/Day2/input/day2.txt"));
        String line;
        int points =0;

    
        while((line=br.readLine())!=null){
        
            String lRPS = line.trim();
            switch(lRPS){
                case "A X":
                    points += 3;//lose and scissors
                    break;
                case "A Y":
                    points += 4;//draw and rock
                    break;
                case "A Z":
                    points += 8;//win and paper
                    break;
                ///////////////////////////////////////////////////////////////////////////
                case "B X":
                    points += 1;//lose and rock
                    break;
                case "B Y":
                    points += 5;//draw and paper
                    break;
                case "B Z":
                    points += 9;//win and scissors
                    break;
                ///////////////////////////////////////////////////////////////////////////
                case "C X":
                    points += 2;//lose and paper
                    break;
                case "C Y":
                    points += 6;//draw and scissors
                    break;
                case "C Z":
                    points += 7;//win and rock
                    break;
            }
            
        }


        System.out.println(points);
       
    }

    
}
