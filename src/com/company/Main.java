package com.company;

import java.io.LineNumberInputStream;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int left = 1, right = 22;

        List<Integer> result = new ArrayList<>();
        for (int i = left; i <=right ; i++) {
            if (check(i)) {
                result.add(i);
            }

        }

        //return result;
        for (int a:result     ) {
            System.out.println(a);
        }

    }

    public static boolean check(int a) {
       // System.out.println("================="+a);
        int b=a;
        boolean divisible=true;
        while(b >0) {
            int x = b - b / 10 * 10;
          //  System.out.println("b:"+b+" x:"+x);
            b=b/10;

            if (x==0 || a % x != 0  ) {
                divisible=false;
                break;
            }
        }
        //System.out.println("================="+divisible);

        return divisible;
    }

}
