package com.example.vendorapi.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.vendorapi.model.VendorData;

public interface VendorRepo extends CrudRepository<VendorData, Integer> {
    // Custom query methods (if needed) can be added here
}
