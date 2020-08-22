package com.example.springsecurity.secuirty;

import com.example.springsecurity.model.Users;
import com.example.springsecurity.repository.UsersRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UsersRepository usersRepository;

    public UserDetailsServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Users users = usersRepository.findByUsername(s);
        if(users != null){
            UserPrincipal userPrincipal = new UserPrincipal(users);
            return userPrincipal;
        }
        throw new UsernameNotFoundException("Username not found");
    }
}
