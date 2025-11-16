public class App {
    public static void main(String[] args) throws Exception {
        Movie myMovie = new Movie(); 
        
        myMovie.setName("O poderoso chefão"); 
        myMovie.setYear(2000);
        myMovie.setIncludeOnPlan(false);
        myMovie.setDurationInMinutes(125);
    

        
        myMovie.evaluate(8);
        myMovie.evaluate(7);
        myMovie.evaluate(9);
        myMovie.displaysTechnicalSheet();
        

    }
}