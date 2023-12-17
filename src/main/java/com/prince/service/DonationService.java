package com.prince.service;

import com.prince.model.Donation;

import java.util.List;

public interface DonationService {
    Donation addDonation(Donation donation);
    List<Donation> listDonations();
    void deleteDonation(Donation donation);
    List<Donation> searchDonations(String search);
}
