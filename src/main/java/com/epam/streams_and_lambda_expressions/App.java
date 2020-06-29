package com.epam.streams_and_lambda_expressions;
import java.util.*;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
	public static Scanner input= new Scanner(System.in);
    public static void main( String[] args )
    {
        String[] stringCheck= {"abb","qweaasd","acs","v","aee","evd","asdasda","3ewq","3we","aaa","bca","caa","Acc",""};
        String[] pallandromeCheck= {"abba","hello","helleh","hellolleh","abdfd","a","","abab","abcba"};
        
        
        List<String> randomStrings=Arrays.asList(stringCheck);
        StringFilterOnSizeAndStartingChar filterObj=new StringFilterOnSizeAndStartingChar();
        filterObj.filterSting(randomStrings);
        filterObj.displayList(System.out::println);
        
        
        List<String> checkingStrings=Arrays.asList(pallandromeCheck);
        FilterPalandromes palandromeFilterObj=new FilterPalandromes();
        palandromeFilterObj.filterPalandrome(checkingStrings, FilterPalandromes::findPalandrome);
        palandromeFilterObj.display(System.out::println);
    }
    
}
