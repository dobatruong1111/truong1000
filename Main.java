package data_structures_and_algorithms.Exam;

import data_structures_and_algorithms.MyStack.Stack;
import ontapjava.stack_a_queue.filter_the_data.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedListStudent<Student> students = new LinkedListStudent<>();
        students.push(new Student("truong","k64a3","19000378",7.5));
        students.push(new Student("trang","k64a3","19000378",4.0));
        students.push(new Student("dung","k64a3","19000378",7.5));
        students.push(new Student("manh","k64a3","19000378",5.0));
        students.push(new Student("huong","k64a3","19000378",4.5));
        //students.filter(students.list);
        LinkedListStudent.Node p = students.filter(students.getList());
        while (p!=null) {
            System.out.println(p.student);
            p = p.next;
        }
        System.out.println();
        for (Student item:
             students) {
            System.out.println(item);
        }
        System.out.println();

        //System.out.println(students.gpaOfAllStudent(students.list)/students.size());
    }
}