package com.csc;

import java.util.ArrayList;

public class DishStack {
  private ArrayList<Dish> stack;
  private int max;

  // Creates DishStack with a user defined max amount
  public DishStack(int max)
  {
    this.stack = new ArrayList<>();
    this.max = max;
  }

  // Creates DishStack where this.max is set to -1.
  // Later, max amount for DishStack is disregarded if negative
  public DishStack()
  {
    this.stack = new ArrayList<>();
    this.max = -1;
  }

  // Adds Dish to stack. As prior noted, Dish is added
  // if this.max is either negative or less than this.max
  public void push(Dish dish)
  {
    if(this.max < 0 || stack.size() < this.max)
    {
      stack.add(dish);
    }
    else
    {
      System.out.println("This stack is full. Adding another would exceed the allotted size.\n");
    }
  }

  // Removes and returns last dish in
  public Dish pop()
  {
    if(!stack.isEmpty())
    {
      return stack.remove(stack.size() - 1);
    }
    else
    {
      System.out.println("This stack is currently empty. There is nothing to pop.\n");
    }
    return null;
  }

  // Checks what the top of the stack is
  public Dish peek()
  {
    if(!stack.isEmpty())
    {
      return stack.get(stack.size() - 1);
    }
    else
    {
      System.out.println("This stack is currently empty. There are no items to peek.\n");
    }
    return null;
  }

  // Returns current stack's size
  public int size()
  {
    return stack.size();
  }

  // Returns stacks maximum size
  public int getMaxSize()
  {
    return this.max;
  }
}


