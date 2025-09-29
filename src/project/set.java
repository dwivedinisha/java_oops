import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class set {
  
	public static void main(String[] args) {
        Character obj1=new Character('A');
        char ch= obj1.charValue();
        System.out.println(ch);
        int x= obj1.compareTo(obj1);
        System.out.println(x);
        Integer obj3=new Integer(12);
        int a=obj3.intValue();
        System.out.println(a);
        boolean  b1=obj3==12?true:false;
        System.out.println(b1);
        System.out.println("---------HashList---------");
        HashSet<Integer> hs=new HashSet<>();
        hs.add(12);
        hs.add(13);
        hs.add(14);
        hs.add(15);
        hs.add(16);
        hs.add(17);
        System.out.println(hs);
        System.out.println("---------ArrayList---------");
        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(3);
        list.add(6);
        list.add(7);
        System.out.println(list);
        System.out.println("---------TreeList---------");
        Set<Integer> ts=new TreeSet<>();
        ts.add(24);   
        ts.add(4);
        ts.add(5);                        
        ts.add(15);
        System.out.println(ts);
    }
    }