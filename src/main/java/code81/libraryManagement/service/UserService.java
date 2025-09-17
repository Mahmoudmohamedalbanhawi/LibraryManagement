package code81.libraryManagement.service;

import code81.libraryManagement.entity.SystemUser;
import code81.libraryManagement.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    public List<SystemUser> getAllUsers()
    {
        return userRepository.findAll();
    }
    public SystemUser createPassword(SystemUser user)
    {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public SystemUser findUserByName(String userName)
    {
        return userRepository.findByUserName(userName).orElseThrow(()-> new RuntimeException("user not found"));
    }
}
