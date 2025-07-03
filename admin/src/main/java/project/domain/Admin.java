package project.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import project.AdminApplication;
import project.domain.RegistedAuthor;

@Entity
@Table(name = "Admin_table")
@Data
//<<< DDD / Aggregate Root
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String authorLoginId;

    private String authorPw;

    private String authorName;

    private Date createDate;

    private String authorInfo;

    private String authorPortfolio;

    private Boolean isActive;

    private String authorName;

    private Date createDate;

    private String authorInfo;

    private String authorPortfolio;

    private Boolean isActive;

    private String authorName;

    private Date createDate;

    private String authorInfo;

    private String authorPortfolio;

    private Boolean isActive;

    private String authorName;

    private Date createDate;

    private String authorInfo;

    private String authorPortfolio;

    private Boolean isActive;

    private String authorName;

    private Date createDate;

    private String authorInfo;

    private String authorPortfolio;

    private Boolean isActive;

    private String authorName;

    private Date createDate;

    private String authorInfo;

    private String authorPortfolio;

    private Boolean isActive;

    private String authorName;

    private Date createDate;

    private String authorInfo;

    private String authorPortfolio;

    private Boolean isActive;

    private String authorName;

    private Date createDate;

    private String authorInfo;

    private String authorPortfolio;

    private Boolean isActive;

    private String authorName;

    private Date createDate;

    private String authorInfo;

    private String authorPortfolio;

    private Boolean isActive;

    private String authorName;

    private Date createDate;

    private String authorInfo;

    private String authorPortfolio;

    private Boolean isActive;

    public static AdminRepository repository() {
        AdminRepository adminRepository = AdminApplication.applicationContext.getBean(
            AdminRepository.class
        );
        return adminRepository;
    }

    //<<< Clean Arch / Port Method
    public static void requestAuthor(
        RegistAuthorRequested registAuthorRequested
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        Admin admin = new Admin();
        repository().save(admin);

        RegistedAuthor registedAuthor = new RegistedAuthor(admin);
        registedAuthor.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(registAuthorRequested.get???()).ifPresent(admin->{
            
            admin // do something
            repository().save(admin);

            RegistedAuthor registedAuthor = new RegistedAuthor(admin);
            registedAuthor.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
