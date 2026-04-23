class StreamingApp {

 
    static void watch(String show) {
        if (show == null) {
            System.out.println("Show name cannot be empty");
            return;
        }

        System.out.println("Watching: " + show);
        System.out.println("Watching data is valid");
    }

 
    static void watch(String show, String quality) {
        if (show == null) {
            System.out.println("Show name cannot be empty");
            return;
        }
        if (quality == null) {
            System.out.println("Quality cannot be empty");
            return;
        }

        System.out.println("Watching " + show + " in " + quality);
        System.out.println("Watching data is valid");
    }

 
    static void watch(String show, String quality, boolean subtitles) {
        if (show == null) {
            System.out.println("Show name cannot be empty");
            return;
        }
        if (quality == null) {
            System.out.println("Quality cannot be empty");
            return;
        }

        System.out.println("Watching " + show + " | " + quality + " | Subtitles: " + subtitles);
        System.out.println("Watching data is valid");
    }
}
