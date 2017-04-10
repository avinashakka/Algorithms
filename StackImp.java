//Implement a Stack

import java.io.*;
import java.util.*;

class StackImp
{
    private class element
    {
      int val;
      element next;
    }

    element head;

    private int size()
    {
      if(this.head == null)
      {
        return 0;
      }
      else
      {
        int size = 0;
        element pointer = this.head;
        while(pointer != null)
        {
          size++;
          pointer = pointer.next;
        }
        return size;
      }
    }


    private void push(int v)
    {
      if(this.head == null)
      {
        this.head = new element();
        this.head.next = null;
        this.head.val = v;
      }
      else
      {
        element temp = new element();
        temp.val = v;
        temp.next = this.head;
        this.head = temp;
      }
    }

    private int pop()
    {
      if(this.head == null)
      {
        return -1;
      }
      else
      {
        int temp = this.head.val;
        this.head = this.head.next;
        return temp;
      }
    }

    private int peek()
    {
      if(this.head == null)
      {
        return -1;
      }
      else
      {
        return this.head.val;
      }
    }

    public static void main(String[] args)
    {
      StackImp stack = new StackImp();
      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.push(4);
      stack.push(5);
      stack.push(6);
      stack.push(7);
      stack.push(8);

      System.out.println("Current top: "+stack.peek());
      System.out.println("Pop: "+stack.pop());
      System.out.println("Size: "+stack.size());
      System.out.println("Current top: "+stack.peek());
      System.out.println("Pop: "+stack.pop());
      System.out.println("Pop: "+stack.pop());
      System.out.println("Pop: "+stack.pop());
      System.out.println("Size: "+stack.size());
      System.out.println("Pop: "+stack.pop());
      System.out.println("Size: "+stack.size());
    }



}
