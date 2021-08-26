package com.paraprolead.repos;

import com.paraprolead.model.Badge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BadgeRepository extends JpaRepository<Badge, Long> {
}