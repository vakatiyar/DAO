package com.sopra.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.sopra.carRentals.*;

@Repository
public class CarsRepository implements ObjRepository<Cars>{

	@Override
	public void store(List<Cars> t) {
		
	       for(Cars c:t)
	       App.s.save(c);
	       
	}

	@Override
	public Cars get(int id) {
		 
		return App.s.get(Cars.class, id);
	}

	@Override
	public Cars delete(Cars ob) {
		App.s.delete(ob);
		return null;
	}

	@Override
	public void getAll() {
		
        List<Cars> list = App.query.list();
        for(Cars cs:list)
        System.out.println(cs);
		
	}

}
