public class Series extends Title{

    private int seasons;
    private int epSeason;
    private boolean activated;
    private int minutesEpisode;


    public int getSeason() {
        return seasons;
    }
    public void setSeason(int season) {
        this.seasons = season;
    }
    public int getEpSeason() {
        return epSeason;
    }
    public void setEpSeason(int epSeason) {
        this.epSeason = epSeason;
    }
    public boolean isActivated() {
        return activated;
    }
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    public int getMinutesEpisode() {
        return minutesEpisode;
    }
    public void setMinutesEpisode(int minutesEpisode) {
        this.minutesEpisode = minutesEpisode;
    }


    @Override
    public int getDurationInMinutes(){
        return seasons* epSeason* minutesEpisode;
    }


}
