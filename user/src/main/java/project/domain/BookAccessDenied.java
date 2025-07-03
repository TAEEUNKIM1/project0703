package project.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class BookAccessDenied extends AbstractEvent {

    private Long userId;
    private Long bookId;
    private Long bookId;

    public BookAccessDenied() {
        super();
    }
}
//>>> DDD / Domain Event
