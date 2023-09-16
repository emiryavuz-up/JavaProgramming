package day47_Polymorphism;

public class EncapsulationReview {

    private String bookTitle;
    private String publishedDate;

    public String getBookTitle() {
        if(bookTitle == null){
            throw new RuntimeException("Invalid Book Title");
        }
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        if(bookTitle == null || bookTitle.isEmpty()){
            throw new RuntimeException("Invalid Data");
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishedDate() {
        if(publishedDate == null){
            throw new RuntimeException("Invalid Published Date");
        }
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        if(publishedDate == null || publishedDate.isEmpty()){
            throw new RuntimeException("Invalid Data");
        }
        this.publishedDate = publishedDate;
    }


}
