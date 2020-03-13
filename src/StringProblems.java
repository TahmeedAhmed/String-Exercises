import java.util.HashMap;
import java.util.Map;

public class StringProblems {
    public static void main(String[] args) {
        //printAndCountDuplicateCharacters("programmingg");
        //printDuplicateStrings("javaj");
        //System.out.println("\n NEW");
    }

    // Q1
    public static void printDuplicateStrings(String str){ // method prints duplicate characters in a given string
        if (str==null) return;

        for (int i=0; i<str.length(); i++){
            String newString = str.substring(i+1);
            char currentChar = str.charAt(i);

            for (int j=0; j<newString.length(); j++){
                if (newString.charAt(j)==currentChar) {
                    System.out.println("Repeating char: " + newString.charAt(j));
                }
            }
        }
    }


    // Q2
    public static boolean isAnagram(String a, String b){
        int numbOfSame = 0;
        if (a.length() == b.length()){
            for (int i=0; i<a.length(); i++){

                for (int j=0; j<b.length(); j++){
                    if (a.charAt(i) == b.charAt(j)){
                        numbOfSame++;
                        break;
                    }
                }
            }
        }
        if (a.length() == numbOfSame) return true;
        else return false;
    }



    // Q3
    public static void printFirstNonRepeatedCharacter(String a){
        for (int i=0; i<a.length(); i++) {
            String newString = a.substring(i+1);
            if (  !(  newString.contains(""+a.charAt(i)) )    ){
                System.out.println(a.charAt(i));
                return;
            }
        }
    }




    // Q4
    public static String reverseStringRecursion(String a){
        if (a.length() == 0){
            return "";
        }
        else return reverseStringRecursion(a.substring(1)) + a.charAt(0);
    }
    // Q4
    public static String reverseStringIteration(String a){
        String newString = "";
        for (int i=a.length()-1; i>=0; i--){
            newString += a.charAt(i);
        }
        return newString;
    }




    // Q5
    public static boolean checkIfStringContainsDigitsOnly(String a){      //48 ->0    57->9
        for (int i=0; i<a.length(); i++){
            if (a.charAt(i) < 48 || a.charAt(i) > 57){
                return false;
            }
        }
        return true;
    }



    // Q6
    public static void printAndCountDuplicateCharacters(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for (int k=0; k<str.length(); k++ ){
            map.put(str.charAt(k), 1);
        }

        for (int i=0; i<str.length(); i++){
            char currentChar = str.charAt(i);
            int count = 1;

            for (int j=0; j<str.length(); j++){
                if (str.charAt(j) == currentChar && j!=i){
                    count++;
                }
            }

            if (count > 1) {
                map.put(currentChar, count);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }



    // Q7
    public static void printNumbVowelsAndConsonants(String a){
        int vowelsCount = 0;
        int consonantsCount = 0;

        for (int i=0; i<a.length(); i++){
            if (a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u')
                vowelsCount++;
            else consonantsCount++;
        }
        System.out.println(vowelsCount + " vowels and " + consonantsCount + " consonants");
    }




    // Q8
    public static int numbOfOccurrencesOfCharInString(String str, char c){
        if(str==null) return 0;
        else if (str=="") return 0;

        int count = 0;

        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)==c) count++;
        }
        return count;
    }




    // Q9
    public static char printHighestOccurringChar(String a){
        int maxOccur=0;
        char maxOccurredChar = ' ';

        for (int i=0; i<a.length(); i++){
            int currentLetterOccurrences = 0;
            char currentChar = a.charAt(i);

            for (int j=0; j<a.length(); j++){
                if (a.charAt(j)==currentChar)
                    currentLetterOccurrences ++;
            }
            if (currentLetterOccurrences > maxOccur){
                maxOccur = currentLetterOccurrences;
                maxOccurredChar = currentChar;
            }
        }
        return maxOccurredChar;
    }





    // Q10
    public static String removeACharFromString(String str, char c){ // removes first occurrence
        String newString = "";
        boolean removedChar = false;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)!=c ){
                newString += str.charAt(i);
            }
            else{
                if (removedChar == false){
                    removedChar = true;
                }
                else {
                    newString += str.charAt(i);
                }
            }
        }
        return newString;
    }

}
