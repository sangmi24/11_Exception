package com.kh.exception.controller;

//java.lang ArithmeticException (java.lang 이라서 생략 가능)
import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {

	
	/*
	 * * RuntimeException 클래스
	 * - 프로그램 실행시 발생되는 예외들의 부모클래스 
	 * 
	 * * RuntimeException 클래스의 자식클래스들
	 * 1. ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스로 접근할 때 발생하는 예외
	 * 2. NegativeArraySizeException : 배열의 크기를 음수로 지정할 경우 발생하는 예외
	 * 3. ClassCastException : 허용할 수 없는 형변환이 진행될 경우 발생하는 예외
	 * 4. NullPointerException : 주소값이 아직 null 임에도 불구하고 접근하고자 할때 발생하는 예외
	 * 5. ArithmeticException : 나누기 연산 시 0으로 나눌때 발생하는 예외 
	 * ...
	 * => 이러한 RuntimeException 과 관련된 예외들은 충분히 예측 가능한 상황이기 때문에
	 *    예외 자체가 발생이 안되게끔 조건문으로 해결 가능함. (권장) 
	 * => 굳이 예외처리 (예외가 발생했을때 실행할 내용을 정의해두는것) 를 할 필요가 없음 => 수습
	 */
	 // 필드부
	 //Scanner 객체를 매번 메소드마다 생성하는게 아니라 전역변수로 생성해두고 다 가져다 쓰겠다.
	 /*default*/ Scanner sc = new Scanner(System.in);
	
	 public void method1() {
		 
		 //ArithmeticException : 나누기 연산시 0으로 나눌 때 발생하는 예외
		 
		 // 사용자로부터 두개의 정수값을 입력받아서 나눗셈 연산 결과를 출력
		 System.out.print("첫번째 정수 : ");
		 int num1 = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.print("두번째 정수 : ");
		 int num2 = sc.nextInt();
		 sc.nextLine();
		 
		 //해결방법1. 조건문으로 처리 (애초에 예외 자체가 발생되지 않게끔 if문 으로 조건검사 후 계산 진행) => 예외 처리 x
		 /*
		 if(num2 != 0) { //나눗셈 진행
			 System.out.println("나눗셈 연산 결과: "+(num1 / num2) );
		 }
		 else { //0으로 못나눈다고 알려줌
			 System.out.println("0으로 나눌 수 없습니다.");
		 }
		 System.out.println("프로그램 종료");
		 */
		 
		 //해결방법2. 예외처리 구문으로 해결 (예외가 발생했을 경우를 대비해서 실행할 내용을 미리 정의해두는 것)
		 /*
		  * * try ~ catch 문
		  * [ 표현법 ]
		  *  try{
		  *       // 예외가 발생할법한 구문 
		  *  } catch(발생될예외클래스 변수명 => 매개변수) {
		  *      // 해당 예외가 발생할 경우 실행할 구문
		  *  }
		  */
		 
		 try {
			 System.out.println("나눗셈 연산 결과 :" + (num1/num2) );
		 }catch( ArithmeticException e  ) {
			 
			 //적어도 이 시점에 도달했다면 => 이미 오류가 발생 한 것
			 System.out.println("0으로 나눌 수 없습니다.");
			 
			 e.printStackTrace();  
			 // 오류를 추적할 수 있는 메소드
			 // 현재 예외가 발생한 정보를 볼 수 있다.
		 }
		 System.out.println("프로그램 종료");
		 
	 }
	
	 public void method2() {
		 
		 System.out.print("정수 입력(0 제외) : ");
		 
		 try {
		    int num = sc.nextInt();   //1. 정수 이외의 값을 입력하면 InputMismatchException가 발생함
		    sc.nextLine();
		    
		    System.out.println("나눗셈 결과: "+ (10 /num ) ); //2. 0일 경우 ArithmeticException 이 발생함
 
		 }catch(InputMismatchException e) {
			 System.out.println("정수를 입력해야 합니다.");
		 }catch(ArithmeticException e) {
			 System.out.println("0으로 나눌수 없습니다. ");
		 } // 다중 catch 블럭 : 예외가 여러개 발생할 가능성이 있는 경우, 그 경우의 수만큼 catch블럭을 작성 가능
		 
		 System.out.println("프로그램 종료");
	 }
	  public void method3() {
		  
		  //ArrayIndexOutOfBoundsException  : 배열의 부적절한 인덱스로 접근할 때 발생하는 예외
		  //NegativeArraySizeException  : 배열의 크기를 음수로 지정할 경우 발생하는 예외
		  
		  System.out.print("배열의 크기: ");
		  int size = sc.nextInt();
		  sc.nextLine();
		  
		  // 배열을 할당하기 전 애초에 if문으로 오류가 나지 않게 막겠다.
		  /*
		  if(size > 0 ) {
		     int[] arr = new int[size];
		  }
		  else {
			  System.out.println("배열의 크기는 양수여야 합니다. ");
		  }
		  */
		  /*
		  try {
			  int[] arr = new int[size];
              System.out.println("100번 인덱스 값: "+arr[100]);
			  
		  } catch(NegativeArraySizeException e) {  //해당 catch 블럭이 실행된다면  아예 try~catch구문을 빠져나간다. 
			  // 이미 해당 오류가 발생함
			  System.out.println("배열의 크기로 음수를 제시할 수 없습니다. ");
			  
		  } catch(ArrayIndexOutOfBoundsException e) {
			  // 이미 해당 오류가 발생함
			  System.out.println("부적절한 인덱스로 접근했습니다.");
		  }
		  */
		  
		  // 다형성을 접목하여 예외처리
		  /*
		  try {
			  int[] arr = new int[size];
			  System.out.println("100번째 인덱스값: "+arr[100] );
 			  
		  } catch( RuntimeException e) {
			  
			  //다형성을 적용하여 부모 타입의 예외 클래스로 catch 블럭을 작성 가능
			  //장점: catch 블럭이 하나로 줄어듬
			  //단점: 정확히 어떤 오류가 발생했는지는 알 수 없음
			  System.out.println("예외가 발생하긴 했음. 배열의 크기를 음수로 입력했거나 부적절한 인덱스로 접근했음");
		  }
		  */
		  try {
			  int [] arr = new int[size];
			  System.out.println("100번째 인덱스 값 : "+arr[100] );
			  
		  }catch(NegativeArraySizeException e) {
			  System.out.println("배열의 크기로는 음수를 제시할 수 없습니다.");
		  } 
		  catch(RuntimeException e ) {
			  System.out.println("예외가 발생하긴 했음. 배열의 크기를 음수로 입력했거나 부적절한 인덱스로 접근했음.");
		  } 
		  // 다중 catch 블럭의 경우 순서가 중요하다.
		  //=> 상대적으로 범위가 작은 자식타입의 예외 클래스에 해당하는 catch 블럭을 먼저 기술해야 한다.
		  //=> 범위가 큰 부모클래스 먼저 기술한다면 자식클래스에 해당하는 catch 블럭에서 Unreachable 오류가 발생한다!	  
	
		  System.out.println("프로그램 종료");
	  }
	   /*
	    * * RuntimeException 관련된 에러는
	    * - 조건문으로 해결 가능 : 예외 자체가 발생 안되게끔 예방해주는 선처리 효과
	    *                    개발자가 소스코드로 애초에 핸들링 하는것 (예외처리 x)
	    * - 예외처리 구문으로 해결 가능 : 예외가 발생할 시점을 대비해서 그 때 실행할 내용을 미리 정의해두는것
	    *                          예외가 발생하고 나서의 후처리 담당
	    * 예측이 가능한 상황 => 조건문으로 해결하는 것을 더 권장한다.
	    * 예측이 불가능한 상황 => 예외처리를 구문으로 해결해야만 한다. (안쓰면 컴파일오류 발생)
	    * 
	    * RuntimeException  == Unchecked Exception == 예측 가능한 예외
	    */
	   //UncheckedException 여기서 try-catch, throws 가능하다. 
	  
	
	
	
}





