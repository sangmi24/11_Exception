package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.A_UncheckedException;
import com.kh.exception.controller.B_CheckedException;

public class ExceptionRun {

	public static void main(String[] args) {
		
		/*
		 * *����(����) ����
		 * 1. �ý��� ���� : ��ǻ���� ���۵����� ���� �߻��ϴ� ����
		 * => �ҽ��ڵ�� �ذ��� �ȵ� (���� �ɰ��� ����)
		 * 2. ������ ���� : �ҽ��ڵ���� �������� ������ �߻��ϴ� ����
		 * => �ҽ��ڵ� �������� ���� �ذ� ���� (���� ���ٷ� �˷���)
		 * 3. ��Ÿ�� ���� : �ҽ��ڵ�����δ� ������ ���µ� ���α׷� ������ �߻��ϴ� ����
		 * => ������� �߸� �ϼ��� �ְ�, �����ڰ� ���� ������ ��츦 ����� ó�� ���س��� ���ϼ��� ���� 
		 * 4. �� ���� : �ҽ��ڵ���� �������� ������ ����(���� ������ ���ٴ� ��),
		 *             ������������ ���� ������ ���� ������   
		 *             ���α׷� �ǵ��� ���� �ʴ� ���� 
		 * => ���� ��� true ���� ���� �ϴµ� false �� ���� �� �ǵ��� �� �ݴ�� ����Ǵ� ���
		 * 
		 * * �ý��� ������ ������ ������ ����, ��Ÿ�� ����, �� ������ ���� ���� �� �ɰ��� �͵���
		 *   "����"��� �Ѵ�. (Exception)            
		 * 
		 *  �̷��� "����"���� "�߻�"���� ��쿡 ����ؼ� "ó��"�ϴ� ����� �����ص� ���� "����ó��"��� �Ѵ�.
		 *  => ���࿡ xxx������ �߻��Ѵٸ� � �ڵ带 �����ų��? (������ ���ǹ�ó�� �ؼ��ȴ�. )
		 *  
		 *  ����ó���� �ϴ� ���� : ���� �߻��� ���α׷��� ��������� ����Ǳ� ������ �װ��� ������ �ϱ� ����
		 *  
		 *  ����ó�� ���
		 *  1. try ~ catch ���� �̿�
		 *  2. throws �� �̿� (���ѱ��)
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
			System.out.println("IOException �߻���");
		}
		

	}

}





