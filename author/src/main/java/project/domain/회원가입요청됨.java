package project.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class 회원가입요청됨 extends AbstractEvent {

    private Long id;

    public 회원가입요청됨() {
        super();
    }
}
//>>> DDD / Domain Event
