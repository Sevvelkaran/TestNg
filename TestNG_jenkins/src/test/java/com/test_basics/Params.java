package com.test_basics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Params {
  @Test
  @Parameters({"val1", "val2"})
  public void sum(int v1, int v2) {
	  int finalsum = v1+v2;
	  System.out.println(finalsum);
  }
  @Test
  @Parameters({"val1", "val2"})
  public void sub(int v1, int v2) {
	  int finalsub = v1-v2;
	  System.out.println(finalsub);
  }
  
  
}
