package com.kh.exception.homework.run;

import java.util.Scanner;

import com.kh.exception.homework.Song;

public class SongRun {

	public static void main(String[] args) {
		
		String[] composer={"Benny Andersson","Stig Anderson","Bjorn Ulvaeus"};
		Song s = new Song("Dancing Queen","ABBA","Arrival",composer, 1976,2);
				                 
		System.out.println(s.show());
		
		//예외처리 문제 ( NumberFormatException ) : 문자열을 숫자타입으로 파싱할때 발생하는 오류
		// Integer.parseInt()로 변환할때 발생하는 예외.
		System.out.println("======================");
		Scanner sc= new Scanner(System.in);
		System.out.print("이 노래를 몇번 들었습니까?(숫자만)  : ");
		try {
			String num = sc.nextLine();
			int i = Integer.parseInt(num);
			System.out.println("들은 횟수 : "+ num);
		}catch(NumberFormatException e) {
			System.out.println("숫자만 입력하세요");
		}
		
		

	}

}
