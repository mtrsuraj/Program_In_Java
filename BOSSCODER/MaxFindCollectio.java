import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class MaxFindCollectio {
    public static void main(String[] args) {
        // set interface
        TreeSet<Integer> arr = new TreeSet<Integer>();
        arr.add(2);
        arr.add(233);
        arr.add(23);
        arr.add(432);
        arr.add(2);
        arr.add(332);
        // System.out.println(arr.removeAll(arr));

        // System.out.println(arr.isEmpty());
        // System.out.println("Higest number: " + arr.last());
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(12);
        hashSet.add(45);
        hashSet.add(15);
        hashSet.add(10);
        hashSet.add(23);
        hashSet.add(90);
        hashSet.add(90);
        System.out.println(hashSet);

        ArrayList<Integer> iter = new ArrayList<Integer>();
        iter.add(33);
        iter.add(243);
        iter.add(33);
        // System.out.println(iter);

        LinkedList<Integer> linked = new LinkedList<Integer>();
        linked.add(12);
        linked.add(43);
        linked.add(432);
        linked.add(43);
        linked.add(79);
        // System.out.println(linked);
        // Collections.sort(linked);
        // Collections.reverse(linked);
        // System.out.println(Collections.min(linked));
        // System.out.println("sorted linked list");
        for (int i : linked) {
            // System.out.println(i);
        }
        Vector<Integer> vec = new Vector<Integer>();
        vec.add(12);
        vec.add(1, 3);
        vec.add(54);
        vec.add(34);
        vec.add(67);
        vec.add(54);
        vec.add(54);
        vec.add(89);

        vec.add(54);
        // System.out.println(vec.lastIndexOf(54));

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(78);
        stack.push(67);
        stack.push(34);
        stack.push(98);
        stack.push(90);
        // System.out.println(stack);
        // stack.pop();
        // System.out.println("after pop");
        // System.out.println(stack.search(90));

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(12);
        queue.offer(54);
        queue.offer(10);
        // System.out.println(queue.poll());
        // System.out.println("After poll");
        // System.out.println(queue.offerLast(10));

        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        pQ.offer(27);
        pQ.offer(87);
        pQ.offer(45);
        pQ.offer(34);
        pQ.offer(9);
        pQ.offer(27);

        // System.out.println(pQ);
        // System.out.println(pQ.poll());
        // System.out.println("After poll");
        // System.out.println(pQ);

    }

}
