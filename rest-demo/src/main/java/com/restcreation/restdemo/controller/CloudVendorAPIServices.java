package com.restcreation.restdemo.controller;

import com.restcreation.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorAPIServices {

    private CloudVendor cloudVendor; // Field to store data between requests

    @GetMapping("/{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable String vendorId) {
        // Assuming you have a constructor in the CloudVendor class that takes these parameters
        // If not, replace the following line with the appropriate instantiation logic
        return cloudVendor; // Placeholder for retrieving data based on vendorId
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully";
    }


    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId)
    {
        this.cloudVendor = null;
        return "Cloud Vendor Updated Successfully";
    }




}









