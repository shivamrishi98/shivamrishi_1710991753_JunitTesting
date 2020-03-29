package com.chitkara;



import org.junit.Before;
import org.junit.Test;

public class AppTest 
{


    //TDD
    //remove A in first char
    //remove A in second char
    //remove A in both first and second char
    //don't remove A after first two char

    removeOperation removeOperation;
    @Before
    public void initiateClass(){
      this.removeOperation = new removeOperation();
    }

     String result;


    private void assertEquals(String bcd, String result) {
    }

    @Test
    public void RemoveAinFirstChar(){
        result= removeOperation.removeChar("ABCD");

        assertEquals("BCD",result);
    }
    @Test
    public void RemoveAinSecondChar(){
       result= removeOperation.removeChar("BACD");
        assertEquals("BCD",result);
    }
    @Test
    public void RemoveAinBothFirstAndSecondChar(){
      result= removeOperation.removeChar("AACD");
        assertEquals("CD",result);
    }
    @Test
    public void DontRemoveAfterFirstTwoChar(){
         result= removeOperation.removeChar("BBAA");
        assertEquals("BBAA",result);
    }
    @Test
    public void DontRemoveA(){
         result= removeOperation.removeChar("AABAA");
        assertEquals("BAA",result);
    }

}
