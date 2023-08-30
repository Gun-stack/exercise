
public class StringBufferTest {

		public static void main(String[] args) {
			StringBuilder sb = new StringBuilder(100);
			sb.append("abcdefg");
			System.out.println(sb.capacity());
			System.out.println(sb.length());
			sb.insert(1, 'p');
			System.out.println(sb);
			System.out.println(sb.length());
			
			sb.delete(2, 5);
			System.out.println(sb);
			
			
			sb.reverse();
			System.out.println(sb);
			System.out.println(sb.length());
			sb.setLength(10);
			System.out.println(sb.length());
		}
}
