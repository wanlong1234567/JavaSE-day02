package day02;
/**
 * 
 * @author adminitartor
 *
 */
public class Test2 {
	public static void main(String[] args) {
		String regex = "(wqnmlgb|cnm|nc|tmd|mdzz|mmp|djb|sb)";
		
		String message = "wqnmlgb!�����sb!����ô��ônc!tmd!���djb!";
		
		message = message.replaceAll(regex, "***");
		System.out.println(message);
	}
}
