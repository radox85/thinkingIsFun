package strings.are.fun;


public class StringsAreFun {
    public static boolean isPalindrome(String isPalindrome) {
        char[] wordToCheck = isPalindrome.toCharArray();
        int start = 0;
        int stop = wordToCheck.length - 1;
        while (start <= stop) {
            if (wordToCheck[start] != wordToCheck[stop])
                return false;
            start++;
            stop--;
        }
        return true;
    }

    public static Integer countOccurrences(String toBeTested, String toBeFound) {
        Integer result = 0;
        String changeToBeFoundTtoStar = toBeTested.replace(toBeFound, "*");
        char[] starsToFind = changeToBeFoundTtoStar.toCharArray();
        for (int i = 0; i < starsToFind.length; i++) {
            if (starsToFind[i] == '*') {
                result++;
            }
        }
        return result;
    }

    public static String rot13(String stringToCode){
        StringBuilder result = new StringBuilder();
        char[] arrayToCode = stringToCode.toCharArray();
        for (int i = 0 ; i < arrayToCode.length;i++){

            if (arrayToCode[i] == ' '){
                result.append(arrayToCode[i]);
                continue;
            }
           if (arrayToCode[i] <= 'm') arrayToCode[i]+=13;
           else arrayToCode[i] -=13;
           result.append(arrayToCode[i]);
        }
     return result.toString();

    }

}
