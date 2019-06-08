package com.repos;

import com.domain.Message;
import com.domain.Product;
import org.springframework.data.repository.CrudRepository;


public interface MessageRepo extends CrudRepository<Message, Long> {

}
