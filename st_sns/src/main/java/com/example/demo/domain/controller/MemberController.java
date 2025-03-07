package com.example.demo.domain.controller;

import com.example.demo.domain.member.dto.RegisterMemberCommand;
import com.example.demo.domain.member.entity.Member;
import com.example.demo.domain.member.service.MemberWriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberWriteService memberWriteService;

    @PostMapping("/members")
    public Member register(
            @RequestBody RegisterMemberCommand command
    ) {
        return memberWriteService.create(command);
    }
}
