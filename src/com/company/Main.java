package com.company;

import com.sun.org.apache.xpath.internal.operations.And;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

enum Car {lamborghini,tata,audi,fiat,honda};

public class Main {

    public static void main(String[] args) {
       try{
           BufferedReader in = new BufferedReader(new FileReader("runnoob.yaml"));
           String str;
           while ((str = in.readLine()) != null){
               System.out.println(str);
           }

       }catch(IOException e){}
    }
    public static void test(){

    }


}
