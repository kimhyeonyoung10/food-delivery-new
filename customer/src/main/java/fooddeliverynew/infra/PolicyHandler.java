package fooddeliverynew.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import fooddeliverynew.config.kafka.KafkaProcessor;
import fooddeliverynew.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    NotificationLogRepository notificationLogRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Accepted'"
    )
    public void wheneverAccepted_AlertViaKakao(@Payload Accepted accepted) {
        Accepted event = accepted;
        System.out.println(
            "\n\n##### listener AlertViaKakao : " + accepted + "\n\n"
        );

        // Sample Logic //
        NotificationLog.alertViaKakao(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Rejected'"
    )
    public void wheneverRejected_AlertViaKakao(@Payload Rejected rejected) {
        Rejected event = rejected;
        System.out.println(
            "\n\n##### listener AlertViaKakao : " + rejected + "\n\n"
        );

        // Sample Logic //
        NotificationLog.alertViaKakao(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Cooked'"
    )
    public void wheneverCooked_AlertViaKakao(@Payload Cooked cooked) {
        Cooked event = cooked;
        System.out.println(
            "\n\n##### listener AlertViaKakao : " + cooked + "\n\n"
        );

        // Sample Logic //
        NotificationLog.alertViaKakao(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Paid'"
    )
    public void wheneverPaid_AlertViaKakao(@Payload Paid paid) {
        Paid event = paid;
        System.out.println(
            "\n\n##### listener AlertViaKakao : " + paid + "\n\n"
        );

        // Sample Logic //
        NotificationLog.alertViaKakao(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderPlaced'"
    )
    public void wheneverOrderPlaced_AlertViaKakao(
        @Payload OrderPlaced orderPlaced
    ) {
        OrderPlaced event = orderPlaced;
        System.out.println(
            "\n\n##### listener AlertViaKakao : " + orderPlaced + "\n\n"
        );

        // Sample Logic //
        NotificationLog.alertViaKakao(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryStarted'"
    )
    public void wheneverDeliveryStarted_AlertViaKakao(
        @Payload DeliveryStarted deliveryStarted
    ) {
        DeliveryStarted event = deliveryStarted;
        System.out.println(
            "\n\n##### listener AlertViaKakao : " + deliveryStarted + "\n\n"
        );

        // Sample Logic //
        NotificationLog.alertViaKakao(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PublishedCoupon'"
    )
    public void wheneverPublishedCoupon_AlertViaKakao(
        @Payload PublishedCoupon publishedCoupon
    ) {
        PublishedCoupon event = publishedCoupon;
        System.out.println(
            "\n\n##### listener AlertViaKakao : " + publishedCoupon + "\n\n"
        );

        // Sample Logic //
        NotificationLog.alertViaKakao(event);
    }
}
