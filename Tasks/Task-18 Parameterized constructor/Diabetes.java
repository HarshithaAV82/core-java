class Diabetes{

    String type;
    String cause;
    String symptoms;
    String treatment;
    String medication;
    String dietPlan;
    String exercisePlan;
    String riskFactor;
    String prevention;
    String doctorName;
    double sugarLevel;
    double insulinLevel;
    double bmi;
    double bloodPressure;
    int age;
    int duration;
    int visits;
    boolean hereditary;
    boolean insulinDependent;
    boolean controlled;

    Diabetes(String type, String cause, String symptoms, String treatment,
             String medication, String dietPlan, String exercisePlan,
             String riskFactor, String prevention, String doctorName,
             double sugarLevel, double insulinLevel, double bmi, double bloodPressure,
             int age, int duration, int visits,
             boolean hereditary, boolean insulinDependent, boolean controlled) {

        this.type = type;
        this.cause = cause;
        this.symptoms = symptoms;
        this.treatment = treatment;
        this.medication = medication;
        this.dietPlan = dietPlan;
        this.exercisePlan = exercisePlan;
        this.riskFactor = riskFactor;
        this.prevention = prevention;
        this.doctorName = doctorName;
        this.sugarLevel = sugarLevel;
        this.insulinLevel = insulinLevel;
        this.bmi = bmi;
        this.bloodPressure = bloodPressure;
        this.age = age;
        this.duration = duration;
        this.visits = visits;
        this.hereditary = hereditary;
        this.insulinDependent = insulinDependent;
        this.controlled = controlled;
    }

    void printDetails() {
        System.out.println("Type: " + type);
        System.out.println("Cause: " + cause);
        System.out.println("Symptoms: " + symptoms);
        System.out.println("Treatment: " + treatment);
        System.out.println("Medication: " + medication);
        System.out.println("Diet Plan: " + dietPlan);
        System.out.println("Exercise Plan: " + exercisePlan);
        System.out.println("Risk Factor: " + riskFactor);
        System.out.println("Prevention: " + prevention);
        System.out.println("Doctor: " + doctorName);
        System.out.println("Sugar Level: " + sugarLevel);
        System.out.println("Insulin Level: " + insulinLevel);
        System.out.println("BMI: " + bmi);
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Age: " + age);
        System.out.println("Duration: " + duration);
        System.out.println("Visits: " + visits);
        System.out.println("Hereditary: " + hereditary);
        System.out.println("Insulin Dependent: " + insulinDependent);
        System.out.println("Controlled: " + controlled);
	}
        
}