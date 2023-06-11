package br.com.gabriepessoa.orderorchestratorapi.controller;

import br.com.gabriepessoa.orderorchestratorapi.domain.User;
import br.com.gabriepessoa.orderorchestratorapi.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        List<User> usersList = userService.getUsers();
        return ResponseEntity.ok().body(usersList);
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable UUID id) {
        User userId = userService.getUserById(id);
        return ResponseEntity.ok().body(userId);
    }

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(userService.saveUser(user));
    }


}
