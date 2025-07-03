package project.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import project.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import project.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler{
    @Autowired AuthorRepository authorRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='RegistedAuthor'")
    public void wheneverRegistedAuthor_작가등록됨(@Payload RegistedAuthor registedAuthor){

        RegistedAuthor event = registedAuthor;
        System.out.println("\n\n##### listener 작가등록됨 : " + registedAuthor + "\n\n");


        

        // Sample Logic //

        회원가입요청Command command = new 회원가입요청Command();
        .회원가입요청(command);

        

    }

}

//>>> Clean Arch / Inbound Adaptor

