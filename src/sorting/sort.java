package sorting;
import java.util.*;


class A implements Comparator<String>{
//	@Override
//	public int compare(Integer i,Integer j) {
//		if(i%10 > j%10) {
//			return 1;
//		}else {
//			return -1;
//			
//		}
//	}
	@Override
	public int compare(String i,String j) {
//		int len1 = i.length();
//		int len2 = j.length();
		char a = i.charAt(0);
		char b = j.charAt(0);
		
		if(a > b) {
			return 1;
		}else {
			return -1;
			
		}
	}
}



public class sort {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(43);
		list.add(31);
		list.add(72);
		list.add(29);
		list.add(24);
		
//		Collections.sort(list);
//		System.out.println(list);
//		Collections.sort(list, new A());
//		System.out.println(list);
		
		List<String> names = new ArrayList<>();
		names.add("Ahruv");
		names.add("Mahi");
		names.add("Nitin");
		names.add("Bay");
		
		
//		Collections.sort(names);
		System.out.println(names);
		Collections.sort(names, new A());
		System.out.println(names);
		
	}
}
