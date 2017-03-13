import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i,temp=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=2;i<=n/2;i++)
{
	temp=n%i;
	if(temp==0)
	{
		System.out.println("not prime");
	}
}
	
if(temp!=0)
{
	System.out.println("its primeno");
}
	}
	}


