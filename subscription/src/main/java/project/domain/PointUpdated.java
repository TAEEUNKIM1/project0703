package project.domain;

import java.util.*;
import lombok.*;
import project.domain.*;
import project.infra.AbstractEvent;

@Data
@ToString
public class PointUpdated extends AbstractEvent {

    private Long userId;
    private Integer changePoint;
    private Long pointSum;
    private String reason;
    private Date changeDate;
}
