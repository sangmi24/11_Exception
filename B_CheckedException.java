package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {

	
	/*
	 * * Checked Exception 은 반드시 예외처리를 해줘야 되는 예외들
	 * (즉, 예측 불가한 상황에서 발생하기 때문에 미리 예외 처리 구문을 작성해야 함)
	 * => 주로 외부 매체와 어떤 입출력 시 발생
	 */
	
	public void method1() throws IOException{
		/*
		try {
		      method2();		
		}catch(IOException e) {
			System.out.println("예외 발생됨");
		}
		*/
		method2();
	}
	//throws  구문 추가
	public void method2() throws IOException {
		
	    // Scanner sc = new Scanner(System.in);
	
	    // Checked Exception 상황을 연출하기 위해
	    //  Scanner 와 같이 키보드로 값을 입력받을 수 있는 객체를 하나 생성해보자
	    //  java.io.BufferedReader 클래스로부터 객체 생성 (단, 문자열로만 입력이 가능)
		//  BufferedReader는 보조임=> try catch 무조건 있어야 함. InputStreamReader 가 메인
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("아무 문자열이나 입력하세요 : " );
		
		//String str = br.readLine(); // 한줄 단위로 사용자가 입력한 문자열을 입력받겠다.
		// 이 메소드를 호출했을 때 IOException 이 발생할 수도 있음을 애초에 컴파일 에러로 알려준것 (빨간 밑줄)
		
		//1.  try ~ catch 문 : 여기서 당장 바로 예외를 처리하겠다. 
		/*
		try {
			String str = br.readLine();
			System.out.println("문자열의 길이: "+ str.length());
		} catch(IOException e ) {
			//언제 예외가 발생할지 모름 => 그래서 꼭 작성해줘야 한다.  
			System.out.println("예외 발생함.");
		}
		*/
		//2. throws 구문을 이용하기 
		// throws : 지금 여기서 당장 예외를 처리하겠다 가 아닌 현재 이 메소드를 호출한 곳에서 처리하게끔 떠넘기겠다.
		// (method2 ==> method1 )즉, 나를 호출한 곳에서 try~catch 문을 쓰겠다. 
		String str = br.readLine();
		System.out.println("문자열의 길이 : "+str.length());
		// br.readLine() 메소드 정의  부분을 보면 이미 throws로 나한테 예외처리하게끔 떠넘겨준 것!
		
	}
	/*
	 * RuntimeException ( UncheckedException ) : 예외 발생 시점(해당 코드가 실행되다가 오류나면 )
	 * => 예외처리가 필수는 아님
	 * CheckedException : 예외 발생 시점 ( 언젠가 실행되다가는 맞지만  => 반드시 처리를 해줘야하기 때문에  육안상 컴파일 에러)
	 * => 예외처리가 필수임 
	 */
	
	
	
	
	
	
	
	
	
	
}
