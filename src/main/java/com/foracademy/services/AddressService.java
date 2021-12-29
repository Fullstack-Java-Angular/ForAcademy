package com.foracademy.services;

import com.foracademy.dao.address.IAddressDao;

public class AddressService {
    private IAddressDao addressDao;

    public AddressService(IAddressDao addressDao) {
        this.addressDao = addressDao;
    }
}
