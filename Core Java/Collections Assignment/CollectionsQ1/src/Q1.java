import java.util.TreeMap;
import java.util.*;
public class Q1 {
	public static void main(String[] args)
	{
		TreeMap<Long,String> contact=new TreeMap<>();
		contact.put((long) 993874682, "Ankit");
		contact.put((long) 981274659, "Kartik");
		contact.put((long) 915768364, "Riya");
		contact.put((long) 987365383, "Anuj");
		System.out.println(contact.keySet());
		System.out.println(contact.values());
		System.out.println(contact);
	}
}