package org.example;

public class HRCalculator {
    public static int calculateMaxHR(int age){
        if (age < 0) {
            throw new IllegalArgumentException("Age too low");
        }
        if(age>120){
            throw new IllegalArgumentException(
                    "Age out of bounds"
            );
        }

        return 220 - age;
    }
    public static String getWorkoutZone(int age, int bpm){
        int maxHR = calculateMaxHR(age);
        double percent = bpm * 100.0 / maxHR;

        if (percent < 50) return "Very light";
        else if (percent < 60) return "Light";
        else if (percent < 70) return "Moderate";
        else if (percent < 80) return "Hard";
        else return "Anaerobic";
    }
}