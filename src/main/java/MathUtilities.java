 

public class MathUtilities {

    /**
     * Add two number together
     *
     * @param baseValue  first number
     * @param valueToAdd number
     * @return the sum of the two numbers
     */
    public Integer add(Integer baseValue, Integer valueToAdd) {
        return baseValue + valueToAdd;
    }

    /**
     * Add two number together
     *
     * @param baseValue  first number
     * @param valueToAdd second number
     * @return the sum of the two numbers
     */
    public Double add(Double baseValue, Double valueToAdd) {
        return baseValue + valueToAdd;
    }

    /**
     * Get half the value of the number
     *
     * @param number the number given
     * @return the half of the number in double
     */
    public Double half(Integer number) {
        double division = 2;
        return number / division;

        // return (double) (number /2);    you have to cast it to a double..
        // return number/2.0;     //this is the cleanest... 2.0 turns it into a double..
    }

    /**
     * Determine if the number is odd
     *
     * @param number the number given
     * @return true if the number is odd, false if it is even
     */
    public Boolean isOdd(Integer number) {

        boolean value = number % 2 == 1;
        if (value) {
            return true;
        } else {
            return false;
        }
    }
    // if (number %2 ==1){
//    return true;
//     }else {            // you dont need else if only thing left is to return false...
//  return false;}

    // return number % 2 == 1; //  this is gonna be a boolean expression.... so no need if statement..
  /**
   * Multiply the number by itself
   * @param number the number given
   * @return the result of the number multiply by itself
   */
  public Integer square(Integer number) {
      return number * number;    //thisis better
  }
  // return (int) Math.pow(number, 2);

}
