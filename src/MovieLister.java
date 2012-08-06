import java.util.ArrayList;

public class MovieLister implements MenuInterface {

        private Notificator screenMessage = new Notificator();
        private Library library;

        public MovieLister(Library library) {
            this.library = library;
        }

        public void runItems() {

            ArrayList<Movie> movieList = library.returnAllMoviesInLibrary();
            screenMessage.displayAllMoviesInLibrary(movieList);
        }
    }

