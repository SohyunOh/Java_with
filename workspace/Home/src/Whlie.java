
public class Whlie {
	
	public static void main(String[] args) {
		
		// Quiz_01
        // 출력되는 i의 값을 적으시오

        int i = 0;
        System.out.print("1번 : ");
        while (i < 5) {
            i++; 
            System.out.print(i + " "); // 정답 : 1,2,3,4,5

        }

        System.out.println("");

        // Quiz_02
        // 출력되는 j의 값을 적으시오

        int j = 0;
        System.out.print("2번 : ");
        while (j < 5) {
            System.out.print(j + " "); // 정답 :0,1,2,3,4
            j++;

        }

        System.out.println("");

        // Quiz_03
        // ＊ 1 ~ 100 의 숫자중 짝수의 개수를 구하시오

        int count = 0; // 짝수의 개수를 나타낼 변수
        int a = 1;
        while (a <= 100) {
        	if( a %2 == 0) {
        		count++;
        	}
        	a++;
        }
        System.out.println("3번 : " + count + "개");

        // Quiz_04
        // arr배열에서 소수를 제외한 모든 수의 합을 출력하시오

        int[] arr = {10,9,8,7,6,5,4,3,2,1};

        int index = -1; // arr배열의 인덱스
        int sum = 0; // 총 합

        while (index < arr.length-1) {
        	index++;
        	if(!(arr[index] %2 == 0 && arr[index] != 2)) {
        		System.out.println("인덱스:" + arr[index]);
        		sum += arr[index];
        	}          

        }
        System.out.println("4번 : " + sum );
		
		
	}
}
