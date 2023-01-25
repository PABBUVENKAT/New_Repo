package com.example.REST.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.REST.model.innojc_table;

public interface user_manager_repo extends JpaRepository<innojc_table, Integer> {
}
