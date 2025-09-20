package code81.libraryManagement.service;

import code81.libraryManagement.entity.SystemUser;
import code81.libraryManagement.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException
    {
        SystemUser systems = userRepository.findByUserName(userName).orElseThrow(() -> new RuntimeException("user not found" + userName));
        GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + systems.getRole());
        System.out.println("🔍 Found user: " + systems.getUserName() + " with role " + systems.getRole());

        return new User(systems.getUserName() , systems.getPassword() , Collections.singleton(authority));
    }
}
