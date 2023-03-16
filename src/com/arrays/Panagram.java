package com.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    // Write your code here
    	s=s.replaceAll(" ", "");
    	s=s.toLowerCase();
    List<String> ss=Arrays.asList(s.split(""));
    if(ss.stream().distinct().count()==26)
    	return "pangram";
    
    return "not pangram";

    }

}

public class Panagram {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new  ));

        int n=10;
        BigInteger x=new BigInteger("4294967295");
        System.out.println(x.add(new BigInteger("-"+n)) );
        String s = bufferedReader.readLine();

        String result = Result1.pangrams(s);

        System.out.println(result);
        
    }
}
