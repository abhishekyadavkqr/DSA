package String;
public class StringTut {
	public static void main(String[] args) {
		final StringBuffer st = new StringBuffer("hii");
		st.append(", Hello");
		System.out.println(st);
		final String s = "hii";
		s.concat(", Hello");
		System.out.println(s);
	}
}
