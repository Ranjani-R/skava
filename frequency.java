package calculateFrequency;

import java.util.HashMap;
import java.util.Scanner;

import com.sun.javafx.scene.EnteredExitedHandler;
import com.sun.webkit.ThemeClient;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    String[] array=scan.nextLine().split(",");
		int len=array.length;
		int[] num=new int[len];
		int visited=-1,c;
		for(int i=0;i<len;i++)
		{
			c=1;
			for(int j=i+1;j<len;j++)
			{
				if(array[i].contains(array[j]))
				{
					c++;
					num[j]=visited;
				}
			}
			if(num[i]!=visited)
			{
				num[i]=c;
			}
	
		}
		for(int i=0;i<num.length;i++)
		{
			if(num[i]!=visited)
			{
				System.out.println(array[i]+" "+num[i]);
			}
		}
		
		
		

	}

}
