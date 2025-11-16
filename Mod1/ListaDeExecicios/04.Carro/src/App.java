public class App {
    public static void main(String[] args) throws Exception {
        
        Car c1 = new Car();
        c1.model = "Opala";
        c1.year = 1976;
        c1.color = "Laranja Bronze";
    
        c1.technicalSheet();
        System.out.println("Age Car: " + c1.calcAge(2025));
        
    }
}
