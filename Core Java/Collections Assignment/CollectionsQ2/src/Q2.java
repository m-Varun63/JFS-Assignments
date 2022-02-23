import java.util.HashSet;

public class Q2 {
	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<>();
		hs.add("Ankit");
		hs.add("Kartik");
		hs.add("Riya");
		hs.add("Anuj");
		hs.add("Abhishek");
		
		System.out.println("Original");
		System.out.println(hs);
		System.out.println(hs.size());
		
		hs.add("varun");
		hs.add("Rakesh");
		
		System.out.println("After adding duplicate elements");
		System.out.println(hs);
		System.out.println(hs.size());
	}

}