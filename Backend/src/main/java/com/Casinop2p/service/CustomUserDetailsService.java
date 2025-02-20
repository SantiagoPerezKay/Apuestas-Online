package com.Casinop2p.service;

import com.Casinop2p.entity.UserEntity;
import com.Casinop2p.repository.UserRepository;
import com.Casinop2p.util.UserEnum;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;
import java.util.List;

public class CustomUserDetailsService {

    private UserRepository userRepository;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado: " + username));

        return new org.springframework.security.core.userdetails.User(
                userEntity.getEmail(),
                userEntity.getPassword(),
                mapRolesToAuthorities(userEntity.getUserEnum())
        );
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(UserEnum userEnum) {
        return List.of(new SimpleGrantedAuthority(userEnum.name()));
    }
}

