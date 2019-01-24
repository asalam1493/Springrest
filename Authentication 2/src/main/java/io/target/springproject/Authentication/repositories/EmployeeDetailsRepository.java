/**
 * 
 */
/**
 * @author a603825
 *
 */
package io.target.springproject.Authentication.repositories;
import io.target.springproject.Authentication.models.EmployeeDetails;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeDetailsRepository extends MongoRepository<EmployeeDetails, String> {
  EmployeeDetails findBy_id(ObjectId _id);
}