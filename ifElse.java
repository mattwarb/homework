package com.qa.homework;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ifElse {
    public ifElse(){


         Scanner scanner = new Scanner(System.in);


        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2!=0) {
            System.out.println("Weird");

        }
        else {
            if(N>=2 && N <=5){
                System.out.println("Not Weird");
            }
            else if(N<20){
                System.out.println("Not Weird");
            }
            else{
                System.out.println("Weird");
            }


        }

        scanner.close();

    }
}

