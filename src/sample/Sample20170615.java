package sample;

public class Sample20170615 {
	public static void main(String[] args) {
		System.out.println("hello world!");
		test();
		getProperty();
	}

	public static void getProperty(){
	    System.out.print("Javaバージョン(java.version):");
	    System.out.println(System.getProperty("java.version"));
	    System.out.print("オペレーティングシステム名(os.name):");
	    System.out.println(System.getProperty("os.name"));
	}
	
	public static void test(){
		System.out.println("test!");
	}

	public static void test2(){
		System.out.println("test!");
	}

}
