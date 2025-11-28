public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime = 0;
    }

    
    public void includeMovie(Movie f){
       totalTime+=f.getDurationInMinutes();
    }

    public void includeMovie(Series f){
       totalTime+=f.getDurationInMinutes();
    }


    
}
