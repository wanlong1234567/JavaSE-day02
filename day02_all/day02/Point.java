package day02;
/**
 * ʹ��Point����Object��ط�����д����
 * 
 * Point������ڱ�ʾֱ������ϵ�ϵ�һ����
 * @author adminitartor
 *
 */
public class Point {
	private int x;
	private int y;
	
	public Point(){
		
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * ��дtoString������ԭ��
	 * toString���ص��ַ���Ӧ��������ǰ�����
	 * ������Ϣ(���Ե�ֵ)�������ʽ�����ݸ���
	 * ��ǰ��ʵ��������������
	 * 
	 */
	public String toString(){
		return "("+x+","+y+")";
	}
	
	/**
	 * ��дObject�ṩ��equals����
	 * equals���������Ŀ���ǱȽ��������������
	 * �Ƿ�һ�¡�
	 * �Ƚ�ԭ��:
	 * ���������������ֵ���бȽϣ���һ��Ҫ������
	 * ����ֵ����ͬ��������ݵ�ǰ�������������
	 * 
	 */
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(obj == this){
			return true;
		}
		if(obj instanceof Point){
			Point p = (Point)obj;
			return this.x==p.x&&this.y==p.y;
		}
		return false;
	}
	
}

















