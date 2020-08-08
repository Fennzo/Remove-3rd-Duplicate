package com.selenium.test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class App 
{
	public static char[] remove(int index, char[] arr) {
	    char[] newArr = new char[arr.length - 1];
	    if(index < 0 || index > arr.length) {
	        return arr;
	    }
	    int j = 0;
	    for(int i = 0; i < arr.length; i++) {
	        if(i == index) {
	            i++;
	        }
	        newArr[j++] = arr[i];
	    }

	    return newArr;
	}
    public static void main( String[] args ) throws ParseException {
    	Scanner in = new Scanner(System.in);
    	String str;
    	
    	System.out.print("Enter str: ");
    	str = in.next();
    	
    	
        char[] temp = str.toCharArray();
        int length = temp.length;
        for ( int i = 0; i < length-1; i++) {
        	int count = 0;
        	for ( int j = i+1; j < length; j++) {
        		if ( temp[i] == temp[j]) {
        			count++;
        			if ( count > 0) {
        				temp = Arrays.copyOf(temp, temp.length+1);
        				temp = remove(j, temp);
        				length--;
        			}
        		}
        	}
        	
        }
        
       String result = String.valueOf(temp);
       System.out.println("Result:" + result);
    	in.close();
		}}
