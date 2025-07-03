package project.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import project.SubscriptionApplication;
import project.domain.SubscriptionAdded;

@Entity
@Table(name = "Subscription_table")
@Data
//<<< DDD / Aggregate Root
public class Subscription {

    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private Long bookId;

    private Long bookId;

    public static SubscriptionRepository repository() {
        SubscriptionRepository subscriptionRepository = SubscriptionApplication.applicationContext.getBean(
            SubscriptionRepository.class
        );
        return subscriptionRepository;
    }

    //<<< Clean Arch / Port Method
    public static void subscriptionAdd(PointUpdated pointUpdated) {
        //implement business logic here:

        /** Example 1:  new item 
        Subscription subscription = new Subscription();
        repository().save(subscription);

        SubscriptionAdded subscriptionAdded = new SubscriptionAdded(subscription);
        subscriptionAdded.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(pointUpdated.get???()).ifPresent(subscription->{
            
            subscription // do something
            repository().save(subscription);

            SubscriptionAdded subscriptionAdded = new SubscriptionAdded(subscription);
            subscriptionAdded.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void subscriptionAdd(BookAccessGranted bookAccessGranted) {
        //implement business logic here:

        /** Example 1:  new item 
        Subscription subscription = new Subscription();
        repository().save(subscription);

        SubscriptionAdded subscriptionAdded = new SubscriptionAdded(subscription);
        subscriptionAdded.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(bookAccessGranted.get???()).ifPresent(subscription->{
            
            subscription // do something
            repository().save(subscription);

            SubscriptionAdded subscriptionAdded = new SubscriptionAdded(subscription);
            subscriptionAdded.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
