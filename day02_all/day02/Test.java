package day02;
/**
 * www.baidu.com/index.html
 * 
 * www.baidu.com/reg?username=fanchuanqi&password=123456
 * 
 * ����HTTP�����е���������Ϣ
 * �����и�ʽ:
 * method uri protocol-version
 * ���� ��Դ·�� Э��汾
 * 
 * ����:
 * GET /index.html HTTP/1.1
 * 
 * GET /reg?username=fanchuanqi&password=123456 HTTP/1.1
 * 
 * @author adminitartor
 *
 */
public class Test {
	public static void main(String[] args) {
		String method;
		String uri;
		String protocol;
		
		String request = "GET /reg?username=fanchuanqi&password=123456 HTTP/1.1";
		
		String[] data = request.split("\\s");
		method = data[0];
		uri = data[1];
		protocol = data[2];
		System.out.println("method:"+method);
		System.out.println("uri:"+uri);
		System.out.println("protocol:"+protocol);
	
		parseUri(uri);
	}
	
	public static void parseUri(String uri){
		/*
		 * /reg?username=fanchuanqi&password=123456
		 * loc:/reg
		 * username:fanchuanqi
		 * password:123456
		 */
		//1�Ȱ���?���
		String[] data = uri.split("\\?");
		System.out.println("loc:"+data[0]);
		
		//2����&������в���
		data = data[1].split("&");
		for(int i=0;i<data.length;i++){
			//��ÿһ����������=���
			String[] arr = data[i].split("=");
			System.out.println(arr[0]+":"+arr[1]);
		}
		
		
		
	}
}




