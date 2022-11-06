/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package assignment;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.*;

import org.junit.Test;

public class AppTest {
    
  /**
     * Test of CalculateISBNCheck method, of class App.
     */
   @Test
    public void tc1() {
        assertEquals ("304013341X",App.calculateISBNCheck(304013341));
    }
    
    @Test
    public void tc2() {
        assertEquals ("1841462012",App.calculateISBNCheck(184146201));
    }
    
    @Test
    public void tc3() {
        assertEquals ("1841462020",App.calculateISBNCheck(184146202));
    }
    
    /**
     * Test of isValidDNA method, of class App.
     */
    @Test
    public void tc4() {
        assertEquals (true,App.isValidDNA("ATAGCGGCAT"));
    }
    
    @Test
    public void tc5() {
        assertEquals (false,App.isValidDNA("ABCDEFHIJK"));
    }
    
    @Test
    public void tc6() {
        assertEquals (true,App.isValidDNA("atcgatcg"));
        
    }
    
    /**
     * Test of calculateCommon method, of class App.
     */
    @Test
    public void tc7() {
        assertEquals (1,App.calculateCommon("Hello","Hi"));
        
    }
    @Test
    public void tc8() {
        assertEquals (2,App.calculateCommon("Hello","Greetings"));
        
    }
    
    /**
     * Test of checkPalindrome method, of class App.
     */
    @Test
    public void tc9() {
        assertEquals (true,App.checkPalindrome(45554));
        
    }
    @Test
    public void tc10() {
        assertEquals (false,App.checkPalindrome(14651));
        
    }
    /**
     * Test of drawBarChart method, of class App.
     */
    @Test
    public void tc11() {
        assertEquals (9,App.drawBarChart(12321));
        
    }
    
    @Test
    public void tc12() {
        String expected = String.format("1: *2: **3: ***2: **1: *" ,
        System.lineSeparator(),
        System.lineSeparator());
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);
        
        App.drawBarChart(12321);// call the drawBarChart method
        
      String[] lines = baos.toString().split(System.lineSeparator());
      String actual=lines[0];
      for (int i=1; i< lines.length ;i++)
            actual += lines[i];
       // checkout output
       Assert.assertEquals(expected,actual);
    }
}
