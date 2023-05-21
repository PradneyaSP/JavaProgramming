import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int count = 0;
            int n = sc.nextInt();
            String s;
            s = sc.next();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1')
                    count++;
            }
            if (count % 2 == 1)
                System.out.println(s + '1');
            else
                System.out.println(s);
            t--;
        }
    }
}