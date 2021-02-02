package com.endlesscreation.ecsite.service;

import com.endlesscreation.ecsite.dto.MemberResponse;
import com.endlesscreation.ecsite.dto.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    public Page<MemberResponse> findExecutives(PageRequest pageRequest) {
        return Page.empty();
    }

    public Page<MemberResponse> findNormalMembers(PageRequest pageRequest) {
        return Page.empty();
    }

    public Page<MemberResponse> findGraduates(PageRequest pageRequest) {
        return Page.empty();
    }
}
