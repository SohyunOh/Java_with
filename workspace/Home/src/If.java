import java.util.Random;

public class If {

    public static void main(String[] args) {
        // if ~ While 

        // If문 Quiz 02 -Start-

        int a = 1;
        if(a > 1 && a < a++) {
            System.out.println("1번 : " + "참");
        } else {
            System.out.println("2번 : " + "거짓");
        } // 정답 : 거짓
        System.out.println(a); // 정답 : a = 1

        int score = 90;
        char grade;

//        if(score >= 60) {
//            grade = 'D';
//        } else if(score >= 80) {
//            grade = 'B';
//        } else if(score >= 70) {
//            grade = 'C';
//        } else if(score >= 90) {
//            grade = 'A';
//        } else {
//            grade = 'F';
//        }
        if(score >= 90) {
        	grade = 'A';
        } else if(score >= 80) {
        	grade = 'B';
        } else if(score >= 70) {
        	grade = 'C';

        } else if(score >= 60) {
        	grade = 'D';
        } else {
        	grade = 'F';
        }
        System.out.println("3번 : " + grade); // 정답 : A

        // If문 Quiz 02 -End-

        // Switch문 Quiz 03 -Start-
            // 랜덤수를 만들어 arr배열에 적용했을때
            // 나온 값에 따라 1,2,3등은 각각 1등,2등,3등 으로 출력하고 나머지는 탈락으로 처리하시오 
            // 만약 5등이라면 꼴등이라고 출력하시오

        int[] arr = {1,2,3,4,5};
        int index = (int) (Math.random()*arr.length) ;
        System.out.println("랜덤:"+ index);
        
        
        switch (arr[index]) {
            case(1) :
                System.out.println("1등");
            	break;
            case(2) :
                System.out.println("2등");
            	break;
            case(3) :
                System.out.println("3등");
            	break;
            default :
            	System.out.println("탈락");
            	break;

        // Switch문 Quiz 03 -End-

   
        }
        
        //int c = (int) (Math.random()*2951 + 1000); //1000 -3999
		        // 랜덤함수 공식
//		        int i = 0 ;
//		        while(i < 10) {
		//            int a = (int) (Math.random() *11 ); // 1 ~ 10
		//            int a = (int) (Math.random() *10 + 1 ); // 1 ~ 10
		//            int a = (int) (Math.random() *11 ); // 0 ~ 10 
		//            int a = (int) (Math.random() *25 +25 ); // 25 ~ 49
		//            int a = (int) (Math.random() *4 + 25); // 25 ~ 49
//		            System.out.print(a + " ");
//		            i++;
		
//		        }
        
    }

}
