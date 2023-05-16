package fooddeliverynew.domain;

import fooddeliverynew.CustomerApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "NotificationLog_table")
@Data
public class NotificationLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String customerId;

    private String message;

    public static NotificationLogRepository repository() {
        NotificationLogRepository notificationLogRepository = CustomerApplication.applicationContext.getBean(
            NotificationLogRepository.class
        );
        return notificationLogRepository;
    }

    public static void alertViaKakao(Accepted accepted) {
        /** Example 1:  new item 
        NotificationLog notificationLog = new NotificationLog();
        repository().save(notificationLog);

        */

        /** Example 2:  finding and process
        
        repository().findById(accepted.get???()).ifPresent(notificationLog->{
            
            notificationLog // do something
            repository().save(notificationLog);


         });
        */

    }

    public static void alertViaKakao(Rejected rejected) {
        /** Example 1:  new item 
        NotificationLog notificationLog = new NotificationLog();
        repository().save(notificationLog);

        */

        /** Example 2:  finding and process
        
        repository().findById(rejected.get???()).ifPresent(notificationLog->{
            
            notificationLog // do something
            repository().save(notificationLog);


         });
        */

    }

    public static void alertViaKakao(Cooked cooked) {
        /** Example 1:  new item 
        NotificationLog notificationLog = new NotificationLog();
        repository().save(notificationLog);

        */

        /** Example 2:  finding and process
        
        repository().findById(cooked.get???()).ifPresent(notificationLog->{
            
            notificationLog // do something
            repository().save(notificationLog);


         });
        */

    }

    public static void alertViaKakao(Paid paid) {
        /** Example 1:  new item 
        NotificationLog notificationLog = new NotificationLog();
        repository().save(notificationLog);

        */

        /** Example 2:  finding and process
        
        repository().findById(paid.get???()).ifPresent(notificationLog->{
            
            notificationLog // do something
            repository().save(notificationLog);


         });
        */

    }

    public static void alertViaKakao(OrderPlaced orderPlaced) {
        /** Example 1:  new item 
        NotificationLog notificationLog = new NotificationLog();
        repository().save(notificationLog);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(notificationLog->{
            
            notificationLog // do something
            repository().save(notificationLog);


         });
        */

    }

    public static void alertViaKakao(DeliveryStarted deliveryStarted) {
        /** Example 1:  new item 
        NotificationLog notificationLog = new NotificationLog();
        repository().save(notificationLog);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStarted.get???()).ifPresent(notificationLog->{
            
            notificationLog // do something
            repository().save(notificationLog);


         });
        */

    }

    public static void alertViaKakao(PublishedCoupon publishedCoupon) {
        /** Example 1:  new item 
        NotificationLog notificationLog = new NotificationLog();
        repository().save(notificationLog);

        */

        /** Example 2:  finding and process
        
        repository().findById(publishedCoupon.get???()).ifPresent(notificationLog->{
            
            notificationLog // do something
            repository().save(notificationLog);


         });
        */

    }
}
