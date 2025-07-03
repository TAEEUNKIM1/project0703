package project.domain;

import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

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
}
