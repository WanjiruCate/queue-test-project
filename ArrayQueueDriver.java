/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayqueue1;

/**
 *
 * @author NAILA SHIRU
 */
public class ArrayQueueDriver {
    public static void main (String args[])
    {
        ArrayQueue1 a2=new ArrayQueue1(4);
        a2.IsEmpty();
        a2.enqueue("Shiru");
        a2.enqueue("Maureen");
        a2.enqueue("Mercy");
        System.out.println("Size is:"+a2.size());
        System.out.println("IsEmpty:"+a2.IsEmpty());
        System.out.println("Dequeued Item:"+a2.dequeue());
        System.out.println("Size is:"+a2.size());
     
}
}
