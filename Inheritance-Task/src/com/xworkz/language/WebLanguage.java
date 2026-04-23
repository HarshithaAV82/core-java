package com.xworkz.language;

public class WebLanguage extends Language{
        String framework;
        boolean isPopular;

        public WebLanguage(String name, int users, String[] technologies, LanguageOrigin origin, LanguageType type, String framework, boolean isPopular) {

            super(name, users, technologies, origin, type);
            this.framework = framework;
            this.isPopular = isPopular;
        }

        @Override
        public void languageInfo() {
            System.out.println("Overridden Language Info in WebLanguage");
        }

        @Override
        public void typeInfo() {
            System.out.println("Overridden Type Info in WebLanguage");
        }

        @Override
        public String toString() {
            return super.toString() + ", Framework: " + framework + ", Popular: " + isPopular;
        }
    }
