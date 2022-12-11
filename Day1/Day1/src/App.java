import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int cal = 0;
        int maxCal = 0;
        List<Integer> calorieList = new ArrayList<>();//part2

        BufferedReader br = new BufferedReader(new FileReader("Day1/Day1/input/day1.txt"));
        String line;
        while((line=br.readLine())!=null){
            String lCal = line.trim();
            if(lCal.isBlank()){
                calorieList.add(cal);//part2
                if(maxCal<cal){
                    
                    maxCal=cal;
                }
                cal =0;

            }else{
                cal+=Integer.parseInt(lCal);
            }
            
            
           
        }

        
        System.out.println(maxCal);
        calorieList.sort((a,b) -> b-a);

        System.out.println(calorieList.get(0)+calorieList.get(1)+calorieList.get(2));

    }
}
