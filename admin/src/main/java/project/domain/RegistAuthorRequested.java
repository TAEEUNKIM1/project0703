package project.domain;

import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

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
}
