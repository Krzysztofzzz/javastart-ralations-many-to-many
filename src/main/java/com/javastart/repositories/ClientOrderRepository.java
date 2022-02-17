package com.javastart.repositories;

import com.javastart.entities.ClientOrder;
import org.springframework.data.repository.CrudRepository;

public interface ClientOrderRepository extends CrudRepository<ClientOrder,Long> {
}
