public class Book {

    private String title;
    private Boolean isAvailable;
    private String genre;

    public Book(String _title, String genre){
        this.title       = _title;
        this.isAvailable = true;
        this.genre       = genre;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAsNotAvailable() {
        this.isAvailable = false;
    }

    public void setAsAvailable() {
        this.isAvailable = true;
    }

    public Boolean isAvailable(){
        return this.isAvailable;
    }

    public String getGenre() {
        return genre;
    }
}
