import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        int cal = 0;
        int maxCal = 0;
    

        BufferedReader br = new BufferedReader(new FileReader("Day1/Day1/input/day1.txt"));
        String line;
        while((line=br.readLine())!=null){
            String lCal = line.trim();
            if(lCal.isBlank()){
                
                if(maxCal<cal){
                    
                    maxCal=cal;
                }
                cal =0;

            }else{
                cal+=Integer.parseInt(lCal);
            }
            
            
           
        }
        System.out.println(maxCal);

    }
}
