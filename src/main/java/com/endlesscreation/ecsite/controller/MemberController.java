package com.endlesscreation.ecsite.controller;

import com.endlesscreation.ecsite.dto.MemberResponse;
import com.endlesscreation.ecsite.dto.PageRequest;
import com.endlesscreation.ecsite.service.MemberService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/executive")
    public ResponseEntity<List<MemberResponse>> findExecutives(PageRequest pageRequest) {  // 임원진
        return ResponseEntity.ok()
            .body(memberService.findExecutives(pageRequest));
    }

    @GetMapping("/normal")
    public ResponseEntity<List<MemberResponse>> findNormalMembers(PageRequest pageRequest) {
        return ResponseEntity.ok()
            .body(memberService.findNormalMembers(pageRequest));
    }

    @GetMapping("/graduated")
    public ResponseEntity<List<MemberResponse>> findGraduates(PageRequest pageRequest) {
        return ResponseEntity.ok()
            .body(memberService.findGraduates(pageRequest));
    }
}
