package com.cleison.nunes.pager.Application.Services;


import com.cleison.nunes.pager.Domain.Order.Order;
import com.cleison.nunes.pager.Domain.User.User;
import com.cleison.nunes.pager.Domain.User.UserDTO;
import com.cleison.nunes.pager.Infra.Repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository _userRepo;

    public UserService(UserRepository _userRepo) {
        this._userRepo = _userRepo;
    }


    public Optional<User> getById(String id){
        return this._userRepo.findById(id);
    }

    public User create(UserDTO UserDto) {

        User newUser = new User(UserDto);
        this._userRepo.save(newUser);
        return newUser;

    }

    public User update(String id, UserDTO UserDTO) {

        User User = this._userRepo.findById(id)
                .orElseThrow();

        this._userRepo.save(User);
        return User;
    }

    public void delete(String id) {
        User User = this._userRepo.findById(id)
                .orElseThrow();

        this._userRepo.delete(User);
    }


}
