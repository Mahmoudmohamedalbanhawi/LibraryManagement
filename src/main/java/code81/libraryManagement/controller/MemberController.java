package code81.libraryManagement.controller;

import code81.libraryManagement.entity.Member;
import code81.libraryManagement.service.MemberService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/members")
public class MemberController {
    private final MemberService memberService;

    @GetMapping
    public List<Member> getAllMembers()
    {
        return memberService.getAllMembers();
    }

    @GetMapping("/{id}")
    public Member getMemberById(@PathVariable Long id)
    {
        return memberService.getMemberById(id);
    }
    @PostMapping
    public Member createMember(@RequestBody Member member)
    {
        return memberService.createMember(member);
    }
    @PutMapping("/{id}")
    public Member updateMember(@PathVariable Long id ,@RequestBody Member member)
    {
        return memberService.updateMemberById(id , member);
    }
    @DeleteMapping("/{id}")
    public void deleteMember(@PathVariable Long id)
    {
          memberService.deleteMemberById(id);
    }

}
