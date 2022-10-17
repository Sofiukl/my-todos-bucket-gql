package com.sofikul.mytodos.bucket.gql.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sofikul.mytodos.bucket.gql.entity.Bucket;
import com.sofikul.mytodos.bucket.gql.repositories.BucketRepository;

@Service
public class BucketService {

  private BucketRepository bucketRepository;

  public BucketService(BucketRepository bucketRepository) {
    this.bucketRepository = bucketRepository;
  }

  public Bucket saveBucket(Bucket bucket) {
    return this.bucketRepository.save(bucket);
  }

  public List<Bucket> getBuckets() {
    return this.bucketRepository.findAll();
  }
}
