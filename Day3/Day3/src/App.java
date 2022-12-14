import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("Day3/Day3/input/day3.txt"));
       
        String line;
        int sum=0;
        Set<Character> characters1 = new TreeSet<Character>();
        Set<Character> characters2 = new TreeSet<Character>();
        Set<Character> characters3 = new TreeSet<Character>();

        int tracker = 1;

        while((line=br.readLine())!=null){
            
            for(int i=0;i<line.length();i++){
                char c = line.charAt(i);
                if(tracker%3==1){
                  
                    characters1.add(c);
                }else if(tracker%3==2){
                    
                    characters2.add(c);
                }else{
                    
                    characters3.add(c);
                }
              
            }

            
            if(tracker%3==0){
                characters1.retainAll(characters2);
                characters1.retainAll(characters3);
                Iterator val = characters1.iterator();
    
                char ch = (char) val.next();
                
                if(ch>96){
                    sum+=(ch-96);
                }else{
                    sum+=(ch-38);
                }

                characters1.clear();
                characters2.clear();
                characters3.clear();
            }
            tracker++;

            
            
        }

        System.out.println(sum);
    }
}
