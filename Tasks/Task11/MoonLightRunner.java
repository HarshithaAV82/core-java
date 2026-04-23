class MoonLightRunner {

    public static void main(String[] args) {

        MoonLight moonLight1 = new MoonLight();
        System.out.println("Default Moon Phase: " + moonLight1.moonPhase);
        System.out.println("Default Brightness Level: " + moonLight1.brightnessLevel);
        System.out.println("Default Visibility: " + moonLight1.visibility);
        System.out.println("Default Rise Time: " + moonLight1.riseTime);
        moonLight1.moonPhase = "Full Moon";
        moonLight1.brightnessLevel = 95.5;
        moonLight1.visibility = "High";
        moonLight1.riseTime = "6:30 PM";
        System.out.println("After re-initialization");
        System.out.println("Moon Phase: " + moonLight1.moonPhase);
        System.out.println("Brightness Level: " + moonLight1.brightnessLevel);
        System.out.println("Visibility: " + moonLight1.visibility);
        System.out.println("Rise Time: " + moonLight1.riseTime);

        MoonLight moonLight2 = new MoonLight();
        System.out.println("Default Moon Phase: " + moonLight2.moonPhase);
        System.out.println("Default Brightness Level: " + moonLight2.brightnessLevel);
        System.out.println("Default Visibility: " + moonLight2.visibility);
        System.out.println("Default Rise Time: " + moonLight2.riseTime);
        moonLight2.moonPhase = "New Moon";
        moonLight2.brightnessLevel = 10.2;
        moonLight2.visibility = "Low";
        moonLight2.riseTime = "5:45 AM";
        System.out.println("After re-initialization");
        System.out.println("Moon Phase: " + moonLight2.moonPhase);
        System.out.println("Brightness Level: " + moonLight2.brightnessLevel);
        System.out.println("Visibility: " + moonLight2.visibility);
        System.out.println("Rise Time: " + moonLight2.riseTime);

        MoonLight moonLight3 = new MoonLight();
        System.out.println("Default Moon Phase: " + moonLight3.moonPhase);
        System.out.println("Default Brightness Level: " + moonLight3.brightnessLevel);
        System.out.println("Default Visibility: " + moonLight3.visibility);
        System.out.println("Default Rise Time: " + moonLight3.riseTime);
        moonLight3.moonPhase = "Half Moon";
        moonLight3.brightnessLevel = 60.3;
        moonLight3.visibility = "Medium";
        moonLight3.riseTime = "7:10 PM";
        System.out.println("After re-initialization");
        System.out.println("Moon Phase: " + moonLight3.moonPhase);
        System.out.println("Brightness Level: " + moonLight3.brightnessLevel);
        System.out.println("Visibility: " + moonLight3.visibility);
        System.out.println("Rise Time: " + moonLight3.riseTime);

        MoonLight moonLight4 = new MoonLight();
        System.out.println("Default Moon Phase: " + moonLight4.moonPhase);
        System.out.println("Default Brightness Level: " + moonLight4.brightnessLevel);
        System.out.println("Default Visibility: " + moonLight4.visibility);
        System.out.println("Default Rise Time: " + moonLight4.riseTime);
        moonLight4.moonPhase = "Crescent";
        moonLight4.brightnessLevel = 35.8;
        moonLight4.visibility = "Moderate";
        moonLight4.riseTime = "8:00 PM";
        System.out.println("After re-initialization");
        System.out.println("Moon Phase: " + moonLight4.moonPhase);
        System.out.println("Brightness Level: " + moonLight4.brightnessLevel);
        System.out.println("Visibility: " + moonLight4.visibility);
        System.out.println("Rise Time: " + moonLight4.riseTime);

        MoonLight moonLight5 = new MoonLight();
        System.out.println("Default Moon Phase: " + moonLight5.moonPhase);
        System.out.println("Default Brightness Level: " + moonLight5.brightnessLevel);
        System.out.println("Default Visibility: " + moonLight5.visibility);
        System.out.println("Default Rise Time: " + moonLight5.riseTime);
        moonLight5.moonPhase = "Gibbous";
        moonLight5.brightnessLevel = 80.4;
        moonLight5.visibility = "Very High";
        moonLight5.riseTime = "6:50 PM";
        System.out.println("After re-initialization");
        System.out.println("Moon Phase: " + moonLight5.moonPhase);
        System.out.println("Brightness Level: " + moonLight5.brightnessLevel);
        System.out.println("Visibility: " + moonLight5.visibility);
        System.out.println("Rise Time: " + moonLight5.riseTime);
    }
}
