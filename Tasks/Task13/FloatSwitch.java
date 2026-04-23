class FloatSwitch {

    public static void main(String[] args) {
        floatRating(3.0f); 
    }

    static void floatRating(float rating) {
        switch((int)rating) { 
            case 1:
                System.out.println("Rating: 1 - Poor");
                break;
            case 2:
                System.out.println("Rating: 2 - Fair");
                break;
            case 3:
                System.out.println("Rating: 3 - Good");
                break;
            case 4:
                System.out.println("Rating: 4 - Very Good");
                break;
            case 5:
                System.out.println("Rating: 5 - Excellent");
                break;
            default:
                System.out.println("Invalid Rating");
                break;
        }
    }
}
