
public class Operator {

	public static void main(String[] args) {
		
	/* 
        ＊ 연산자 

        단항 : ++ -- + - ~ ! 
        산술 : * / % + - 
        비교 : <> == !=
        논리 : && ||
        삼항 : 1+1 = 2 ? a : b 
        대입 : = *= += -= /= %=

    */

    // 증감연산자 Quiz 01 -START- \
		
	// ＊ 연산자 우선순위 
	// 단한 > 산술 > 비교 > 논리 > 삼항 > 대입

		
   int i = 0;
   int j = 0;

   i++;
   ++j;
   System.out.println("1번 : " + (i + j)); // 정답 :2 -> i:1  j:1
   System.out.println("2번 : " + i++); // 정답 :1 -> i:1++ => 2
   System.out.println("3번 : " + ++j); // 정답 :2 -> j=2
   System.out.println("4번 : " + (i == j++)); // 정답 : t  i:2 == j:2++ -> i:2 == j:3
   System.out.println("5번 : " + (++i == j--)); // 정답 :  3 == 3-- -> i:3	j:2   
   System.out.println("6번 : " + i); // 정답 :3
   System.out.println("7번 : " + j); // 정답 :2

   i = 0;
   j = 0;

   int sum = i++ + j++ + --i + j++;
  
   System.out.println("8번 : " + sum); // 정답 : 2 // i=0	j=2

   if(++i == j--) { //i=1	j=2--
       System.out.println("9번 : " + i + "참");
   } else {
       System.out.println("9번 : " + i + "거짓");
   } // 정답 : 거짓 	i=1	j=1

   i += j++; // 1 + 1++
   System.out.println("10번 : " + i); // 정답 : 2

   String num = i % j == 0 ? "참" : "거짓";   // 참이 나오게 코드를 수정해 주세요! 
   System.out.println("11번 : " + num); // 정답 : 참   i=2	j=2

   // 증감연산자 Quiz 01 -END- 




	}

}
