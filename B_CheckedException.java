package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {

	
	/*
	 * * Checked Exception �� �ݵ�� ����ó���� ����� �Ǵ� ���ܵ�
	 * (��, ���� �Ұ��� ��Ȳ���� �߻��ϱ� ������ �̸� ���� ó�� ������ �ۼ��ؾ� ��)
	 * => �ַ� �ܺ� ��ü�� � ����� �� �߻�
	 */
	
	public void method1() throws IOException{
		/*
		try {
		      method2();		
		}catch(IOException e) {
			System.out.println("���� �߻���");
		}
		*/
		method2();
	}
	//throws  ���� �߰�
	public void method2() throws IOException {
		
	    // Scanner sc = new Scanner(System.in);
	
	    // Checked Exception ��Ȳ�� �����ϱ� ����
	    //  Scanner �� ���� Ű����� ���� �Է¹��� �� �ִ� ��ü�� �ϳ� �����غ���
	    //  java.io.BufferedReader Ŭ�����κ��� ��ü ���� (��, ���ڿ��θ� �Է��� ����)
		//  BufferedReader�� ������=> try catch ������ �־�� ��. InputStreamReader �� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�ƹ� ���ڿ��̳� �Է��ϼ��� : " );
		
		//String str = br.readLine(); // ���� ������ ����ڰ� �Է��� ���ڿ��� �Է¹ްڴ�.
		// �� �޼ҵ带 ȣ������ �� IOException �� �߻��� ���� ������ ���ʿ� ������ ������ �˷��ذ� (���� ����)
		
		//1.  try ~ catch �� : ���⼭ ���� �ٷ� ���ܸ� ó���ϰڴ�. 
		/*
		try {
			String str = br.readLine();
			System.out.println("���ڿ��� ����: "+ str.length());
		} catch(IOException e ) {
			//���� ���ܰ� �߻����� �� => �׷��� �� �ۼ������ �Ѵ�.  
			System.out.println("���� �߻���.");
		}
		*/
		//2. throws ������ �̿��ϱ� 
		// throws : ���� ���⼭ ���� ���ܸ� ó���ϰڴ� �� �ƴ� ���� �� �޼ҵ带 ȣ���� ������ ó���ϰԲ� ���ѱ�ڴ�.
		// (method2 ==> method1 )��, ���� ȣ���� ������ try~catch ���� ���ڴ�. 
		String str = br.readLine();
		System.out.println("���ڿ��� ���� : "+str.length());
		// br.readLine() �޼ҵ� ����  �κ��� ���� �̹� throws�� ������ ����ó���ϰԲ� ���Ѱ��� ��!
		
	}
	/*
	 * RuntimeException ( UncheckedException ) : ���� �߻� ����(�ش� �ڵ尡 ����Ǵٰ� �������� )
	 * => ����ó���� �ʼ��� �ƴ�
	 * CheckedException : ���� �߻� ���� ( ������ ����Ǵٰ��� ������  => �ݵ�� ó���� ������ϱ� ������  ���Ȼ� ������ ����)
	 * => ����ó���� �ʼ��� 
	 */
	
	
	
	
	
	
	
	
	
	
}
