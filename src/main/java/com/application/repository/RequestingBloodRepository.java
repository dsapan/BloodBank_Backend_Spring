package com.application.repository;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.application.model.Requesting;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.StringIdGenerator;

public interface RequestingBloodRepository extends CrudRepository<Requesting, Integer>{
//	@Transactional
//	@Modifying
//	@Query(value = "from requesting where request_id=?1",nativeQuery = true)

	public List<Requesting> findByEmail(String email);
	
	@Transactional
	@Modifying
	@Query(value = "update requesting set status = 'accept' where request_id = ?1",nativeQuery = true)
	public void updateStatus(int user_id);
	
	@Transactional
	@Modifying
	@Query(value = "update requesting set status = 'reject' where email = ?1",nativeQuery = true)
	public void rejectStatus(String email );


}
