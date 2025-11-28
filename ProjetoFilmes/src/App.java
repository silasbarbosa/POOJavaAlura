public class App {
    public static void main(String[] args) throws Exception {
        Movie myMovie = new Movie(); 
        
        myMovie.setName("O poderoso chefão"); 
        myMovie.setYear(2000);
        myMovie.setIncludeOnPlan(false);
        myMovie.setDurationInMinutes(180);
        Movie myMovie2 = new Movie(); 
        
        myMovie2.setName("O poderoso chefão 2"); 
        myMovie2.setYear(2005);
        myMovie2.setIncludeOnPlan(false);
        myMovie2.setDurationInMinutes(100);
    

        
        myMovie.evaluate(8);
        myMovie.evaluate(7);
        myMovie.evaluate(9);
        myMovie.displaysTechnicalSheet();


        Series lost = new Series();
        lost.setName("Lost");
        lost.setYear(2000);
        lost.displaysTechnicalSheet();
        lost.setSeason(10);
        lost.setEpSeason(10);
        lost.setMinutesEpisode(50);
        System.out.println("Duração do filme: " + lost.getDurationInMinutes());
        
        
        
        TimeCalculator calc = new TimeCalculator();
        calc.includeMovie(myMovie);
        calc.includeMovie(myMovie2);
        System.out.println(calc.getTotalTime());
        

        

    }
}