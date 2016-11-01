package csdomain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GeoLocation {

	  @Id
	  @GeneratedValue
	  private Long id;
	  
	  @Column(precision=2, scale=8)
	  private double lat; 
	
	  @Column(precision=2, scale=8)
	  private double longi; 
	  
	  public GeoLocation(double aLat, double aLongi) {
		  lat = aLat;
		  longi = aLongi;
	  }

	  
}
