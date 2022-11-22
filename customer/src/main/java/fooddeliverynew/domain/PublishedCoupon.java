package fooddeliverynew.domain;

import fooddeliverynew.domain.*;
import fooddeliverynew.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class PublishedCoupon extends AbstractEvent {

    private Long id;
    private String foodId;
    private String orderId;
}


