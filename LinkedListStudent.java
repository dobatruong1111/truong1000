package data_structures_and_algorithms.Exam;


import data_structures_and_algorithms.MyStack.Stack;

import java.util.Iterator;

public class LinkedListStudent<D> implements Stack<D> {
    class Node {
        Student student;
        Node next;
    }
    private Node list;
    private int n;

    public LinkedListStudent() {
        list = null;
        n = 0;
    }

    public Node getList() {
        return list;
    }

    @Override
    public void push(D element) {
        Node node = new Node();
        node.student = (Student) element;
        node.next = list;
        list = node;
        n++;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n==0;
    }

    @Override
    public D pop() {
        if (n!=0) {
            D element = (D) list.student;
            list = list.next;
            n--;
            return element;
        } throw new NullPointerException("Stack null");
    }

    @Override
    public D peek() {
        if (n!=0) {
            D element = (D) list.student;
            return element;
        } throw new NullPointerException("Stack null");
    }

    @Override
    public Iterator<D> iterator() {
        return new LinkedListIterator<>();
    }

    class LinkedListIterator<D> implements Iterator<D> {
        Node node = list;
        @Override
        public boolean hasNext() {
            return node!=null;
        }
        @Override
        public D next() {
            if (node!=null) {
                D element = (D) node.student;
                node = node.next;
                return element;
            }
            return null;
        }
    }
    double gpaOfAllStudent(Node list) {
        Node temp = list;
        if (temp == null) {
            return 0.0;
        }
        return temp.student.getMediumScore() + gpaOfAllStudent(temp.next);
    }
    Node filter(Node list) {
        Node p = null;
        Node q = list;
        while (q!=null) {
            if (q.student.getMediumScore() >= 5) {
                Node r = new Node();
                r.student = q.student;
                r.next = p;
                p = r;
            }
            q = q.next;
        }
        return p;
    }
    
}