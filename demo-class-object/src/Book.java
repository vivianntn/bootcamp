import java.time.LocalDate;

public class Book {
  private String authorName;
  private LocalDate publishedDate;

  public void setAuthorName(String authorName){
    this.authorName = authorName;
  }

  public void setPublishedDate(LocalDate publishDate){
    this.publishedDate = publishDate;
  }

  public String getAuthorName(){
    return this.authorName;
  }

  public LocalDate getPublishedDate(){
    return this.publishedDate;
  }

  //static method
  //purpose of static method -> produce sth by the input parameters
  public static void main(String[] args) {
    String book1AuthorName = "John";
    LocalDate book1LocalDate = LocalDate.of(1998, 12, 1);
  }

  //onstance method belongs to object
  Book book1 = new Book();
  book1.setAuthorName("John");
  book1.setPublishedDate(LocalDate.of(1998, 12, 1));

  //static method belongs to Class 
  Book.hello();

  
}
