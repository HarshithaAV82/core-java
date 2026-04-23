package com.xworkz.language;

public class LanguageRunner{

        public static void main(String[] args) {

            System.out.println("Execute Parent Class Information");

            LanguageOrigin origin = new LanguageOrigin("Global", 1990);

            String[] technologies = {"HTML", "CSS", "Java", "JavaScript", "SQL"};

            Language language = new Language("Web Stack", 5000, technologies, origin, LanguageType.JAVA);

            language.languageInfo();
            language.typeInfo();
            language.toString();
            System.out.println(language);

            System.out.println("\nExecute Child Class Information");

            WebLanguage webLanguage = new WebLanguage("Full Stack", 8000, technologies, origin, LanguageType.JAVASCRIPT, "React", true);

            webLanguage.languageInfo();
            webLanguage.typeInfo();
            webLanguage.toString();
            System.out.println(webLanguage);
        }
    }

