package com.kh.exception.homework.run;

import java.util.Scanner;

import com.kh.exception.homework.Song;

public class SongRun {

	public static void main(String[] args) {
		
		String[] composer={"Benny Andersson","Stig Anderson","Bjorn Ulvaeus"};
		Song s = new Song("Dancing Queen","ABBA","Arrival",composer, 1976,2);
				                 
		System.out.println(s.show());
		
		//����ó�� ���� ( NumberFormatException ) : ���ڿ��� ����Ÿ������ �Ľ��Ҷ� �߻��ϴ� ����
		// Integer.parseInt()�� ��ȯ�Ҷ� �߻��ϴ� ����.
		System.out.println("======================");
		Scanner sc= new Scanner(System.in);
		System.out.print("�� �뷡�� ��� ������ϱ�?(���ڸ�)  : ");
		try {
			String num = sc.nextLine();
			int i = Integer.parseInt(num);
			System.out.println("���� Ƚ�� : "+ num);
		}catch(NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ���");
		}
		
		

	}

}
