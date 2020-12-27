package com.Address.Address.service.Address;

import com.Address.Address.commandObject.address.AddressCO;
import com.Address.Address.enums.Enums;
import com.Address.Address.model.address.Address;
import com.Address.Address.repository.address.AddressRepository;
import com.Address.Address.valueObject.AddressVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public AddressVO create(AddressCO addressCO) {
        Address address = new Address(addressCO);
        addressRepository.save(address);
        return new AddressVO(address);
    }

    public List<AddressVO> fetch(String candidateUID) {
        log.info("************************************Address Service*****************");
        List<AddressVO> addressVOList = new ArrayList<>();
//        Iterable<Address> addressIterable = addressRepository.findAllByAndStatus(Enums.Status.CURRENT);
//        addressIterable.forEach(address -> addressVOList.add(new AddressVO(address)));

//        Iterable<Address> addressIterable = addressRepository.findAllByAndStatus(Enums.Status.CURRENT);

//        log.info(addressIterable.toString());
//        addressIterable.forEach(address -> {
//            log.info("===========================");
//            addressVOList.add(new AddressVO(address));
//        });
        log.info("************************************Address Service*****************");
        return addressVOList;
    }
}
