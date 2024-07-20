package String;

import java.util.HashMap;
import java.util.Map;

public class IntToRoman {
    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        int[] values = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] roman= {"I" , "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        while(num > 0){
            for(int i = 0 ; i < values.length ; i++){
                if(num == 1){
                    ans.append("I");
                    num -= 1;
                }
                else if(values[i] > num){
                    ans.append(roman[i - 1]);
                    num-=values[i-1];
                }
            }
        }
        return ans.toString();
    }
}
