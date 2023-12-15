package dev.lpa.GenericsLesson.GenericsWildCard.Challenge.model;

public class LPAStudent extends Student {

    private double percentComplete;

    public LPAStudent() {
        percentComplete = random.nextDouble(0, 100.001);
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentComplete);
    }

    public double getPercentComplete() {
        return percentComplete;
    }

    // Override the matchFieldValue method on the LPAStudent class so that you return students not matched on percent complete equal to a value, but on percent less than or equal to a submitted value
    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        if(fieldName.equalsIgnoreCase("percentComplete")){
            return percentComplete <= Integer.parseInt(value);
        }
        return super.matchFieldValue(fieldName, value);
    }
}
