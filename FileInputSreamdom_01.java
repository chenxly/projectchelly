package com.mytheard;

import java.io.*;
import java.util.Scanner;

public class FileInputSreamdom_01 {
    public static void main(String[] args) {
        BufferedReader bfi =null;
//        new Object()
        Scanner inpput = new Scanner(System.in);
        try {
            bfi = new BufferedReader(new InputStreamReader(new FileInputStream("d:/io/test.txt")));
            String str ="";
            int a[] =new int[1];
            str = bfi.readLine();
            System.out.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bfi.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
