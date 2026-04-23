class ShortSwitch {

    public static void main(String[] args) {
        short level = 3;  
        showLevel(level);
    }

    static void showLevel(short level) {
        switch(level) {
            case 1:
                System.out.println("Beginner Level");
                break;
            case 2:
                System.out.println("Easy Level");
                break;
            case 3:
                System.out.println("Intermediate Level");
                break;
            case 4:
                System.out.println("Advanced Level");
                break;
            case 5:
                System.out.println("Expert Level");
                break;
            default:
                System.out.println("Invalid Level");
                break;  
        }
    }
}
