package com.example.knu.repository;

import com.example.knu.domain.entity.board.BoardPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BoardPostRepository extends JpaRepository<BoardPost, Long> {

    List<BoardPost> findAllByBoardCategoryId(Long categoryId);

    @Query("select p " +
            "from BoardPost p " +
            "left join fetch p.boardCategory c " +
            "left join fetch c.board b " +
            "where p.id =:postId")
    Optional<BoardPost> findByBoardPostId(@Param("postId") Long postId);
}