package project.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class RegistAuthorRequested extends AbstractEvent {

    private Long id;
    private String authorLoginId;
    private String authorPw;
    private String authorName;
    private Date createDate;
    private String authorInfo;
    private String authorPortfolio;
    private Boolean isActive;
    private String authorLoginId;
    private String authorPw;
    private String authorName;
    private Date createDate;
    private String authorInfo;
    private String authorPortfolio;
    private Boolean isActive;

    public RegistAuthorRequested(Author aggregate) {
        super(aggregate);
    }

    public RegistAuthorRequested() {
        super();
    }
}
//>>> DDD / Domain Event
