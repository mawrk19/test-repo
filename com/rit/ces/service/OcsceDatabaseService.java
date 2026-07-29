package com.rit.ces.service;

import com.rit.ces.dao.OcsceDatabaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OcsceDatabaseService {

    private final OcsceDatabaseDao ocsceDatabaseDao;

    @Autowired
    public OcsceDatabaseService(OcsceDatabaseDao ocsceDatabaseDao) {
        this.ocsceDatabaseDao = ocsceDatabaseDao;
    }

    public List<String> getAuthorizationDataForEmployers() {
        return ocsceDatabaseDao.getAuthorizationDataForEmployers();
    }
}