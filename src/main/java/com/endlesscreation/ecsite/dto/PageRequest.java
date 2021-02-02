package com.endlesscreation.ecsite.dto;

public class PageRequest {

    private Integer page;    // 페이지번호
    private Integer size;    // 페이지 당 데이터 크기
    private String sortedBy;    // 정렬 기준이 될　필드
    private String direction;    // 오름차순 or 내림차순

    public PageRequest(Integer page, Integer size, String sortedBy, String direction) {
        this.page = page;
        this.size = size;
        this.sortedBy = sortedBy;
        this.direction = direction;
    }

    public Integer getPage() {
        return page;
    }

    public Integer getSize() {
        return size;
    }

    public String getSortedBy() {
        return sortedBy;
    }

    public String getDirection() {
        return direction;
    }
}
