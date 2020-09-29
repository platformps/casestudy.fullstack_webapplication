package com.example.backend.dao;

import com.example.backend.models.Bucket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BucketRepository extends JpaRepository<Bucket, Integer> {
}
