package cn.fuelteam.user.client;

import org.fuelteam.watt.result.Result;

import cn.fuelteam.user.dto.UserDto;

public interface UserClient {

    Result<UserDto> findById(Long id);

    Result<Integer> insert(UserDto user);
}