package com.Address.Address.service.Address;

import com.Address.Address.commandObject.candidate.AddressCO;
import com.Address.Address.model.address.Address;
import com.Address.Address.repository.address.AddressRepository;
import com.Address.Address.valueObject.AddressVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public AddressVO create(AddressCO addressCO) {
        Address address = new Address(addressCO);
        addressRepository.save(address);
        return new AddressVO(address);
    }
}
