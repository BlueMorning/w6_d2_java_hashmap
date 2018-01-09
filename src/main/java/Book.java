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

    public void setAsNotAvailable() {
        this.isAvailable = false;
    }

    public void setAsAvailable() {
        this.isAvailable = true;
    }

    public Boolean isAvailable(){
        return this.isAvailable;
    }
}
