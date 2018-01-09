public class Book {

    private String title;
    private Boolean isAvailable;

    public Book(String _title){
        this.title       = _title;
        this.isAvailable = true;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAsLent() {
        this.isAvailable = false;
    }

    public Boolean isAvailable(){
        return this.isAvailable;
    }
}
