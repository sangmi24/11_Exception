package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.A_UncheckedException;
import com.kh.exception.controller.B_CheckedException;

public class ExceptionRun {

	public static void main(String[] args) {
		
		/*
		 * *에러(오류) 종류
		 * 1. 시스템 에러 : 컴퓨터의 오작동으로 인해 발생하는 에러
		 * => 소스코드로 해결이 안됨 (가장 심각한 에러)
		 * 2. 컴파일 에러 : 소스코드상의 문법적인 문제로 발생하는 에러
		 * => 소스코드 수정으로 문제 해결 가능 (빨간 밑줄로 알려줌)
		 * 3. 런타임 에러 : 소스코드상으로는 문제가 없는데 프로그램 실행중 발생하는 에러
		 * => 사용자의 잘못 일수도 있고, 개발자가 예측 가능한 경우를 제대로 처리 안해놓은 것일수도 있음 
		 * 4. 논리 에러 : 소스코드상의 문법적인 문제도 없고(빨간 밑줄이 없다는 뜻),
		 *             실행했을때도 굳이 문제가 되지 않지만   
		 *             프로그램 의도상 맞지 않는 오류 
		 * => 예를 들면 true 값이 들어가야 하는데 false 가 들어가서 내 의도와 정 반대로 실행되는 경우
		 * 
		 * * 시스템 에러를 제외한 컴파일 에러, 런타임 에러, 논리 에러와 같은 비교적 덜 심각한 것들을
		 *   "예외"라고 한다. (Exception)            
		 * 
		 *  이러한 "예외"들이 "발생"했을 경우에 대비해서 "처리"하는 방법을 정의해둔 것을 "예외처리"라고 한다.
		 *  => 만약에 xxx오류가 발생한다면 어떤 코드를 실행시킬래? (일종의 조건문처럼 해석된다. )
		 *  
		 *  예외처리를 하는 이유 : 예외 발생시 프로그램이 비상적으로 종료되기 때문에 그것을 막고자 하기 위함
		 *  
		 *  예외처리 방법
		 *  1. try ~ catch 문을 이용
		 *  2. throws 를 이용 (떠넘기기)
		 *  
		 */
		
		A_UncheckedException a = new A_UncheckedException();
		//a.method1();
		//a.method2();
		//a.method3();
		 
		B_CheckedException b = new B_CheckedException();
		//b.method1();
		try {
		      b.method1();		
		}catch(IOException e) {
			System.out.println("IOException 발생됨");
		}
		

	}

}





