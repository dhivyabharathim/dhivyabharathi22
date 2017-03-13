import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
Scanner s=new Scanner(System.in);
n=s.nextInt();
if(n%4==0)
{
	System.out.println("leap year");
}
else
{
	System.out.println("not leap year");
}
	}

}
