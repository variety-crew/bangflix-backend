package com.swcamp9th.bangflixbackend.domain.community.communityPost.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CommunityPostDeleteDTO {

    private Integer communityPostCode;      // 게시글 코드
    private Integer memberCode;             // 회원 코드(작성자)
}
