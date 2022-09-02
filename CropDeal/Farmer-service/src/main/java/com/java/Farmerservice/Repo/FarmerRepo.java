package com.java.Farmerservice.Repo;




import org.springframework.data.mongodb.repository.MongoRepository;

import com.java.Farmerservice.model.Farmer;

public interface FarmerRepo extends MongoRepository<Farmer, String> {

	public Farmer findByFarmerEmail(String farmeremail);
	public Farmer findByFarmerEmailAndFarmerPassword(String farmerEmail,String farmerPassword);
}
