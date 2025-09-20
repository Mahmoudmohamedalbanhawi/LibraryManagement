package code81.libraryManagement.service;

import code81.libraryManagement.entity.Member;
import code81.libraryManagement.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public List<Member> getAllMembers()
    {
        return memberRepository.findAll();
    }

    public Member createMember(Member member)
    {
        return memberRepository.save(member);
    }

    public Member getMemberById(Long id)
    {
        return memberRepository.findById(id).orElseThrow(()-> new RuntimeException("Member not found"));
    }
    public Member updateMemberById(Long id , Member updateMember)
    {
        Member member = getMemberById(id);
        member.setEmail(updateMember.getEmail());
        member.setMemberShipDate(updateMember.getMemberShipDate());
        member.setName(updateMember.getName());
        return memberRepository.save(member);

    }
    public void deleteMemberById(Long id)
    {
        memberRepository.deleteById(id);
    }


}
