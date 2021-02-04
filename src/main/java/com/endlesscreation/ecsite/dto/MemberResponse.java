package com.endlesscreation.ecsite.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MemberResponse {

    private Long id;
    private String name;
    private String position;
    private List<String> hashTags;
    private String imageUrl;
}
