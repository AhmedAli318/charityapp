package com.example.donationms.controllers;

import com.example.donationms.entities.Donation;
import com.example.donationms.services.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DonationController {
    @Autowired
    DonationService donationService;

    @GetMapping("/donations/{id}")
    public Donation AfficherDonation(@PathVariable("id") Long DonationId){
        return donationService.getDonation(DonationId);
    }

    @GetMapping("/donations/all")
    public List<Donation> AfficherDonations(){
        return donationService.getAllDonations();
    }

    @PostMapping("/donations/add")
    public Donation AddDonation(@RequestBody Donation Donation){
        return donationService.saveDonation(Donation);
    }

    @DeleteMapping("/donations/delete/{id}")
    public void DeleteDonation(@PathVariable Long id){
        donationService.deleteDonation(id);
    }

    @PutMapping("/donations/update/{id}")
    public Donation UpdateDonation(@PathVariable Long id, @RequestBody Donation Donation){
        return donationService.updateDonation(Donation, id);
    }
}
