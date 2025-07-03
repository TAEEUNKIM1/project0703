package project.domain;

import project.domain.BookPublished;
import project.domain.도서정보삭제됨;
import project.BookApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Collections;


@Entity
@Table(name="Book_table")
@Data

//<<< DDD / Aggregate Root
public class Book  {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
private Long bookId;    
    
    
private Long authorId;    
    
    
private String bookTitle;    
    
    
private String category;    
    
    
private Date createDate;    
    
    
private Date modifyDate;    
    
    
private String bookSummary;    
    
    
private String bookCoverImage;    
    
    
private String bookContent;    
    
    
private Integer viewCount;    
    
    
private Integer likeCount;    
    
    
private Integer price;


    public static BookRepository repository(){
        BookRepository bookRepository = BookApplication.applicationContext.getBean(BookRepository.class);
        return bookRepository;
    }



//<<< Clean Arch / Port Method
    public void viewBook(){
        
        //implement business logic here:
        


        BookViewed bookViewed = new BookViewed(this);
        bookViewed.publishAfterCommit();
    }
//>>> Clean Arch / Port Method
//<<< Clean Arch / Port Method
    public void editBookInfo(){
        
        //implement business logic here:
        

        project.external.BookQuery bookQuery = new project.external.BookQuery();
        // bookQuery.set??()        
          = BookApplication.applicationContext
            .getBean(project.external.Service.class)
            .book(bookQuery);

        EditedBookInfo editedBookInfo = new EditedBookInfo(this);
        editedBookInfo.publishAfterCommit();
    }
//>>> Clean Arch / Port Method

//<<< Clean Arch / Port Method
    public static void publishBook(PublicationRequested publicationRequested){
        
        //implement business logic here:
        
        /** Example 1:  new item 
        Book book = new Book();
        repository().save(book);

        BookPublished bookPublished = new BookPublished(book);
        bookPublished.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(publicationRequested.get???()).ifPresent(book->{
            
            book // do something
            repository().save(book);

            BookPublished bookPublished = new BookPublished(book);
            bookPublished.publishAfterCommit();

         });
        */

        
    }
//>>> Clean Arch / Port Method


}
//>>> DDD / Aggregate Root
