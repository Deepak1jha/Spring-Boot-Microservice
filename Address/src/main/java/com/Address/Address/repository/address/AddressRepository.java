package com.Address.Address.repository.address;

import com.Address.Address.model.address.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<Address, String> {
}
