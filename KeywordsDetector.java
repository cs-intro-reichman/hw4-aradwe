public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for(int i = 0; i < sentences.length; i++){
            String lowerCaseSentence = sentences[i].toLowerCase();
            for(int j = 0; j < keywords.length; j++){
                String lowerCaseKeyWord = keywords[j].toLowerCase();
                if (contains(lowerCaseSentence, lowerCaseKeyWord)) {
                    System.out.println(sentences[i]);
                    break; // No need to check for more keywords in this sentence after finding one.
                }
            }

        }
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
                
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
