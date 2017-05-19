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
public class ArrayQueue1 {
    
    private int front;
    private int rear;
    private String []array;
    private int capacity;
  
    
    
    public ArrayQueue1(int capacity)
    {
        front=0;
        rear=0;
        this.capacity=capacity;
        array=new String [capacity];
        
    }
  public boolean IsEmpty()
  {
      if(front==rear)
          return true;
      else 
          return false;
  }
 public String FrontQueue()
 {
     if(IsEmpty()==true)
     { System.out.println("Error");
         return null;
     }
      else
         return array[front];
        
 }
  public String dequeue()
  {
      String temp;
      if(IsEmpty()==true)
      {
          System.out.println("Error");
          return null;
  }
      else{
          temp=array[front];
          array[front]=null;
         
          front=(front+1)% capacity;
      return temp;
         }
  }
    public void enqueue(String o)
  {
    
   if(size()==capacity-1)
   {
       System.out.println("Error");
   }
   else{
       array[rear]=o;
       rear=(rear+1)%capacity;
       System.out.println("Recently added to queue:"+o);
       }
  }
    public int size(){
          
    
        return (capacity -front+rear)% capacity;
    }
}

    
