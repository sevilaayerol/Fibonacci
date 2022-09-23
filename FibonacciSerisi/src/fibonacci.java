import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Kaç elemanlý Fibonacci Serisi görmek istersiniz: ");
		int n=input.nextInt();
		int b=0, c=1,d;
		for(int i=0; i<=n; i++) {
			 	d=b+c;
	            System.out.println(b+"+"+c+"="+d);
	            b=c;
	            c=d;

	            System.out.println(" ");
		}

	}

}
