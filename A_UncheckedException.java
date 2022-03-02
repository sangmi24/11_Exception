package com.kh.exception.controller;

//java.lang ArithmeticException (java.lang �̶� ���� ����)
import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {

	
	/*
	 * * RuntimeException Ŭ����
	 * - ���α׷� ����� �߻��Ǵ� ���ܵ��� �θ�Ŭ���� 
	 * 
	 * * RuntimeException Ŭ������ �ڽ�Ŭ������
	 * 1. ArrayIndexOutOfBoundsException : �迭�� �������� �ε����� ������ �� �߻��ϴ� ����
	 * 2. NegativeArraySizeException : �迭�� ũ�⸦ ������ ������ ��� �߻��ϴ� ����
	 * 3. ClassCastException : ����� �� ���� ����ȯ�� ����� ��� �߻��ϴ� ����
	 * 4. NullPointerException : �ּҰ��� ���� null �ӿ��� �ұ��ϰ� �����ϰ��� �Ҷ� �߻��ϴ� ����
	 * 5. ArithmeticException : ������ ���� �� 0���� ������ �߻��ϴ� ���� 
	 * ...
	 * => �̷��� RuntimeException �� ���õ� ���ܵ��� ����� ���� ������ ��Ȳ�̱� ������
	 *    ���� ��ü�� �߻��� �ȵǰԲ� ���ǹ����� �ذ� ������. (����) 
	 * => ���� ����ó�� (���ܰ� �߻������� ������ ������ �����صδ°�) �� �� �ʿ䰡 ���� => ����
	 */
	 // �ʵ��
	 //Scanner ��ü�� �Ź� �޼ҵ帶�� �����ϴ°� �ƴ϶� ���������� �����صΰ� �� ������ ���ڴ�.
	 /*default*/ Scanner sc = new Scanner(System.in);
	
	 public void method1() {
		 
		 //ArithmeticException : ������ ����� 0���� ���� �� �߻��ϴ� ����
		 
		 // ����ڷκ��� �ΰ��� �������� �Է¹޾Ƽ� ������ ���� ����� ���
		 System.out.print("ù��° ���� : ");
		 int num1 = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.print("�ι�° ���� : ");
		 int num2 = sc.nextInt();
		 sc.nextLine();
		 
		 //�ذ���1. ���ǹ����� ó�� (���ʿ� ���� ��ü�� �߻����� �ʰԲ� if�� ���� ���ǰ˻� �� ��� ����) => ���� ó�� x
		 /*
		 if(num2 != 0) { //������ ����
			 System.out.println("������ ���� ���: "+(num1 / num2) );
		 }
		 else { //0���� �������ٰ� �˷���
			 System.out.println("0���� ���� �� �����ϴ�.");
		 }
		 System.out.println("���α׷� ����");
		 */
		 
		 //�ذ���2. ����ó�� �������� �ذ� (���ܰ� �߻����� ��츦 ����ؼ� ������ ������ �̸� �����صδ� ��)
		 /*
		  * * try ~ catch ��
		  * [ ǥ���� ]
		  *  try{
		  *       // ���ܰ� �߻��ҹ��� ���� 
		  *  } catch(�߻��ɿ���Ŭ���� ������ => �Ű�����) {
		  *      // �ش� ���ܰ� �߻��� ��� ������ ����
		  *  }
		  */
		 
		 try {
			 System.out.println("������ ���� ��� :" + (num1/num2) );
		 }catch( ArithmeticException e  ) {
			 
			 //��� �� ������ �����ߴٸ� => �̹� ������ �߻� �� ��
			 System.out.println("0���� ���� �� �����ϴ�.");
			 
			 e.printStackTrace();  
			 // ������ ������ �� �ִ� �޼ҵ�
			 // ���� ���ܰ� �߻��� ������ �� �� �ִ�.
		 }
		 System.out.println("���α׷� ����");
		 
	 }
	
	 public void method2() {
		 
		 System.out.print("���� �Է�(0 ����) : ");
		 
		 try {
		    int num = sc.nextInt();   //1. ���� �̿��� ���� �Է��ϸ� InputMismatchException�� �߻���
		    sc.nextLine();
		    
		    System.out.println("������ ���: "+ (10 /num ) ); //2. 0�� ��� ArithmeticException �� �߻���
 
		 }catch(InputMismatchException e) {
			 System.out.println("������ �Է��ؾ� �մϴ�.");
		 }catch(ArithmeticException e) {
			 System.out.println("0���� ������ �����ϴ�. ");
		 } // ���� catch �� : ���ܰ� ������ �߻��� ���ɼ��� �ִ� ���, �� ����� ����ŭ catch���� �ۼ� ����
		 
		 System.out.println("���α׷� ����");
	 }
	  public void method3() {
		  
		  //ArrayIndexOutOfBoundsException  : �迭�� �������� �ε����� ������ �� �߻��ϴ� ����
		  //NegativeArraySizeException  : �迭�� ũ�⸦ ������ ������ ��� �߻��ϴ� ����
		  
		  System.out.print("�迭�� ũ��: ");
		  int size = sc.nextInt();
		  sc.nextLine();
		  
		  // �迭�� �Ҵ��ϱ� �� ���ʿ� if������ ������ ���� �ʰ� ���ڴ�.
		  /*
		  if(size > 0 ) {
		     int[] arr = new int[size];
		  }
		  else {
			  System.out.println("�迭�� ũ��� ������� �մϴ�. ");
		  }
		  */
		  /*
		  try {
			  int[] arr = new int[size];
              System.out.println("100�� �ε��� ��: "+arr[100]);
			  
		  } catch(NegativeArraySizeException e) {  //�ش� catch ���� ����ȴٸ�  �ƿ� try~catch������ ����������. 
			  // �̹� �ش� ������ �߻���
			  System.out.println("�迭�� ũ��� ������ ������ �� �����ϴ�. ");
			  
		  } catch(ArrayIndexOutOfBoundsException e) {
			  // �̹� �ش� ������ �߻���
			  System.out.println("�������� �ε����� �����߽��ϴ�.");
		  }
		  */
		  
		  // �������� �����Ͽ� ����ó��
		  /*
		  try {
			  int[] arr = new int[size];
			  System.out.println("100��° �ε�����: "+arr[100] );
 			  
		  } catch( RuntimeException e) {
			  
			  //�������� �����Ͽ� �θ� Ÿ���� ���� Ŭ������ catch ���� �ۼ� ����
			  //����: catch ���� �ϳ��� �پ��
			  //����: ��Ȯ�� � ������ �߻��ߴ����� �� �� ����
			  System.out.println("���ܰ� �߻��ϱ� ����. �迭�� ũ�⸦ ������ �Է��߰ų� �������� �ε����� ��������");
		  }
		  */
		  try {
			  int [] arr = new int[size];
			  System.out.println("100��° �ε��� �� : "+arr[100] );
			  
		  }catch(NegativeArraySizeException e) {
			  System.out.println("�迭�� ũ��δ� ������ ������ �� �����ϴ�.");
		  } 
		  catch(RuntimeException e ) {
			  System.out.println("���ܰ� �߻��ϱ� ����. �迭�� ũ�⸦ ������ �Է��߰ų� �������� �ε����� ��������.");
		  } 
		  // ���� catch ���� ��� ������ �߿��ϴ�.
		  //=> ��������� ������ ���� �ڽ�Ÿ���� ���� Ŭ������ �ش��ϴ� catch ���� ���� ����ؾ� �Ѵ�.
		  //=> ������ ū �θ�Ŭ���� ���� ����Ѵٸ� �ڽ�Ŭ������ �ش��ϴ� catch ������ Unreachable ������ �߻��Ѵ�!	  
	
		  System.out.println("���α׷� ����");
	  }
	   /*
	    * * RuntimeException ���õ� ������
	    * - ���ǹ����� �ذ� ���� : ���� ��ü�� �߻� �ȵǰԲ� �������ִ� ��ó�� ȿ��
	    *                    �����ڰ� �ҽ��ڵ�� ���ʿ� �ڵ鸵 �ϴ°� (����ó�� x)
	    * - ����ó�� �������� �ذ� ���� : ���ܰ� �߻��� ������ ����ؼ� �� �� ������ ������ �̸� �����صδ°�
	    *                          ���ܰ� �߻��ϰ� ������ ��ó�� ���
	    * ������ ������ ��Ȳ => ���ǹ����� �ذ��ϴ� ���� �� �����Ѵ�.
	    * ������ �Ұ����� ��Ȳ => ����ó���� �������� �ذ��ؾ߸� �Ѵ�. (�Ⱦ��� �����Ͽ��� �߻�)
	    * 
	    * RuntimeException  == Unchecked Exception == ���� ������ ����
	    */
	   //UncheckedException ���⼭ try-catch, throws �����ϴ�. 
	  
	
	
	
}





