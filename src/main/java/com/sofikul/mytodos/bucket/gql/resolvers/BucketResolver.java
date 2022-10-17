package com.sofikul.mytodos.bucket.gql.resolvers;

import java.util.List;
import java.util.UUID;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.sofikul.mytodos.bucket.gql.entity.Bucket;
import com.sofikul.mytodos.bucket.gql.services.BucketService;

@Controller
public class BucketResolver {

  private BucketService bucketService;

  public BucketResolver(BucketService bucketService) {
    this.bucketService = bucketService;
  }

  @QueryMapping
  public List<Bucket> recentBuckets(@Argument int count, @Argument int offset) {
    return this.bucketService.getBuckets();
  }

  @MutationMapping
  public Bucket createBucket(@Argument String name, @Argument String category) {
    Bucket bucket = new Bucket();
    bucket.setId(UUID.randomUUID().toString());
    bucket.setName(name);
    bucket.setCategory(category);
    return this.bucketService.saveBucket(bucket);
  }

}
