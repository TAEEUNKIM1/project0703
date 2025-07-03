package project.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import project.PointApplication;
import project.domain.PointUpdated;

@Entity
@Table(name = "Point_table")
@Data
//<<< DDD / Aggregate Root
public class Point {

    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private Date changeDate;

    private Integer changePoint;

    private Long pointSum;

    private String reason;

    @PostPersist
    public void onPostPersist() {
        PointUpdated pointUpdated = new PointUpdated(this);
        pointUpdated.publishAfterCommit();
    }

    public static PointRepository repository() {
        PointRepository pointRepository = PointApplication.applicationContext.getBean(
            PointRepository.class
        );
        return pointRepository;
    }

    //<<< Clean Arch / Port Method
    public static void pointBalanceChange(BookAccessDenied bookAccessDenied) {
        //implement business logic here:

        /** Example 1:  new item 
        Point point = new Point();
        repository().save(point);

        */

        /** Example 2:  finding and process
        

        repository().findById(bookAccessDenied.get???()).ifPresent(point->{
            
            point // do something
            repository().save(point);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void pointBalanceChange(UserRegistered userRegistered) {
        //implement business logic here:

        /** Example 1:  new item 
        Point point = new Point();
        repository().save(point);

        */

        /** Example 2:  finding and process
        

        repository().findById(userRegistered.get???()).ifPresent(point->{
            
            point // do something
            repository().save(point);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
