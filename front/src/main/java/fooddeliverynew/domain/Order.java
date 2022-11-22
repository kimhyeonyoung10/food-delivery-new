package fooddeliverynew.domain;

import fooddeliverynew.domain.OrderPlaced;
import fooddeliverynew.domain.OrderCanceled;
import fooddeliverynew.FrontApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Order_table")
@Data

public class Order  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String foodId;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String preference;
    
    
    
    
    
    private String options;
    
    
    
    @Embedded
    
    private Address address;
    
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        fooddeliverynew.external.Payment payment = new fooddeliverynew.external.Payment();
        // mappings goes here
        FrontApplication.applicationContext.getBean(fooddeliverynew.external.PaymentService.class)
            .pay(payment);


        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();

    }
    @PostRemove
    public void onPostRemove(){


        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();

    }
    @PrePersist
    public void onPrePersist(){
    }
    @PreRemove
    public void onPreRemove(){
    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = FrontApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }




    public static void updateStatus(Accepted accepted){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        */
        repository().findById(accepted.getId()).ifPresent(order->{
            
            order.status = "accepted"; // do something
            repository().save(order);


         });
        

        
    }
    public static void updateStatus(Rejected rejected){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        */
        repository().findById(rejected.getId()).ifPresent(order->{
            
            order.status = "rejected"; // do something
            repository().save(order);


         });
        

        
    }
    public static void updateStatus(Started started){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        */
        repository().findById(started.getId()).ifPresent(order->{
            
            order.status = "started"; // do something
            repository().save(order);


         });
        

        
    }

    public static void cancel(Rejected rejected){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        */
        repository().findById(rejected.getId()).ifPresent(order->{
            
            //order.status = ""; // do something
            repository().save(orderCanceled);


         });
        

        
    }

}
