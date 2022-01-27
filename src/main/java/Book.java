/**
 * Класс, описывающий книгу
 */
public class Book {
    String name;
    int year;
    String author;
    int numberOfPages;
    Book (String name,int year,String author,int numberOfPages){
        this.name=name;
        this.year=year;
        this.author=author;
        this.numberOfPages=numberOfPages;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages=numberOfPages;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public String getAuthor(){
        return author;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }
}
