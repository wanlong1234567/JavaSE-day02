package day02;
/**
 * String֧��������ʽ������:
 * String[] split(String regex)
 * ����ǰ�ַ��������ݰ�������������ʽ�Ĳ��ֽ���
 * ��֣�����ֺ�����ɶ��ַ�������һ������󷵻� 
 * @author adminitartor
 *
 */
public class String_split {
	public static void main(String[] args) {
		String str = "abc123def456ghi";
		/*
		 * ���ڲ�ֵĹ����з�������ƥ���˲��
		 * ���֣���ô�����м���һ�����ַ�����
		 * ���������ַ���ĩβ����ƥ�䣬������
		 * ��ֿ��ַ����ᱻ���ԡ�
		 */
		String[] data = str.split("\\d");
		System.out.println(data.length);
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
		
	}
}







