package com.chitkara;

import java.util.Scanner;

public class removeOperation {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String res = removeChar(str);
        System.out.println(res);
    }


   static String removeChar(String str) {
       StringBuilder s = new StringBuilder(str);
       int i = 0;
       for (i = 0; i < s.length(); i++) {
           if (s.charAt(0) == 'A') {
               s.delete(0, 1);
        i++;
           } else if (s.charAt(1) == 'A') {
               s.delete(1, 2);
           }
       }
    return s.toString();
   }
}
