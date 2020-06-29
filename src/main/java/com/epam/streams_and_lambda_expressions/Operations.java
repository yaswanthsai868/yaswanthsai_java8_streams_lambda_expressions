package com.epam.streams_and_lambda_expressions;

import java.util.List;

public class Operations {
	public static int average(List<Integer> listofnumbers)
    {
    	int avg=0;
    	for(Integer iterator:listofnumbers)
    	{
    		avg=avg+iterator;
    	}
    	return avg/listofnumbers.size();
    }

}
