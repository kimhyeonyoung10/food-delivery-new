package fooddeliverynew.domain;

import fooddeliverynew.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="storeOrders", path="storeOrders")
public interface StoreOrderRepository extends PagingAndSortingRepository<StoreOrder, Long>{

}
