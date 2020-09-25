public class Movie {

  private   String movieTitle = "Omen";
  private   String movieType = "horror";
  private   int movieTime = 128;
  private   int ageRequired = 16;



    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public int getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(int movieTime) {
        this.movieTime = movieTime;
    }

    public int getAgeRequired() {
        return ageRequired;
    }

    public void setAgeRequired(int ageRequired) {
        this.ageRequired = ageRequired;
    }

    //    public Movie(String movieTitle, String movieType, int movieTime, int ageRequired) {
//        this.movieTitle = movieTitle;
//        this.movieType = movieType;
//        this.movieTime = movieTime;
//        this.ageRequired = ageRequired;
//    }
    public void  movieDescription(){
        System.out.println("movie: " + movieTitle + ", movie type: " + movieType
                + ", movie Time: " + movieTime + ", age required: " + ageRequired );

    }

}
