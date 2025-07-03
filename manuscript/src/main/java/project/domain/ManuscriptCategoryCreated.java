package project.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ManuscriptCategoryCreated extends AbstractEvent {

    private Long manuscriptId;
    private String content;

    public ManuscriptCategoryCreated(Manuscript aggregate) {
        super(aggregate);
    }

    public ManuscriptCategoryCreated() {
        super();
    }
}
//>>> DDD / Domain Event
