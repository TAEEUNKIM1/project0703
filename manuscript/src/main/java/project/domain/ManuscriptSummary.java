package project.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ManuscriptSummary extends AbstractEvent {

    private Long manuscriptId;
    private String content;

    public ManuscriptSummary(Manuscript aggregate) {
        super(aggregate);
    }

    public ManuscriptSummary() {
        super();
    }
}
//>>> DDD / Domain Event
