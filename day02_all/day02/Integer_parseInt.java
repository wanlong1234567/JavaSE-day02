package day02;
/**
 * ��װ���ṩ��һ����̬����:
 * parseXXX(String str)
 * ���Խ��������ַ���ת��Ϊ��Ӧ�Ļ����������ݡ�����
 * ǰ���Ǹ��ַ��������������ܱ��û������ͱ��档
 * @author adminitartor
 *
 */
public class Integer_parseInt {
	public static void main(String[] args) {
		String str = "123";
		int d = Integer.parseInt(str);
		System.out.println(d+1);//124
		
		double dd = Double.parseDouble(str);
		System.out.println(dd+1);//124.123
	}
}







