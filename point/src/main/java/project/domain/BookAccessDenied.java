package project.domain;

import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

@Data
@ToString
public class BookAccessDenied extends AbstractEvent {

    private Long userId;
    private Long bookId;
    private Long bookId;
}
