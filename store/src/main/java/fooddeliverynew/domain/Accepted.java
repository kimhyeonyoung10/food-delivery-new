package fooddeliverynew.domain;

import fooddeliverynew.domain.*;
import fooddeliverynew.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Accepted extends AbstractEvent {

    private Long id;
    private String foodId;
    private String preference;
    private Long orderId;
    private String status;

    public Accepted(StoreOrder aggregate) {
        super(aggregate);
    }

    public Accepted() {
        super();
    }
}
