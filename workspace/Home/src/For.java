import java.util.Arrays;

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

        
        
	}

}
