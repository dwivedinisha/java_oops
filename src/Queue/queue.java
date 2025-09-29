package Queue;

//import java.util.Queue;
//import java.util.Deque;
//import java.util.ArrayDeque;
//import java.util.PriorityQueue;
//import java.util.LinkedList;
import java.util.*;

public class queue {
	public static void main(String[] args) {
		System.out.println(".......PriorityQueue.......");	
		Queue<Integer> q = new PriorityQueue<>();
		
		q.add(1);
		q.add(2);
		q.add(9);
		q.add(7);
		q.add(5);
		q.offer(4);
		System.out.println(q.peek());

		
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(".......LinkedList.......");	

		Queue<Integer> q1 = new LinkedList<>();
		q1.add(22);
		q1.add(23);
		q1.addAll(q);
		System.out.println(q1);
		System.out.println(q1.contains(23));
		System.out.println(q1.poll());
		System.out.println(q1);
		
		System.out.println(".......ArrayDeque.......");	

		Queue<Integer> q3 = new ArrayDeque<>();
		q3.add(11);
		q3.add(21);
		q3.add(91);
		q3.add(75);
		q3.add(53);
		System.out.println(q3);
		System.out.println(q3.contains(46));
		System.out.println(q3.poll());
		System.out.println(q3);
		
		System.out.println(".......ArrayDeque stack implementation.......");	
		
		Deque<Integer> st = new ArrayDeque<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		System.out.println(st);
		
		System.out.println(".......ArrayDeque queue implementation.......");
		
		Deque<Integer> q4 = new ArrayDeque<>();
		q4.add(1);
		q4.add(2);
		q4.add(3);
		q4.add(4);
		
		System.out.println(q4);
		
	}
}
