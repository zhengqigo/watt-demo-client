package cn.fuelteam.data.client;

import org.fuelteam.watt.result.Result;

import cn.fuelteam.data.dto.OperationDto;

public interface OperationClient {

    Result<OperationDto> findById(Long id);

    Result<Integer> insert(OperationDto operationDto);
}
