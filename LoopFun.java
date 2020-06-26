 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          if(number==0) return 0;
          if(number==1) return 1;
          int answer = number;
          for(int n=number-1;n>=1;n--){
            answer *= n; 
          }
          return answer;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String[] splitArray = phrase.split(" ");
          String acronym = "";
          for(String word:splitArray){
              acronym+=word.charAt(0);
          }
          return acronym.toUpperCase();
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          if(word==null)  return null;
          if(word.trim().length()<1)  return null;
          String encrypted = "";
          for(int i=0;i<word.length()-1;i++){
              char charVal = word.charAt(i);
              char encryptedChar = charVal;
              
              //if overflow past z
              if(charVal+3>122)
                encryptedChar = (char)(((charVal+3)%122)+96);
              else if (charVal+3>90)
                encryptedChar = (char)(((charVal+3)%90)+64);
              else
                encryptedChar = (char)(charVal+3);
                
              encrypted += (char)(encryptedChar);
              
          }
          System.out.println(encrypted);
          return encrypted;
      }
}
