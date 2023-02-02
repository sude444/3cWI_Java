package at.bsu.basics;
import java.util.*;
import java.io.*;
import java.math.*;

public class UpperUndLowerCase {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String t = "ABCDEFGhijklmnoP";
        String uppers = "";
        String lowers = "";

        for(char c: t.toCharArray()) {
            if(Character.isUpperCase(c)) {
                uppers += c;
            }
            else{
                lowers += c;
            }
        }
        System.out.println(uppers);
        System.out.println(lowers);

    }

/*
public class UpperUndLowerCase {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String t = "ABCDEFGhijklmnoP";
        String uppers = "";
        String lowers = "";
        char[] arr = t.toCharArray();

        for(int i = 0; i < arr.length; i++ ) {
            if(Character.isUpperCase(arr[i])) {
                uppers += arr[i];
            }
            else{
                lowers += arr[i];
            }
        }
        System.out.println(uppers);
        System.out.println(lowers);

    }
*/

}
