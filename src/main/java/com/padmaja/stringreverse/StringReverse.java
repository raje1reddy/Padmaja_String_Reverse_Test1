package com.padmaja.stringreverse;
//import static java.lang.System.out;
import java.util.Scanner;
import static java.lang.System.out;
import java.lang.String;

public class StringReverse {
    public static void main(String[] args){
        System.out.println("Enter string to reverse:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        stringUtil myStringUtilObject = new stringUtil();

        String reverse = myStringUtilObject.reverse(str);

        System.out.println("Reversed string is:" + reverse);

    }

}




