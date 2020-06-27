
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
        if(baseValue==null || valueToBeAdded==null)  return null;
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        if(valueToBeReversed==null)  return null;
        String reverse = "";
        int count = 0;
        for(int i=valueToBeReversed.length()-1;i>=0;i--){
            reverse += valueToBeReversed.charAt(i);
        }
        return reverse;        
        
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        if(word==null)  return null;        
        int index = word.length()/2;
        return word.charAt(index);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        if(value==null || charToRemove==null)  return null;        
        String outputStr = "";
        for(int i=0;i<value.length();i++){
            char charVal = value.charAt(i);
            if(charVal!=charToRemove)
                outputStr+=charVal;
        }
        return outputStr;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        if(sentence==null)  return null;
        if(sentence.trim().length()<1)  return null;
        String[] splitArray = sentence.split(" ");
        return splitArray[splitArray.length-1];
    }
}
