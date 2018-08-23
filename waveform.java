/*import java.util.*;
class abc{
    static{
        system.out.println("sfjdfdf");
    }
}
public class waveform{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();int b;
        int a[] = new int[n];
        for(int i=0;i<n;i++) {
            if(i%2!=0){b=a[i-1];a[i-1]=sc.nextInt();a[i]=b;}
            else a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) System.out.println(a[i]);
    }
}*/
import java.util.*;
class waveform{
	public static void main(String[] args)
	{
	
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number of rows");
	  int n = sc.nextInt();	
	  int count = n;
	  for(int i = n; i >= 1; i--)
	  {
		for(int j = 0; j < count * i; j++)
		{
		  int c = count;
		  label:
		  if(c != 0)
		   { 
			System.out.print(" "+ j);
			c--;
			goto label;
			}
		  count--;
		}
		System.out.println(" ");
	  }
	}
}