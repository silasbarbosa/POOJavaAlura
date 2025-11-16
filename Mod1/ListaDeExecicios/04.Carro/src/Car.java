public class Car {
    public String model;
    public int year;
    public String color;

    public int calcAge(int thisYear){
        int age = thisYear - year;
        return age;
    }

    public void technicalSheet(){
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Color: " + this.color);
    }

}
