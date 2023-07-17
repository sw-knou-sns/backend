package com.example.knu.domain.entity.board;

import com.example.knu.domain.entity.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class NoticeKnouOrigin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx")
    private Long idx;

    private String code;

    private String title;

    private String write;

    private String date;

    private int view;

    private String url;
}
