package lectures2;
import java.util.Scanner;
public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 5;
		int space = 0;
		while(row<=n) {
			int i = 1 ;
			while(i<=space) {
			System.out.print("  ");
			i++;
			}
			int j = 1;
			while(j<=star) {
				System.out.print(" *");
			j++;
			}
			row++;
			System.out.println();
			star--;
			space++;
			
		}
	}

}
