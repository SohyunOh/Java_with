import java.util.Arrays;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {


		// Quiz_01
		// i의 값을 적으시오

		System.out.print("1번 : ");
		for(int i = 0; i<=5; i++) {
			System.out.print(i +" "); // 정답 : 0,1,2,3,4,5
		}

		System.out.println("");

		// Quiz_02
		// 2 ~ 9 구구단 출력
		for(int i = 1; i <= 9; i++) {
			System.out.println("");
			for(int j = 2; j <= 9 ; j++ ) {
				//            	System.out.print( j + "X" + i + "=" + i*j );
				System.out.printf( "%d x %d = %d \n" , j,i,j*i  );

			}
		}


		// 선택 정렬 
		// arr배열의 값을 작은 순서대로 정렬하시오
		// 1회차 기준 - 정렬된 숫자로 정렬되면서 돈다

		int[] arr = {4,5,2,3,1,6,7,8,9};
		int temp = 0;
		for(int i = 0; i<arr.length-1; i++) { //기준자리 
			for(int j = i+1; j<arr.length; j++ ) { // 비교자리
				if(arr[i] > arr[j]) { // 기준자리가 비교자리보다 크면 실행한다
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}

			}
		}
		System.out.println(Arrays.toString(arr));

		// Q3 버블정렬
		// 왼쪽에서 오른쪽으로 작은숫자가 정렬되게 하시오 
		int[] arr2 = {9,8,1,3,2,4,5,6,7};
		int temp2 = 0;
		for(int i= 0; i <arr2.length-1; i++ ) {// n회차 당 
			for (int j = 0 ; j <arr2.length-1 ; j ++) //자리 정보 
				if(arr2[j]< arr2[j+1]) { //j의 자리와 j+1 자리로 비교  
					temp2 = arr2[j];
					arr2[j] = arr2[i+1];
					arr2[j] = temp2;      			
				}
		}
		System.out.println(Arrays.toString(arr2));



		// 정수 n의 값을 입력했을때
		// n의값 까지 포함한 모든 소수의 합을 구하시오
		// 소수 : 자기 자신과 1로 나누워을 때 나누어는것 , 단 2는 소수가 맞다. 단 1은 소수가 아니다
		// count : 1과 자기자신을 쌤
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("n의 정수 입력 : " );
//		int n = sc.nextInt();
//		int sum	= 0;
//
//		for(int i=2; i<=n; i++){ //소수는 2부터 시작됨  
//			int count = 0;
//			for(int j = 1 ; j <= i ; j++){
//				if(i % j == 0 ) {
//					count++ ;
//				}
//				
//			}
//			if(count == 2 ) {
//				sum += i;
//				System.out.println("sum:"+ sum);
//			}
//		}
//	
//		System.out.println("정수 합:" + sum);
//	
	
//	1
//	12
//	123
//	1234
//	12345
	
	for(int i = 1 ; i <= 5 ; i++) {
		int k = 0 ;
		for(int j = 1 ; j <= i ; j++) {
			k++;
			System.out.print(k);
		}
		System.out.println();
	}
		
	
	}



}
