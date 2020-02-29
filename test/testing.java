/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dream4Net
 */
public class testing {
    
    public testing() {
    }
    static add hh;
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass(){
        
    }
    
    @Before
    public void setUp() throws Exception 
    {
        hh=new add();
        
    }
    
    @After
    public void tearDown() {
    }

    @Test 
    void testadd_twoposnum()
    {
        int act=hh.addition(4, 9);
        assertTrue(act==13);
        
    }
    
    @Test
     void testadd_twonegnum()
     {
     int act = hh.addition(-1, -3);
             assertTrue(act==-4);
     }
     @Test
     void testadd_1neg1posnum()
     {
     int act = hh.addition(-1, 9);
             assertTrue(act==8);
     }
     
     
     @org.junit.Test(expected=ArrayIndexOutOfBoundsException.class)
     void testadd_1negzeronum()
     {
     int act = hh.addition(-1, 0);
             assertTrue(act==0);
     }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
