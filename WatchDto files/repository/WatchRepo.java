package com.xworkz.watch.repository;

import java.util.List;

import com.xworkz.watch.dto.WatchDto;

public interface WatchRepo {

public WatchDto save(WatchDto dto);

public List<WatchDto> readAll();

public WatchDto findByNameAndColor(String name, String color);

public WatchDto findByidAndType(int id, String type);

public boolean updateNameById(String name, int id);

public boolean deleteBycolorandtype(String color, String type);

//public WatchDto saveAll(WatchDto dto);

}
