import java.util.Scanner;

public class Palind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,rem,rev=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n!=0)
{
	rem=n%10;
	rev=(rev*10)+rem;
	n=n/10;
}
if(n==rev)
{
System.out.println("palin");
	}
else
{
	System.out.println("not palin");
}
	}
}
