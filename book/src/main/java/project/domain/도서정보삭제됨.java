package project.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class 도서정보삭제됨 extends AbstractEvent {

    private Long id;

    public 도서정보삭제됨(Book aggregate) {
        super(aggregate);
    }

    public 도서정보삭제됨() {
        super();
    }
}
//>>> DDD / Domain Event
