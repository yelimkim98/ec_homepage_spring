package com.endlesscreation.ecsite.service;

import com.endlesscreation.ecsite.dto.MemberResponse;
import com.endlesscreation.ecsite.dto.PageRequest;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    public List<MemberResponse> findExecutives(PageRequest pageRequest) {
        List<String> tags1 = Arrays.asList("backend", "Spring", "nodeJS");
        MemberResponse kh = new MemberResponse(1L, "김건훈", "회장", tags1);
        MemberResponse hd = new MemberResponse(2L, "김부회장", "부회장", tags1);

        return Arrays.asList(kh, hd);
    }

    public List<MemberResponse> findNormalMembers(PageRequest pageRequest) {
        List<String> tags1 = Arrays.asList("backend", "Spring", "nodeJS");
        MemberResponse kh = new MemberResponse(1L, "이황", "일반", tags1);
        MemberResponse hd = new MemberResponse(2L, "심사임당", "일반", tags1);

        return Arrays.asList(kh, hd);
    }

    public List<MemberResponse> findGraduates(PageRequest pageRequest) {
        List<String> tags1 = Arrays.asList("헬창", "React", "Typescript");
        MemberResponse kh = new MemberResponse(1L, "김수한무거북이와두루미", "졸업생", tags1);
        MemberResponse hd = new MemberResponse(2L, "Jamie Kim", "졸업생", tags1);

        return Arrays.asList(kh, hd);
    }
}
