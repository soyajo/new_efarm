package com.fourfree.common.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor()
@Getter
public class BaseDto {

    private Map<String, List<Object>> temp;
}
