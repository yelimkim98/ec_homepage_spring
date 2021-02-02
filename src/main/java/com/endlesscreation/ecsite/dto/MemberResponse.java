package com.endlesscreation.ecsite.dto;

import java.util.List;

public class MemberResponse {

    private Long id;
    private String name;
    private String position;
    private List<String> hashTags;

    public MemberResponse(Long id, String name, String position,
        List<String> hashTags) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.hashTags = hashTags;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public List<String> getHashTags() {
        return hashTags;
    }
}
