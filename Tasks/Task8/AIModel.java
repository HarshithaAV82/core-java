class AIModel {

    static void generate(String prompt) {
        if (prompt == null) {
            System.out.println("Prompt cannot be null. Please provide a prompt.");
            return;
        }
        System.out.println("Generating response for: " + prompt);
        System.out.println("Data is valid");  
    }


    static void generate(String prompt, String language) {
        if (prompt == null) {
            System.out.println("Prompt cannot be null. Please provide a prompt.");
            return;
        }
        if (language == null) {
            System.out.println("Language cannot be null. Please provide a language.");
            return;
        }
        System.out.println("Generating response in " + language + " for: " + prompt);
        System.out.println("Data is valid"); 
    }

    static void generate(String prompt, String language, boolean voice) {
        if (prompt == null) {
            System.out.println("Prompt cannot be null. Please provide a prompt.");
            return;
        }
        if (language == null) {
            System.out.println("Language cannot be null. Please provide a language.");
            return;
        }
        if (voice==false) {
            System.out.println("Voice must be enabled. Please set voice to true.");
            return;
        }

        System.out.println("Generating response for: " + prompt + "  Language: " + language + "  Voice enabled: " + voice);
        System.out.println("Data is valid");  
    }
}


