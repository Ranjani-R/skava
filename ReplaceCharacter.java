package replaceCharacters;

import java.util.Scanner;

public class Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    String[] array=scan.nextLine().split(",");
	    String s1=array[0];
	    String s2=array[1];
	    
	    for(int i=0;i<s1.length();i++)
	    {
	    	int count=0;
	    	for(int j=0;j<s2.length();j++)
	    	{
	    		if(s1.charAt(i)!=s2.charAt(j))
	    		{
	    			count++;
	    		}
	    		else {
					
	    			System.out.print(s1.charAt(i));
				}
	    	}
	    	if(count==s2.length())
	    	{
	    		System.out.print("*");
	    	}
	    }

	}

}
