package code81.libraryManagement.controller;

import code81.libraryManagement.entity.SystemUser;
import code81.libraryManagement.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @GetMapping
    public List<SystemUser> getAllUsers()
    {
        return userService.getAllUsers();
    }
    @PostMapping
    public SystemUser createUser(@RequestBody SystemUser user)
    {
        return userService.createUser(user);
    }
    @GetMapping("/{id}")
    public SystemUser findUserByName(@PathVariable String userName)
    {
        return userService.findUserByName(userName);
    }
}
