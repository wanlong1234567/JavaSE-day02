package day02;
/**
 * ��װ��
 * java��8���������ͣ��������ǲ����������ͣ�������
 * ����������ԣ����Բ���ֱ�Ӳ����������Ŀ�����
 * Ϊ��java����8���������ͷֱ��ṩ�˶�Ӧ�İ�װ��
 * ����������⡣
 * @author adminitartor
 *
 */
public class IntegerDemo {
	public static void main(String[] args) {
		/*
		 * ��������ת��Ϊ��װ��ʱ�������ȡnew��
		 * ��ʽ����Ӧ��ʹ�ð�װ��ľ�̬����:valueOf
		 */
		Integer i1 = Integer.valueOf(128);
		Integer i2 = Integer.valueOf(128);
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		
		int d = i1.intValue();
		System.out.println(d);
		
		
		Double dou = Double.valueOf(123.123);
		
		double dd = dou.doubleValue();
		System.out.println(dd);
	
	}	
}







