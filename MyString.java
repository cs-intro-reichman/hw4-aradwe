public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            char currentChar = str.charAt(i);
            if (currentChar >= 'A' && currentChar < 'Z') {
                // Convert uppercase to lowercase by adding 32 to its ASCII value
                newStr += (char)(currentChar + 32);
            }
            // Add the character as is if it's already lowercase
            else{
                newStr += currentChar;
            }
        }
        return newStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        
        if (str1 == "" || str2 =="") {
            return false;            
        }
        
        // If str2 is longer than str1, it can't be contained in str1
        if (str2.length() > str1.length()) {
            return false;
        }

        // Loop through str1
        for(int i = 0; i <= (str1.length() - str2.length()); i++){
            // Check if the substring of str1 starting at i matches str2
            boolean match = true;
            
            for(int j = 0; j < str2.length(); j++){
                if (str1.charAt(i+j) != str2.charAt(j)) {
                    match = false;
                    break; // Exit the inner loop if the characters don't match
                }
            }
            
            // If a match is found, return true
            if (match) {
                return true;
            }
        }
        
        return false;  // Return false if no match was found
    }
}
