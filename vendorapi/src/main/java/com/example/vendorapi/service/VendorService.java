package com.example.vendorapi.service;

import com.example.vendorapi.model.VendorData;
import com.example.vendorapi.repositories.VendorRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VendorService {
    @Autowired
    private VendorRepo vendorRepo;

    public VendorData createVendor(VendorData vendorData){
        return vendorRepo.save(vendorData);

    }
    public List<VendorData> getAllVendor(){
        Iterable<VendorData> iterable = vendorRepo.findAll();
        List<VendorData> vendorList = new ArrayList<>();

        for (VendorData vendorData : iterable) {
            vendorList.add(vendorData);
        }

        return vendorList;
    }
    public void  deleteVendorById(int id){
        vendorRepo.deleteById(id);

    }


    public Optional<VendorData> getVendorById(int id) {
        return vendorRepo.findById(id);

    }

    public VendorData updateVendorById(int id, VendorData updatedVendor) {
        // Check if the vendor exists
        if (!vendorRepo.existsById(id)) {
            throw new EntityNotFoundException("Vendor not found with id " + id);
        }

        updatedVendor.setVendorId(id);

        return vendorRepo.save(updatedVendor);
    }
}
