import java.util.*; // Unused import (wildcard import, Google style prefers explicit imports)
import java.io.File;
import java.io.IOException;

public class BadJavaExample { // Should be in a file named BadJavaExample.java
  public static int VALUE=10; // Should be lowercase with underscores, e.g., VALUE should be value

  private String mystring="Hello"; // Should be `myString`

  public BadJavaExample(){ } // Missing Javadoc and spaces

  public void veryLongMethodNameThatIsTooLongAndDoesNotFollowProperStyleGuidelines(int a,int b) { // Method name is too long, missing space after commas
      if (a>0){ // Missing space around operators
      if(b>0){
      if(a+b>VALUE){ // Missing spaces
        System.out.println("Sum is greater than VALUE");
      } else { System.out.println("Sum is small."); } // Braces should be on new lines
    }}}

  public void nestedLoops(){ // Missing Javadoc
    for(int i=0;i<10;i++){ // No spaces around operators
      for(int j=0;j<10;j++){ 
        for(int k=0;k<10;k++){ 
          System.out.println("Deep nesting!"); // Deeply nested, hard to read
        }
      }
    }
  }

  public int magicNumbers() { 
    return 42; // Magic number, should be a constant
  }

  void nonPublicMethod(){ System.out.println("Not following naming rules!"); } // Should be private

  class AnotherClass{ // Should be in a separate file
    public void doSomething(){ System.out.println("Doing something!"); }
  }

  public static void main(String[] args){ // Missing Javadoc, should be formatted better
    BadJavaExample ex=new BadJavaExample(); // No spaces around `=`
    ex.veryLongMethodNameThatIsTooLongAndDoesNotFollowProperStyleGuidelines(5,10);
    ex.nestedLoops();
  }
}
