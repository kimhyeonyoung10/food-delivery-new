package fooddeliverynew.domain;

import fooddeliverynew.domain.*;
import fooddeliverynew.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Rejected extends AbstractEvent {

    private Long id;

    public Rejected(StoreOrder aggregate) {
        super(aggregate);
    }

    public Rejected() {
        super();
    }
}
