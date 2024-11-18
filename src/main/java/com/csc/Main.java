package com.csc;

public class Main {
  public static void main(String[] args)
  {
    DishStack stack = new DishStack();
    Dish oneDish = new Dish("A dish with one fish pattern on it");
    Dish twoDish = new Dish("A dish with two fish patterns on it");
    Dish redDish = new Dish("A dish with a red fish pattern on it");
    Dish blueDish = new Dish("A dish with a blue fish pattern on it");
  
    // The variable stack_size should equal zero.
    System.out.println("Stack size should be 0. It is currently: " + stack.size());
  
    stack.push(oneDish);
    stack.push(twoDish);
    stack.push(redDish);
    stack.push(blueDish);
  
    // The variable sizeAfterPushes should equal four.
    System.out.println("Stack size should be 4. It is currently: " + stack.size());
  
    // The variable peekedDish should have a description of "A dish with a blue fish pattern on it"
    System.out.println("Peeked item should be 'A dish with a blue fish pattern on it' it is: \n" + stack.peek().description);
  
    // The variable poppedDish should have a description of "A dish with a blue fish pattern on it"
    System.out.println("Popped item should be 'A dish with a blue fish pattern on it' it is: \n" + stack.pop().description);
  
    // The variable anotherPoppedDish should have a description of "A dish with a red fish pattern on it"
    System.out.println("Popped item should be 'A dish with a red fish pattern on it' it is: \n" + stack.pop().description);
  
    // The variable finalSize should equal two.
    System.out.println("Stack size should be 2. It is currently: " + stack.size());   
  }
}
