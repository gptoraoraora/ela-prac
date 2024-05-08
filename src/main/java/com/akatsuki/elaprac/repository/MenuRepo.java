package com.akatsuki.elaprac.repository;

import com.akatsuki.elaprac.aggregate.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MenuRepo extends JpaRepository<MenuEntity,Integer> {
}
