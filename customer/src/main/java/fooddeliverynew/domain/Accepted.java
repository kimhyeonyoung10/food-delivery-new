package fooddeliverynew.domain;

import fooddeliverynew.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class Accepted extends AbstractEvent {

    private Long id;
    private String foodId;
    private String preference;
    private Long orderId;
    private String status;
}
