package quiz;

import java.util.Scanner;

public class A10_ConditionQuiz2 {
	public static void main(String[] arge) {
		
		char a = 'q';
		
		System.out.println(a == 'q' || a == 'Q');//1
		
		char b = ' ';
		
		System.out.println(b != ' ' && b != '\t');//2 ||ºÙ¿©¼­ Æ²¸² ±Ùµ¥ ¸»ÀÌ ¾Ö¸ÅÇßÀİ¾Æ
		
		char c = '2';
		
		System.out.println(c >= '0' && c <= '9' );//3 int º¯È¯½ÃÅ² »ç¶÷ÀÌ ¸¹Àºµ¥ ±»ÀÌ ±×·²ÇÊ¿ä¾ø´Ù
		
		char d = '3';
		
		System.out.println((d >= 'A' && d <= 'Z') || (d >= 'a' && d <= 'z'));//4
		
		char e = 'ÀÌ';
				
		System.out.println(e >= '°¡' && e <= 'ÆR');//5
		System.out.println(e >= '°¡' && e <= 'ÆR');//ÀÌ¿ÕÀÌ¸é °ø½Ä »çÀÌÆ®µé¾î°¡¼­ ºÁ¶ó¤À À¯´ÏÄÚµå Àû¾îµµ »ó°ü¾øÀ½
		
		char f = 'ÀÏ';
		
		System.out.println((f >= 0x3041 && f <= 0x3096) || 
				(f >= 0x30A1 && f <= 0x30ff));//6 À¯´ÏÄÚµå´Â 0x¶¯‹¯‹¯‹¯ À¸·Î Àû´Â´Ù
		// ¼ö´Ü°ú ¹æ¹ıÀ» °¡¸®Áö¸»°í ÇØ°áÇØ¶ó ÀÏº» È¨ÆäÀÌÁö¸¦ µé¾î°¡¼­¶óµµ 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("exitÀ» ÀÔ·ÂÇÏ¸é true°¡ ³ª¿É´Ï´Ù > ");
		String txt = sc.nextLine();
		System.out.println(txt.equals("exit")); // ÄÁµğ¼Ç ÄûÁî 1¿¡¼­ ¼³¸íµÇ¾îÀÖÀ½ equals¸¦ ½á¾ßÇÏ´Â ÀÌÀ¯
		
		boolean exit = true;
		
		System.out.println(exit);//7
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
	}

}
