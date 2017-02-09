import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Pascal p=new Pascal();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the row number upto which Pascal's triangle has to be printed: ");
		int row = scanner.nextInt();
		p.print(row);
	}
}
