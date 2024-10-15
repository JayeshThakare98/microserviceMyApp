package com.user.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>
{
    //if you want to implement any custom method or query
    //write
}