/**
 * This is the standard package
 */
package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * This method greet the user.
   * @param someone is a string, representing a name.
   * @return returns a message, greeting the someone param.
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
