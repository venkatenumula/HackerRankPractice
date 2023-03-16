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

class Result13 {

    /*
     * Complete the 'noPrefix' function below.
     *
     * The function accepts STRING_ARRAY words as parameter.
     */

    public static void noPrefix(List<String> words) {
    // Write your code here
    int i=0;
        for(i=0;i<words.size();i++)
        {
            String s=words.get(i);
            System.out.println("searching for "+s +" in "+words.subList(i+1, words.size()));
            System.out.println();
            Optional<String> match= words.subList(i+1, words.size()).stream().filter(e->e.contains(s)).findFirst() ;
             
            if(match.isPresent())
            {
                System.out.println("BAD SET");
                System.out.println(words.get(i+1));
                break;
            }            
        }
        if(i==words.size())
            System.out.println("GOOD SET");
        }
}

public class GoodBadSet {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> words = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        Result13.noPrefix(words);

        bufferedReader.close();
    }
}

