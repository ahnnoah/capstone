import java.util.Scanner;
import java.util.InputMismatchException;

public class practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요>>");
		try {
			int n = sc.nextInt();
			if(n%2==0)
				System.out.println("짝수");
			else
				System.out.println("홀수");					
		}
		catch(InputMismatchException e) {
			System.out.println("수를 입력하지 않아 프로그램 종료합니다.");
		}
		
		sc.close();
	}
}
