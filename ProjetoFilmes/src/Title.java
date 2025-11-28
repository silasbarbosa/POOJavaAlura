public class Title {
    private String name;
    private int year;
    private boolean includedOnPlan;
    private double assessment;
    private int totalRatins;
    private int durationInMinutes;

    /* get and setters */
    public void setName(String name){
        this.name = name;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setIncludeOnPlan(boolean includedOnPlan){
        this.includedOnPlan = includedOnPlan;
    }

    public void setDurationInMinutes(int durationInMinutes){
        this.durationInMinutes = durationInMinutes;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public boolean isIncludedOnPlan() {
        return includedOnPlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getTotalRatins(){
        return totalRatins;
    }

    /*Metodo*/
    public void displaysTechnicalSheet(){
        System.out.println("Name: " + this.getName());
        System.out.println("Relase Date: " + this.getYear());
        System.out.println("Incuded on Plan: " + this.isIncludedOnPlan());
        System.out.println("Dutation in Minutes: " + this.getDurationInMinutes());
        System.out.println("Media Assesment: " + this.resultMedia());

    }

    public  void evaluate(double number){
        this.assessment+= number;
        totalRatins++;
    }

    public double resultMedia(){
        double media = assessment/totalRatins;
        return media;

    }


}
