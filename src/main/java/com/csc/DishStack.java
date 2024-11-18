package com.csc;

import java.util.ArrayList;

public class DishStack {
  private ArrayList<Dish> stack;
  private int max;

  public DishStack(int max)
  {
    this.stack = new ArrayList<>();
    this.max = max;
  }

  public DishStack()
  {
    this.stack = new ArrayList<>();
    this.max = -1;
  }

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

  public int size()
  {
    return stack.size();
  }
}


