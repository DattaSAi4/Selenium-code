package Collections;

import java.util.Vector;

/*Collections Framework
 * 
 * it is the one of the framework provided by java which contains interfaces implements 
 * classes the main adavantanage of this frame work was to store objects in to single entity
 * ************ In Collection framework we have to remember ************
 * what is the list 
 * add to list 
 * retrive from the list 
 * delete from the list 
 * verification for the list 
 * updation to the list
 * Collections has two interfaces 1.collection 2.maps
 *  collection had three interfaces 1.list 2.set 3.Queue
 *  list interface implements in the class linked list ,vector and array list 
 *  Vector is like the dynamic array which can grow or shrink its size. 
 *  Unlike array, we can store n-number of elements in it as there is no size limit.
 *   It is a part of Java Collection framework since Java 1.2. 
 *   It is found in the java.util package and implements the List interface, 
 *   so we can use all the methods of List interface here.

It is recommended to use the Vector class in the thread-safe implementation only. If you don't need to use the thread-safe implementation, you should use the ArrayList, the ArrayList will perform better in such case
 * */

//Vector class implements list interface why vector: the  default size of the vector 
//was 10 increases if allocation completes means  the capaticy wil be double 

public class collections {
public static void main(String[] args) {
	
	Vector<Integer> l1 = new Vector<Integer>();
	//Add to the list
	l1.add(1);
	l1.add(2);
	l1.add(3);
    l1.add(4);
    Vector<Integer> l2 = new Vector<Integer>();
    l2.add(1);
    l2.add(8);
    l1.addAll(l2);
    System.out.println(l1);
    //Retrive from the list 
    System.out.println(l1.get(3));
    System.out.println(l1.get(2));
    //Delete from the vector 
    System.out.println("Deleted"+l1.remove(3));
    System.out.println(l1);
    ///verification 
   System.out.println( l1.contains(l2));
    
    
    
}
}
