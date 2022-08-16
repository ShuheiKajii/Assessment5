package com.simpli.fsjd.capstone.crs.service;

import org.springframework.data.domain.Pageable;

import com.simpli.fsjd.capstone.crs.dto.UserDto;
import com.simpli.fsjd.capstone.crs.util.TPage;


public interface UserService {

    UserDto save(UserDto user);

    UserDto getById(Long id);

    TPage<UserDto> getAllPageable(Pageable pageable);

    UserDto getByUsername(String username);
}
