package com.sopra.repository;

import java.util.List;

import com.sopra.carRentals.Cars;

public interface ObjRepository<T> {
	
public void store(List<T> t);
	
	public T get(int id);
	
	public Cars delete(T t);
	
	public void getAll();
	
}
