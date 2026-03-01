class GoogleRunner{
 
    public static void main(String[] args) {

        Google google1 = new Google("Google LLC", "Larry Page", "Sergey Brin", 1998,
                "Mountain View, California", "Sundar Pichai", 180000L, 282.8,
               "Search Engine", "Google Search", true, "GOOGL",
               "Alphabet Inc.", "Gmail", "Google Cloud", "Android",
                "YouTube", "Google Chrome", "Gemini AI", 70);
        google1.details();

        Google google2 = new Google("Google India", "Sundar Pichai", "Thomas Kurian", 2004,
                "Bengaluru", "Sanjay Gupta", 25000L, 35.6,
               "Cloud Services", "Google India Search", true, "GOOG-IN",
               "Alphabet Asia", "Gmail India", "Google Cloud India", "Android 14",
                "YouTube India", "Chrome Enterprise", "Gemini Pro", 15);
           google2.details();

        Google google3 = new Google("Google Europe", "Demis Hassabis", "Jeff Dean", 2006,
                "London", "Matt Brittin", 40000L, 50.8,
               "AI Research", "Google EU Search", true, "GOOG-EU",
              "Alphabet Europe", "Gmail EU", "Cloud Europe", "Android EU",
                "YouTube EU", "Chrome EU", "Gemini Ultra", 22);
         google3.details();

        Google google4 = new Google("Google Japan", "Hiroshi Lockheimer", "Kent Walker", 2007,
                "Tokyo", "Yoshiki Hori", 18000L, 20.3,
               "Mobile Services", "Google JP Search", true, "GOOG-JP",
              "Alphabet Japan", "Gmail JP", "Cloud JP", "Android JP",
                "YouTube JP", "Chrome JP", "Gemini JP", 12);
          google4.details();
 
        Google google5 = new Google("Google Australia", "Mel Silva", "Paul Manicle", 2008,
                "Sydney", "Mel Silva", 12000L, 18.5,
                "Digital Ads", "Google AU Search", true, "GOOG-AU",
                "Alphabet AU", "Gmail AU", "Cloud AU", "Android AU",
                "YouTube AU", "Chrome AU", "Gemini AU", 10);
        google5.details();

        Google google6 = new Google("Google Canada", "Sabrina Geremia", "Sam Sebastian", 2009,
                "Toronto", "Sabrina Geremia", 15000L, 22.1,
               "Maps Services", "Google CA Search", true, "GOOG-CA",
               "Alphabet Canada", "Gmail CA", "Cloud CA", "Android CA",
                "YouTube CA", "Chrome CA", "Gemini CA", 11);
          google6.details();

        Google google7 = new Google("Google Brazil", "Fabio Coelho", "Berthier Ribeiro", 2010,
                "Sao Paulo", "Fabio Coelho", 14000L, 16.9,
               "Advertising", "Google BR Search", true, "GOOG-BR",
               "Alphabet Brazil", "Gmail BR", "Cloud BR", "Android BR",
               "YouTube BR", "Chrome BR", "Gemini BR", 9);
      google7.details();

        Google google8 = new Google("Google Singapore", "Ben King", "Mark Zawacki", 2011,
                "Singapore", "Ben King", 10000L, 14.2,
               "Enterprise Solutions", "Google SG Search", true, "GOOG-SG",
               "Alphabet SG", "Gmail SG", "Cloud SG", "Android SG",
              "YouTube SG", "Chrome SG", "Gemini SG", 8);
          google8.details();

        Google google9 = new Google("Google UAE", "Lino Cattaruzzi", "Matt Brittin", 2012,
              "Dubai", "Lino Cattaruzzi", 9000L, 12.4,
                "Digital Marketing", "Google UAE Search", true, "GOOG-UAE",
               "Alphabet UAE", "Gmail UAE", "Cloud UAE", "Android UAE",
                "YouTube UAE", "Chrome UAE", "Gemini UAE", 7);
       google9.details();

        Google google10 = new Google("Google Africa", "Alex Okosi", "Juliet Ehimuan", 2013,
                "Nairobi", "Alex Okosi", 8000L, 10.1,
               "Tech Development", "Google Africa Search", true, "GOOG-AF",
              "Alphabet Africa", "Gmail Africa", "Cloud Africa", "Android Africa",
                "YouTube Africa", "Chrome Africa", "Gemini Africa", 6);
        google10.details();
    }
}