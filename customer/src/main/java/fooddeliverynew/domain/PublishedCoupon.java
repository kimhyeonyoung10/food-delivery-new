package fooddeliverynew.domain;

import fooddeliverynew.domain.*;
import fooddeliverynew.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PublishedCoupon extends AbstractEvent {

    private Long id;
    private String foodId;
    private String orderId;
}
