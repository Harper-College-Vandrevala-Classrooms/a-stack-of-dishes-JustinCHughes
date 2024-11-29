package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDishStack {

  DishStack dishStack;

  @BeforeEach
  void setUp() {
    dishStack = new DishStack();
  }

  @Test
  void testEmpty() {
    assertEquals(0, dishStack.size());
  }

  @Test
  void testFourDishes() {
    Dish oneDish = new Dish("A dish with one fish pattern on it");
    Dish twoDish = new Dish("A dish with two fish patterns on it");
    Dish redDish = new Dish("A dish with a red fish pattern on it");
    Dish blueDish = new Dish("A dish with a blue fish pattern on it");

    dishStack.push(oneDish);
    dishStack.push(twoDish);
    dishStack.push(redDish);
    dishStack.push(blueDish);

    assertEquals(4, dishStack.size());
  }

  @Test
  void testPeek() {
    Dish oneDish = new Dish("A dish with one fish pattern on it");
    Dish twoDish = new Dish("A dish with two fish patterns on it");
    Dish redDish = new Dish("A dish with a red fish pattern on it");
    Dish blueDish = new Dish("A dish with a blue fish pattern on it");
    
    dishStack.push(oneDish);
    dishStack.push(twoDish);
    dishStack.push(redDish);
    dishStack.push(blueDish);

    assertEquals("A dish with a blue fish pattern on it", dishStack.peek().description);
  }

  @Test
  void testPop() {
    Dish oneDish = new Dish("A dish with one fish pattern on it");
    Dish twoDish = new Dish("A dish with two fish patterns on it");
    Dish redDish = new Dish("A dish with a red fish pattern on it");
    Dish blueDish = new Dish("A dish with a blue fish pattern on it");
    
    dishStack.push(oneDish);
    dishStack.push(twoDish);
    dishStack.push(redDish);
    dishStack.push(blueDish);

    assertEquals("A dish with a blue fish pattern on it", dishStack.pop().description);
  }

  @Test
  void testPopPop() {
    Dish oneDish = new Dish("A dish with one fish pattern on it");
    Dish twoDish = new Dish("A dish with two fish patterns on it");
    Dish redDish = new Dish("A dish with a red fish pattern on it");
    Dish blueDish = new Dish("A dish with a blue fish pattern on it");
    
    dishStack.push(oneDish);
    dishStack.push(twoDish);
    dishStack.push(redDish);
    dishStack.push(blueDish);

    dishStack.pop();

    assertEquals("A dish with a red fish pattern on it", dishStack.pop().description);
  }

  @Test
  void testPopPopPop() {
    Dish oneDish = new Dish("A dish with one fish pattern on it");
    Dish twoDish = new Dish("A dish with two fish patterns on it");
    Dish redDish = new Dish("A dish with a red fish pattern on it");
    Dish blueDish = new Dish("A dish with a blue fish pattern on it");
    
    dishStack.push(oneDish);
    dishStack.push(twoDish);
    dishStack.push(redDish);
    dishStack.push(blueDish);

    dishStack.pop();
    dishStack.pop();

    assertEquals("A dish with two fish patterns on it", dishStack.pop().description);
  }

  @Test
  void testPopPopPopPop() {
    Dish oneDish = new Dish("A dish with one fish pattern on it");
    Dish twoDish = new Dish("A dish with two fish patterns on it");
    Dish redDish = new Dish("A dish with a red fish pattern on it");
    Dish blueDish = new Dish("A dish with a blue fish pattern on it");
    
    dishStack.push(oneDish);
    dishStack.push(twoDish);
    dishStack.push(redDish);
    dishStack.push(blueDish);

    dishStack.pop();
    dishStack.pop();
    dishStack.pop();

    assertEquals("A dish with one fish pattern on it", dishStack.pop().description);
  }

  @Test
  void testPopNull() {
    assertEquals(null, dishStack.pop());
  }

  @Test
  void testPeekNull() {
    assertEquals(null, dishStack.peek());
  }

  @Test
  void maxStack() {
    Dish oneDish = new Dish("A dish with one fish pattern on it");
    Dish twoDish = new Dish("A dish with two fish patterns on it");
    Dish redDish = new Dish("A dish with a red fish pattern on it");
    Dish blueDish = new Dish("A dish with a blue fish pattern on it");
    
    dishStack.push(oneDish);
    dishStack.push(twoDish);
    dishStack.push(redDish);
    dishStack.push(blueDish);

    assertEquals(-1, dishStack.getMaxSize());
  }

  @Test
  void pushedTwoDishTwiceIntoMax() {
    DishStack maxDishStack = new DishStack(4);

    Dish oneDish = new Dish("A dish with one fish pattern on it");
    Dish twoDish = new Dish("A dish with two fish patterns on it");
    Dish redDish = new Dish("A dish with a red fish pattern on it");
    Dish blueDish = new Dish("A dish with a blue fish pattern on it");
    
    maxDishStack.push(oneDish);
    maxDishStack.push(twoDish);
    maxDishStack.push(redDish);
    maxDishStack.push(twoDish);
    maxDishStack.push(blueDish);

    assertEquals("A dish with two fish patterns on it", maxDishStack.peek().description);
  }

  @Test
  void testClear() {
    DishStack maxDishStack = new DishStack(4);

    Dish oneDish = new Dish("A dish with one fish pattern on it");
    Dish twoDish = new Dish("A dish with two fish patterns on it");
    Dish redDish = new Dish("A dish with a red fish pattern on it");
    Dish blueDish = new Dish("A dish with a blue fish pattern on it");

    maxDishStack.push(oneDish);
    maxDishStack.push(twoDish);
    maxDishStack.push(redDish);
    maxDishStack.push(twoDish);
    maxDishStack.push(blueDish);

    maxDishStack.clear();

    assertEquals(0,maxDishStack.size());
  }
}
