package com.sagar;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write you
        Scanner x = new Scanner(System.in);
        int t = x.nextInt();
        for(int i = 0; i < t; i++){
            int n = x.nextInt();
            int s = 0;
            while(n > 0){
                s = s + n % 10;
                n = n / 10;
            }
            System.out.println(s);
        }
    }
}
