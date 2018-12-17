package edu.mum.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.mum.domain.CarOwnerProfile;
import edu.mum.domain.ProfileStatus;

@Repository("carOwnerProfileRepository")
public interface CarOwnerProfileDao extends GenericDao<CarOwnerProfile> {
	// Relies on the default public abstract methods defined in the super interface, JpaRepository<T, ID>
	// We may override or add more methods here, if needed
//	@Query(value="select * from carownerapplications where carownerapplications.status != 'Approved'", nativeQuery = true)
	List<CarOwnerProfile> existsByStatus(ProfileStatus status);
	
//	@Query(value="select carownerapplications.userId from carownerapplications where carownerapplications.userId = userId", nativeQuery = true)
//	Optional<String> findByUserId(@Param("userId") String userId);

//	Boolean existsByUserId(String userId);

//	CarOwnerProfile findByUserId(String userId);
}
