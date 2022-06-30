import java.util.Locale;

public class LoopFun {

    /**
     * Given a number, return the factorial of that number.
     * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
     *
     * @param number
     * @return the factorial of the number
     */
    public Integer factorial(Integer number) {

        if (number == 0)
            return 1;

        return number * factorial(number - 1);    //this is a recursion... irl, boss might say they dont like..
    }

    //int f =1;                                 //use this instead...
    //for (int i =1; i <= number; i++){
    //f = f *i;}
    //return f; }

    //for (int i = number; i <0; i--)     // you can do this too like above...


    /**
     * Given a phrase, get the acronym of that phrase. Acronym is the combination of
     * the first character of each word in upper case.
     * For example, given "Ruby on Rails", this method will return "ROR"
     *
     * @param phrase
     * @return Upper case string of the first letter of each word
     */
    public String acronym(String phrase) {
        StringBuilder initials = new StringBuilder();      //stringbuilder
        for (String add : phrase.split(" ")) {   //for each statement to split sentence and store at variable add
            initials.append(add.charAt(0));           //adding first letter of each index to variable initials
        }
        return initials.toString().toUpperCase(); //toUpperCase function to uppercase the String..
    }                                             // need to .toString, because stringbuilder doesnt return a string..

    // String[] s = phrase.split(" ");



    //String[] sentense = phrase.split("");
    //String result = "";
    // for (string s: sentence) {
    // result = result + s.charAt(0);}
    //return result.toUpperCase();}




    /**
     * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
     * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
     * at the end of the alphabet, it will wraps around.
     * For example:
     * 'a' => 'd'
     * 'w' => 'z'
     * 'x' => 'a'
     * 'y' => 'b'
     *
     * @param word
     * @return the encrypted string by shifting each character by three character
     */
    public String encrypt(String word) {
        String shift = "";
        for (int i = 0; i < word.length(); i++) {
            char c = (char) (word.charAt(i) + 3);
            if (c > 'z')
                shift = shift + (char) (word.charAt(i) - 23);
            else {
                shift = shift + c;//(char) (word.charAt(i) +3);
            }
        }
        return shift;
        }
    }


// String alphabet = "abcdefghijklmnopqrstuvwxyz"
// StringBuilder encWord = new StringBuilder();
// for (int i-0; i <word.length(); i++){
//int idx = alphabet.indexof(word.charAt(i));
// idx +=3;
// idx = idx % 26;
//encWord.append(alphabet.charAt(idx));
//}
//return encWord.toString();
//}
//}
