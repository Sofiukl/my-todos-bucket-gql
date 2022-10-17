package com.sofikul.mytodos.bucket.gql.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sofikul.mytodos.bucket.gql.entity.Bucket;

public interface BucketRepository extends MongoRepository<Bucket, String> {

}
