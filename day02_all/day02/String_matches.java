package day02;

import java.util.Scanner;

/**
 * �ַ���֧��������ʽ����ط���֮һ:
 * boolean matches(String regex)
 * ʹ�ø�����������ʽƥ�䵱ǰ�ַ����ĸ�ʽ�Ƿ�
 * �����������ʽҪ�������򷵻�true
 * 
 * @author adminitartor
 *
 */
public class String_matches {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������email��ַ:");
		String email = scanner.nextLine();
		/*
		 * email������ʽ:
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\.[a-zA-Z]+)+
		 * 
		 */
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z]+)+";
		System.out.println(regex);
		
		/*
		 * String�ṩ��macthes�������������
		 * ���ʽ���㲻�ӱ߽��(^$)Ҳ����ȫƥ��
		 * ��֤
		 */
		boolean tf = email.matches(regex);
		if(tf){
			System.out.println("�������ַ");
		}else{
			System.out.println("�����ַ��ʽ����ȷ!");
		}
	}
}










