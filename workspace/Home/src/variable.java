
public class variable {
 
	static boolean b;
	static int a;
	static String s;
	
    public static void main(String[] args) {

/*
     1byte -> 2char -> 2short -> 4int -> 8long 4float 8double 1boolean

     ＊ 자동, 강제 형변환
     ex1) long = int + long // O 자동형변환
     ex2) int = int + long // x Error
     ex3) int = int + (int)long // O 강제형변환
     ex4) int = (int)(int + long) // O 강제형변환

     1. char는 아스코드로  int 와 연산이 가능하다
     2. long float 은 뒤에 L, F가 들어간다.
     3. 기본 값  -> 숫자 =0 , 문자  = null,  boolean = false
 */

    		System.out.println(a);
    		System.out.println(s);
    		System.out.println(b);
    		
    		int test1 =1 ;
    		String test2 = "test2";
    		double test3 = 1.1111;
    		System.out.print("print"); // 엔터기능 없음
    		System.out.printf("%d, %s, %.2f"+"\n", test1,test2,test3); // %d(정수), %s(문자) , %f(실수), \n(엔터기능)
    		System.out.println(test3);// 엔터 기능 포함
    	
    }

}