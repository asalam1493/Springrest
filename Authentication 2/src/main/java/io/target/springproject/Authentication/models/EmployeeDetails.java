/**
 * 
 */
/**
 * @author a603825
 *
 */
package io.target.springproject.Authentication.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class EmployeeDetails {
  @Id
  public ObjectId _id;
  
  public String name;
  public String email;
  public String city;
  
  // Constructors
  public EmployeeDetails() {}
  
  public EmployeeDetails(ObjectId _id, String name, String city, String email) {
    this._id = _id;
    this.name = name;
    this.city = city;
    this.email = email;
  }
  
  // ObjectId needs to be converted to string
  public String get_id() { return _id.toHexString(); }
  public void set_id(ObjectId _id) { this._id = _id; }
  
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  
  public String getcity() { return city; }
  public void setcity(String city) { this.city = city; }
  
  public String getemail() { return email; }
  public void setemail(String breed) { this.email = email; }
}