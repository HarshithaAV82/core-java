package com.xworkz.language;

import java.util.Arrays;

public class Language{
        String name;
        int users;
        String[] technologies;
        LanguageOrigin origin;
        LanguageType type;

        public Language(String name, int users, String[] technologies, LanguageOrigin origin, LanguageType type){
            this.name = name;
            this.users = users;
            this.technologies = technologies;
            this.origin = origin;
            this.type = type;
        }

        public void languageInfo(){

            System.out.println("Executing Language Info in Language Class");
        }

        public void typeInfo(){

            System.out.println("Executing Language Type Info in Language Class");
        }

        @Override
        public String toString()
        {
            return "Name: " + name + ", Users: " + users + ", Technologies: " + Arrays.toString(technologies) + ", Origin: " + origin + ", Type: " + type;
        }
    }

