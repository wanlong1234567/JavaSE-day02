package day02;
/**
 * ��������Point��дObject����ط���
 * @author adminitartor
 *
 */
public class TestPoint {
	public static void main(String[] args) {
		Point p = new Point(1,2);
		/*
		 * Object�����˷���:
		 * String toString()
		 * ͨ������������Ҫʹ��һ�������toString
		 * ��������Ӧ����д�÷�������ΪObject�ṩ
		 * �ĸ÷������ص��Ǹö���ľ��:
		 * ����@��ַ
		 * �����ò������ڸö������ݵ�ʵ�������Ϣ��
		 */
		String str = p.toString();
		System.out.println(str);
		/*
		 * System.out.println(Object obj)
		 * �÷������ǽ���������toString��������
		 * ���ַ������������̨��
		 */
		System.out.println(p);
		
		Point p2 = new Point(1,2);
		System.out.println("p2:"+p2);
	
		System.out.println(p==p2);//false
		System.out.println(p.equals(p2));//true
		
		
	}
}






