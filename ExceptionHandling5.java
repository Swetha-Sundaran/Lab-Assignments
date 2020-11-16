package day_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling5 {

	public static void main(String[] args) throws IOException {
		String totalRunsScored;
		String totalOversFaced;
		float runRate;
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    System.out.println("Enter total runs scored...");
	    totalRunsScored = br.readLine();
	    System.out.println("Enter total overs faced...");
	    totalOversFaced = br.readLine();
	    try{
	    	runRate = Integer.parseInt(totalRunsScored)/Integer.parseInt(totalOversFaced);
	    	System.out.println("Current Run Rate="+runRate);
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	}

}
