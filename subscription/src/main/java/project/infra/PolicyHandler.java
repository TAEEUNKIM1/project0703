package project.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import project.config.kafka.KafkaProcessor;
import project.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    SubscriptionRepository subscriptionRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PointUpdated'"
    )
    public void wheneverPointUpdated_SubscriptionAdd(
        @Payload PointUpdated pointUpdated
    ) {
        PointUpdated event = pointUpdated;
        System.out.println(
            "\n\n##### listener SubscriptionAdd : " + pointUpdated + "\n\n"
        );

        // Sample Logic //
        Subscription.subscriptionAdd(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='BookAccessGranted'"
    )
    public void wheneverBookAccessGranted_SubscriptionAdd(
        @Payload BookAccessGranted bookAccessGranted
    ) {
        BookAccessGranted event = bookAccessGranted;
        System.out.println(
            "\n\n##### listener SubscriptionAdd : " + bookAccessGranted + "\n\n"
        );

        // Sample Logic //
        Subscription.subscriptionAdd(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
