package fooddeliverynew.domain;

import fooddeliverynew.domain.Cooked;
import fooddeliverynew.domain.Accepted;
import fooddeliverynew.domain.Rejected;
import fooddeliverynew.domain.Started;
import fooddeliverynew.domain.PublishedCoupon;
import fooddeliverynew.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="StoreOrder_table")
@Data

public class StoreOrder  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String foodId;
    
    
    
    
    
    private String preference;
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String test;

    @PostPersist
    public void onPostPersist(){


        Cooked cooked = new Cooked(this);
        cooked.publishAfterCommit();



        Accepted accepted = new Accepted(this);
        accepted.publishAfterCommit();



        Rejected rejected = new Rejected(this);
        rejected.publishAfterCommit();



        Started started = new Started(this);
        started.publishAfterCommit();

    }
    @PrePersist
    public void onPrePersist(){


        PublishedCoupon publishedCoupon = new PublishedCoupon(this);
        publishedCoupon.publishAfterCommit();

    }

    public static StoreOrderRepository repository(){
        StoreOrderRepository storeOrderRepository = StoreApplication.applicationContext.getBean(StoreOrderRepository.class);
        return storeOrderRepository;
    }



    public void finishCook(){
    }
    public void accept(){
    }
    public void reject(){
    }
    public void startCook(){
    }

    public static void addToOrderLists(Paid paid){

        /** Example 1:  new item 
        StoreOrder storeOrder = new StoreOrder();
        repository().save(storeOrder);

        */

        /** Example 2:  finding and process
        */
        repository().findById(paid.getId()).ifPresent(storeOrder->{
            
            storeOrder.status = "add"; // do something
            repository().save(storeOrder);


         });
        
         public static void notifyOrderCanceled(OrderCanceled orderCanceled){

            /** Example 1:  new item 
            StoreOrder storeOrder = new StoreOrder();
            repository().save(storeOrder);
    
            */
    
            /** Example 2:  finding and process
            */
            repository().findById(orderCanceled.getId()).ifPresent(storeOrder->{
                
                storeOrder.status = "canceled"; // do something
                repository().save(storeOrder);
    
    
             });
            
    
            
        }

        
    }


}
