package com.mbusa.supplierservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mbusa.supplierservice.model.AdminUsers;


@Repository
public interface AdminUsersRepository extends MongoRepository<AdminUsers, String> {

}
