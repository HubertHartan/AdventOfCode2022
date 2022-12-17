import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("Day4/Day4/input/day4.txt"));
        String line;
        int start =0;
        int [] arr = new int[4];
        int idx=0;
        int count=0;

        while((line=br.readLine())!=null){
            for(int i=0;i<=line.length();i++){
                if(i==line.length() || line.charAt(i)=='-'||line.charAt(i)==','){
                    arr[idx]=Integer.parseInt(line.substring(start, i));
                    idx++;
                    start=i+1;
                }
            }
            if(checkInRange(arr[0], arr[1], arr[2], arr[3])|| checkInRange(arr[2], arr[3], arr[0], arr[1])){
                count++;
            }

            start=0;
            idx=0;
        }
        
        System.out.println(count);
    }

    //Helper method to check if a range is in another range
    public static boolean checkInRange(int lRng, int rRng, int lCnt, int rCnt ){
        if(lRng<=lCnt && rRng>=rCnt){
            return true;
        }

        return false;
    }
}
