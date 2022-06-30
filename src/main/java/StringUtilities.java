
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {

        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {

        return baseValue + valueToBeAdded;
    }
    // return baseValue.concat(valueToBeAdded);

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String rev = new StringBuilder(valueToBeReversed).reverse().toString();
        return rev;
//        input1.append(valueToBeReversed);
//        input1.reverse(valueToBeReversed);
//        return valueToBeReversed.toString();
    }

    //return new StringBuilder(valueToBeReversed).reverse().toString();

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int length;
        int position;

        if (word.length() % 2 == 1) {           //position of odd character words
            position = word.length() / 2;
            length = 1;
        } else {
            position = word.length() / 2 - 1;   //position of even character word
            length = 2;
        }
        String result = word.substring(position, position + length);  //.substring (position is the middle char. ..
        char character = result.charAt(0);
        return character;
    }

    // return word.charAt(word.length()/2);



    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {

        String removed = value.replace(charToRemove, ' ');
        String removedSpace = removed.replaceAll("\\s","");
        return removedSpace;
    }
    // String s = value.replaceAll(String.valueOf(charToRemove,"");
    //return s;

    //return  value.replaceAll(String.valueOf(charToRemove), "");

//        String result="";
//        for(int i= 0; i< value.length(); i++){
//            if(Character.isLetter(value.charAt(i))){
//               result+=value.charAt(i);
//            }
//        }
//        return result;
//    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        //.substring Returns a string that is a substring of this string.
        // The substring begins with the character at the specified index and extends to the end of this string.
        String lastWord= sentence.substring(sentence.lastIndexOf(" ")+1);
        return lastWord;
    }
}

//String[] sarr = sentence.split(" ");
// return sarr[sarr.length-1];

//ArrayList<String> s = new ArrayList<>(sentence.split(" "));
// return s.get(s.size()-1);