package day02;
/**
 * String֧��������ʽ������:
 * String replaceAll(String regex,String str)
 * ����ǰ�ַ���������������ʽ�Ĳ����滻Ϊ����
 * ���ַ���
 * 
 * @author adminitartor
 *
 */
public class String_replaceAll {
	public static void main(String[] args) {
		String str = "abc123def456ghi";
		/*
		 * �����ֲ����滻Ϊ:#NUMBER#
		 */
		str = str.replaceAll("\\d+", "#NUMBER#");
		System.out.println(str);
	}
}








