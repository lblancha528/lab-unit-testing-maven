package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Tests of the sample methods.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class TestSampleMethods {
  /**
   * A test that should succeed.
   */
  @Test
  void sampleSuccesfulTest() {
    assertEquals(2, 2);
  } // sampleSuccessfulTest()

  /**
   * A test that should fail.
   */
  void sampleFailingTest() {
    assertEquals(2, 3);
  } // sampleFailingTest()

  @Test
  public void test2() {
    assertEquals(15, 3*5, "stupid test");
  } // test2()

  @Test 
  public void testConversion(){
    assertEquals(32, SampleMethods.c2f(0), "freezing");
  }

  @Test
  public void test4(){
    assertEquals(212, SampleMethods.c2f(100), "212 Farenheight"); 
  }

  @Test
  public void testSum(){
    int[] values = { 1, 2, 3 };
    assertEquals(6, SampleMethods.sum(values), "sum 6");
  } // testSum

  @Test
  public void testSum2(){
    int[] values = { 2, 4, 6, 8 };
    assertEquals(20, SampleMethods.sum(values), "even values");
  } // testSum2

  @Test
  public void testSum3(){
    int[] values = { 1, 3, 5 };
    assertEquals(9, SampleMethods.sum(values), "odd values");
  } // testSum3

  @Test
  public void testExtremes() {
    int tmp = Integer.MAX_VALUE - 10;
    int[] values = { tmp, tmp, -tmp, -tmp };
    assertEquals(0, SampleMethods.sum(values), "extreme values");
 } // testExtremes

  @Test
  public void testExpt(){
    int expected = 1;
    for (int i = 0; i <= 10; i++){
      assertEquals(expected, SampleMethods.expt(2, i), "base 2");
      expected = expected * 2;
    } // for
  } // testExpt

  @Test
  public void testExpt2(){
    int expected = 1;
    for (int i = 0; i <= 10; i++){
      assertEquals(expected, SampleMethods.expt(3, i), "base 3");
      expected = expected * 3;
    } // for
  } // testExpt

  @Test
  public void testExpt3(){
    int expected = 1;
    for (int i = 0; i <= 10; i++){
      assertEquals(expected, SampleMethods.expt(-2, i), "base -2");
      expected = expected * 2;
    } // for
  } // testExpt

   /**
   * Check that removeAs works as expected.
   */
  @Test
  public void testRemoveAs() {
    assertEquals("", 
                 SampleMethods.removeAs(""),
                 "empty string");
    assertEquals("hello", 
                 SampleMethods.removeAs("hello"),
                 "no as");
    assertEquals("", 
                 SampleMethods.removeAs("a"),
                 "eliminate one a");
    assertEquals("", 
                 SampleMethods.removeAs("aaaa"),
                 "eliminate many as");
    assertEquals("pin", 
                 SampleMethods.removeAs("pain"),
                 "eliminate one a, short string");
    assertEquals("lphbet", 
                 SampleMethods.removeAs("alphabet"),
                 "eliminate many as, medium string");
    assertEquals("BCDEFGHIJKLMNOPQ",
                 SampleMethods.removeAs("aBaaCDaaaEFGaaaaHIJKaaaaLMNaaaOPaaQa"),
                 "eliminate many as, silly string");
    assertEquals("bbb",
                 SampleMethods.removeAs("aaabbbaaa"),
                 "eliminate prefix and suffix as");
  } // testRemoveAs

} // class TestSampleMethods
