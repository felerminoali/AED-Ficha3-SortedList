/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import mz.com.osoma.aed.SortedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author feler
 */
public class UnitTest {

    public UnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test() {

        SortedList lista = new SortedList();

        lista.adiciona(20);
        lista.adiciona(40);

        String expected = "[20, 40]";

        
        Assert.assertEquals(expected, lista.toString());
       
        lista.adiciona(10);
        lista.adiciona(30);
        lista.adiciona(50);

        expected = "[10, 20, 30, 40, 50]";
        Assert.assertEquals(expected, lista.toString());

        lista.remove();

        expected = "[20, 30, 40, 50]";
        Assert.assertEquals(expected, lista.toString());

    }
}
