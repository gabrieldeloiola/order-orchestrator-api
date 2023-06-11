package br.com.gabriepessoa.orderorchestratorapi.service;

import br.com.gabriepessoa.orderorchestratorapi.domain.User;
import br.com.gabriepessoa.orderorchestratorapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserById(UUID id) {
        Optional<User> userId = userRepository.findById(id);
        return userId.get();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

}
