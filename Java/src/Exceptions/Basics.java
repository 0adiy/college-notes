package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Basics {
  public static void main(String[] args) {
    basicTryCatchFinally();
    problemWithFinally();
    tryCatchWithResources();
    customExceptionHandler();
  }

  private static void basicTryCatchFinally() {
    // try catch and finally blocks
    // try has some code that may generate exceptions
    try {
      var reader = new FileReader("abc.txt");
      reader.read();
      new SimpleDateFormat().parse("");
      // must close these things
      reader.close();
    }
    // exceptions can be catched based on there type as well
    // first catch specific exceptions then more general ones
    // look at hierachy
    // might throw any one of these exceptions
    catch (FileNotFoundException | ParseException f) {
      System.out.println(f.getMessage());
    }
    // base exception class
    catch (Exception e) {
      System.out.println("Some general error happend\nmessage: " + e);
    } finally {
      System.out.println("Method ended");
    }
  }

  private static FileReader reader2;

  private static void problemWithFinally() {
    try {
      reader2 = new FileReader("abc.txt");
    } catch (FileNotFoundException e) {
      System.out.println("file not found");
    } catch (IOException e) {
      System.out.println("IO error occured");
    } finally {
      if (reader2 != null) {
        try {
          reader2.close();
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  }

  private static void tryCatchWithResources() {
    // when try is used with resource it gets closed automatically
    // Resources should have interface AutoClosable
    try (
        // specifying resources
        var reader = new FileReader("abc.txt");
        var writer = new FileWriter("abc.txt")) {
      reader.read();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    // finally not needed
  }

  // we need to use thorows keyword to specify if a method can throw some error
  private static float customExceptionThrower(float x) throws IOException {
    if (x < 0) {
      throw new IOException("Invalid value of x");
    }
    return x;
  }

  private static void customExceptionHandler() {
    try {
      customExceptionThrower(33.1f);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
