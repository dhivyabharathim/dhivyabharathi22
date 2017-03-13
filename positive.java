import java.util.Scanner;

public class positive {

	public static void main(String[] args) {
	int n;
	Scanner s=new Scanner(System.in);
    n=s.nextInt();
    if(n<0)
    {
    	System.out.println("negative");
    }
    else if(n>0)
    {
    System.out.println("positive");	
    }
    else
    {
    	System.out.println("both negative or positive");
    }
	}

}
