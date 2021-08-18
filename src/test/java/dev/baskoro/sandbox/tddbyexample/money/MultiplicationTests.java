package dev.baskoro.sandbox.tddbyexample.money;

import dev.baskoro.sandbox.tddbyexample.model.Dollar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTests {

  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    Dollar ten = five.times(2);
    assertEquals(10, ten.amount);
  }

  @Test
  public void testMultiplicationTwice() {
    Dollar five = new Dollar(5);
    Dollar product = five.times(2);
    assertEquals(10, product.amount);
    product = five.times(3);
    assertEquals(15, product.amount);
  }

}
