public class Movie {

    String movieTitle = "Omen";
    String movieType = "horror";
    int movieTime = 128;
    int ageRequired = 16;

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
