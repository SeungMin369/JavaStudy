package quiz;

import java.util.Scanner;

public class B07_Prime {
	public static void main (String[] arge) {
		/*
		  	사용자로부터 숫자(양수)를 입력받으면
		  	1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보세요
		  	(음수를 입력하면 다시 제대로 입력하게 하기)
		  	
		  	※ 소수 : 나누어 떨어지는 수가 1과 자기 자신 밖에 없는 숫자
		  	
		  		2, 3, 5, 7, 11, 13 ...
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("> ");
		int num = sc.nextInt();
		
		for (; num < 2;) {
			System.out.println("잘못된 숫자입니다. 다시 입력해주세여");
			System.out.println("> ");
			num = sc.nextInt(0);
			
		}
		System.out.println(2);
		for (int chknum = 3; chknum <= num; chknum += 2) { //2의 배수는 제외해도 되니까 2씩 증가시켜도 된다 			
			boolean prime = true;
			for (int divnum  = 3; divnum <= Math.sqrt(chknum); divnum += 2) {// 제곱근을 제외하고 2도 미리표시하고 비교근도 2씩 증가시킨다
				if (chknum % divnum == 0) {
					prime = false;
				}
			}
			if (prime) { // 나누어 떨어지는 값이 2개라서 카운트가 2일때 출력을 한다.
				System.out.println(chknum);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}











