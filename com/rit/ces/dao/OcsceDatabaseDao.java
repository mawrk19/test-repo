package com.rit.ces.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;

public class OcsceDatabaseDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public List<String> getAuthorizationDataForEmployers() {
        // Query to pull authorization data from OCSCE database for employers
        return entityManager.createQuery("SELECT e.authorizationData FROM Employer e").getResultList();
    }
}