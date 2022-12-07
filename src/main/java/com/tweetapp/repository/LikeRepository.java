package com.tweetapp.repository;

import com.tweetapp.model.Likes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @author Sinjon Nath
 *
 */
@Repository
public interface LikeRepository extends JpaRepository<Likes, Long> {
    List<Likes> findByTweetId(Long tweetId);
}
