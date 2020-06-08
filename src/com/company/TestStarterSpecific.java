package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class TestStarterSpecific {
    public static void main(String[] args) {
        try{
            BufferedReader in = new BufferedReader(new FileReader("runnoob.yaml"));
            String str;
            while ((str = in.readLine()) != null){
                System.out.println(str);
            }

        }catch(IOException e){}
    }
}
