package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.Khmember;

@Mapper
public class KhmemberMapper {

	List<Khmember> getAllKhMember();
}
