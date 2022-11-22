package fooddeliverynew.domain;

import fooddeliverynew.CustomerApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="NotificationLog_table")
@Data

public class NotificationLog  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String message;


    public static NotificationLogRepository repository(){
        NotificationLogRepository notificationLogRepository = CustomerApplication.applicationContext.getBean(NotificationLogRepository.class);
        return notificationLogRepository;
    }




    public static void alertViaKakao(Accepted accepted){

        /** Example 1:  new item 
        NotificationLog notificationLog = new NotificationLog();
        repository().save(notificationLog);

        */

        /** Example 2:  finding and process
        */
        repository().findById(accepted.getId()).ifPresent(notificationLog->{
            
            notificationLog.message = "food accepted"; // do something
            repository().save(notificationLog);


         });
        

        
    }
    public static void alertViaKakao(Rejected rejected){

        /** Example 1:  new item 
        NotificationLog notificationLog = new NotificationLog();
        repository().save(notificationLog);

        */

        /** Example 2:  finding and process
        */
        repository().findById(rejected.getId()).ifPresent(notificationLog->{
            
            notificationLog.message = "food rejected"; // do something
            repository().save(notificationLog);


         });
        

        
    }
    public static void alertViaKakao(Cooked cooked){

        /** Example 1:  new item 
        NotificationLog notificationLog = new NotificationLog();
        repository().save(notificationLog);

        */

        /** Example 2:  finding and process
        */
        repository().findById(cooked.getId()).ifPresent(notificationLog->{
            
            notificationLog.message = "food cook started"; // do something
            repository().save(notificationLog);


         });
        

        
    }
    public static void alertViaKakao(Paid paid){

        /** Example 1:  new item 
        NotificationLog notificationLog = new NotificationLog();
        repository().save(notificationLog);

        */

        /** Example 2:  finding and process
        */
        repository().findById(paid.getId()).ifPresent(notificationLog->{
            
            notificationLog.message = "paid"; // do something
            repository().save(notificationLog);


         });
        

        
    }
    public static void alertViaKakao(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        NotificationLog notificationLog = new NotificationLog();
        repository().save(notificationLog);

        */

        /** Example 2:  finding and process
        */
        repository().findById(orderPlaced.getId()).ifPresent(notificationLog->{
            
            notificationLog.message = "orderPlaced"; // do something
            repository().save(notificationLog);


         });
        

        
    }
    public static void alertViaKakao(DeliveryStarted deliveryStarted){

        /** Example 1:  new item 
        NotificationLog notificationLog = new NotificationLog();
        repository().save(notificationLog);

        */

        /** Example 2:  finding and process
        */
        repository().findById(deliveryStarted.getId()).ifPresent(notificationLog->{
            
            notificationLog.message = "deliveryStarted"; // do something
            repository().save(notificationLog);


         });
        

        
    }
    public static void alertViaKakao(PublishedCoupon publishedCoupon){

        /** Example 1:  new item 
        NotificationLog notificationLog = new NotificationLog();
        repository().save(notificationLog);

        */

        /** Example 2:  finding and process
        */
        repository().findById(publishedCoupon.getId()).ifPresent(notificationLog->{
            
            notificationLog.message = "publishedCoupon";  // do something

            repository().save(notificationLog);


         });
        

        
    }


}
