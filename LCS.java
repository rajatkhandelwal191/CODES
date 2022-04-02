import java.util.Scanner;

import java.util.*;

public class LCS {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String s1 = scn.nextLine();
        String s2 = scn.nextLine();

        //Make a DP
        int [][] dp = new int[s1.length() + 1][s2.length() + 1];

        //piche se loop chalaya jaha 1 hai

        for(int i = dp.length -2; i >= 0; i--){
            for(int j = dp.length-2; j >= 0; j--){

                char ch1 = s1.charAt(i);
                char ch2 = s2.charAt(j);

                if(ch1 == ch2){
                    dp[i][j] = dp[i+1][j+1]; //ch same hone pe +1 krdo ...dry run
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);  //dry run
                }
            }
        }

        System.out.println(dp[0][0]);

    }
}
