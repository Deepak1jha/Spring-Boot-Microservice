package com.Address.Address.controller.address;

import com.Address.Address.commandObject.candidate.AddressCO;
import com.Address.Address.enums.Enums;
import com.Address.Address.service.Address.AddressService;
import com.Address.Address.valueObject.ApiResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/")
    public ResponseEntity<?> create(@RequestBody AddressCO addressCO) {
        return ResponseEntity.ok(new ApiResponseVO(Enums.ResponseType.SUCCESS, "Address Created Successfully", addressService.create(addressCO)));
    }
}
