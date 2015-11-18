package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.UserDetail;

@Repository
public interface UserDetailRepository extends CrudRepository<UserDetail, String> {

}
