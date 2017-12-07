package com.example.myproject;

import org.springframework.data.solr.repository.SolrCrudRepository;

public interface ApplicationRepository extends SolrCrudRepository<Application, String> {

}