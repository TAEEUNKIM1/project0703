package project.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PublicationRequested extends AbstractEvent {

    private Long manuscriptId;
    private String authorId;
    private String title;
    private String category;
    private String content;
    private Date createDate;
    private Date modifyDate;
    private String summary;
    private String bookCoverImage;
    private String status;

    public PublicationRequested(Manuscript aggregate) {
        super(aggregate);
    }

    public PublicationRequested() {
        super();
    }
}
//>>> DDD / Domain Event
