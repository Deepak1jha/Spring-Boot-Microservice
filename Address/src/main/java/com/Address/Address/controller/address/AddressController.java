package com.Address.Address.controller.address;

import com.Address.Address.commandObject.address.AddressCO;
import com.Address.Address.enums.Enums;
import com.Address.Address.service.Address.AddressService;
import com.Address.Address.valueObject.ApiResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping(value = "/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/")
    public ResponseEntity<?> create(@RequestBody AddressCO addressCO) {
        return ResponseEntity.ok(new ApiResponseVO(Enums.ResponseType.SUCCESS, "Address Created Successfully", addressService.create(addressCO)));
    }

    @GetMapping("/{candidateUID}")
    public ResponseEntity<?> fetch(@PathVariable String candidateUID){
        return ResponseEntity.ok(new ApiResponseVO(Enums.ResponseType.SUCCESS, "Address Fetched Successfully", addressService.fetch(candidateUID)));


    }
}
