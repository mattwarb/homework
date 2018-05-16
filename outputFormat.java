package com.qa.homework;
import java.util.*;

public class outputFormat {
    public outputFormat(){
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-10s", s1);
            System.out.printf("%03d",x);
        }
        System.out.println("================================");
    }

}
