package com.endlesscreation.ecsite.dto;

import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class ProjectDetailResponse {

    private Long id;
    private String imageUrl;
    private String description;
    private List<MemberResponse> participants;
    private String affiliatedEvent;    // 소속 행사 (ex EC어드벤스)
    private Date startDate;
    private Date endDate;
    private List<String> techStack;
    private String presentationUrl;
    private String githubUrl;
}
