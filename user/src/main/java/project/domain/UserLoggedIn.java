package project.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class UserLoggedIn extends AbstractEvent {

    private Long userId;
    private Long userPw;
    private Boolean pass;
    private Long userPw;
    private Boolean pass;

    public UserLoggedIn(User aggregate) {
        super(aggregate);
    }

    public UserLoggedIn() {
        super();
    }
}
//>>> DDD / Domain Event
