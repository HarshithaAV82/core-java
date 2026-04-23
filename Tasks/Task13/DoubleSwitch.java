class DoubleSwitch {

    public static void main(String[] args) {
        doubleTemperature(20.0); 
    }

    static void doubleTemperature(double temp) {
        switch((int)temp) { 
            case 0:
                System.out.println("Temperature 0 degrees C - Freezing");
                break;
            case 20:
                System.out.println("Temperature 20 degrees C - Cool");
                break;
            case 30:
                System.out.println("Temperature 30 degrees C - Warm");
                break;
            case 37:
                System.out.println("Temperature 37 degrees C - Normal Body Temp");
                break;
            case 40:
                System.out.println("Temperature 40 degrees C - Fever");
                break;
            default:
                System.out.println("Temperature not in standard levels");
                break;
        }
    }
}
