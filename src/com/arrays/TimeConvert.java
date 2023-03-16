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

class Result2 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s)  {
    // Write your code here
	/*
	 * String[] dt=s.split(":");
	 * 
	 * if(dt[2].endsWith("PM") ) if (dt[0].equals("12")) return
	 * "12:"+dt[1]+":"+dt[2].substring(0,2); else return
	 * Integer.parseInt(dt[0])+12+":"+dt[1]+":"+dt[2].substring(0,2); else
	 * if(dt[2].endsWith("AM") && dt[0].equals("12") ) return
	 * "00:"+dt[1]+":"+dt[2].substring(0,2); else return
	 * dt[0]+":"+dt[1]+":"+dt[2].substring(0,2);
	 */
    	
    	SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ssa");
    	SimpleDateFormat sdf2=new SimpleDateFormat("HH:mm:ss");
    	 try {
			return sdf2.format(sdf.parse(s));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			return "";
		}
    	 
    	

    }
    public String endUp(String str) {
		  if(str.length()<=3 )
		    return str.toUpperCase();
		    else
		    return str.substring(0,str.length()-3)+str.substring(str.length()-3,str.length()).toUpperCase();
		}

}

public class TimeConvert {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result2.timeConversion(s);
        System.out.println(result);

        bufferedReader.close();
        
    }
}
