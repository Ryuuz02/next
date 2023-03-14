package next;

public class next {
	public static void main(String[] args) {
		String hello = "hello";
		System.out.println(hello.length());
		System.out.println(hello.charAt(0));
		System.out.println(hello.substring(2));
		System.out.println(hello.substring(2,4));
		System.out.println(hello.replace("l", "1"));
		System.out.println(hello.replaceAll("e", "3"));
		System.out.println(hello.toUpperCase());
		System.out.println(hello.toLowerCase());
	}
}
