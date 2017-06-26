package com.teja.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.teja.mvc.entity.Contact;





@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
