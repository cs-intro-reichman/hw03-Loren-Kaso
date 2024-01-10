/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str =  args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
    //   String newStr = "";
    //   for (int i = 0; i < s.length(); i++) {
    //     char ch = s.charAt(i); 
    //     if(isletter(ch)){
    //         if(newStr.indexOf(ch) == -1){
    //           newStr += s.charAt(i);
    //         }
    //       }else{
    //         newStr += s.charAt(i);
    //       }
    //     }
    //     return newStr;  
    // }

        String newStr = "";
      for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i); 
        if(s.charAt(i) != ' '){
            if(newStr.indexOf(ch) == -1){
              newStr += s.charAt(i);
            }
          }else{
            newStr += s.charAt(i);
          }
        }
        return newStr;  
    }

    // public static boolean isletter (char c){
    //   boolean letter = c >= 'a'&& c <= 'z'||c >= 'A' && c <= 'Z' ? true : false;
    //   return letter;
    // }
}