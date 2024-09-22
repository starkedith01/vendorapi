package com.example.vendorapi.controller;

import com.example.vendorapi.model.VendorData;
import com.example.vendorapi.response.ResponseHandler;
import com.example.vendorapi.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/vendor")
public class ControllerHandler {
    @Autowired
    private VendorService vendorService;

    @GetMapping
    public  List<VendorData> getAllVendor(){
        return vendorService.getAllVendor();
    }

    @PostMapping
    public VendorData createVendor(@RequestBody VendorData vendorData){
               return  vendorService.createVendor(vendorData);

    }

    @DeleteMapping ("{id}")
    public String deleteById(@PathVariable("id") int id){
        vendorService.deleteVendorById(id);
        return "Vendor is deleted from the database";
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getVendorById(@PathVariable("id") int id){
       return  ResponseHandler.responsebuilder("Requested Vendor Details are given here",
               HttpStatus.OK,vendorService.getVendorById(id));
    }
    @PutMapping("/{id}")
    public VendorData updateVendorById(@PathVariable("id") int id ,@RequestBody VendorData vendorData){
        return vendorService.updateVendorById(id,vendorData);

    }
}
