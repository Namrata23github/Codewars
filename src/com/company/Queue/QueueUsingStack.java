package com.company.Queue;

import java.util.Stack;

public class QueueUsingStack {

  Stack<Integer> stack1 ;
  Stack<Integer> stack2 ;
  /** Initialize your data structure here. */
  public QueueUsingStack() {

    stack1  = new Stack<>();
    stack2 = new Stack<>();

  }

  /** Push element x to the back of queue. */
  public void push(int x) {
    stack1.push(x);
  }

  /** Removes the element from in front of queue and returns that element. */
  public int pop() {

    if(stack2.empty()){
      while (!stack1.empty()){
        stack2.push(stack2.pop());
      }
    }
    return stack2.pop();

  }

  /** Get the front element. */
  public int peek() {

    if(stack2.empty()){
      while (!stack1.empty()){
        stack2.push(stack2.pop());
      }
    }
    return stack2.peek();
  }

  /** Returns whether the queue is empty. */
  public boolean empty() {
    if(stack2.isEmpty() && stack1.isEmpty()){
      return true;
    }
    return false;
  }


}


