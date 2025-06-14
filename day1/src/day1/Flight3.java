package day1;

import java.util.Objects;

public class Flight3 {
 private int id;
 private String airline;
 private String source;
 private String destination;
 private float fare;
 private float duration;
 
 public Flight3() {
	}
 public Flight3(int id, String airline, String source, String destination, float fare, float duration) {
	 this();
	 System.out.println("Parameter Constructor ");
	 this.id = id;
	 this .airline = airline;
	 this.source = source;
	 this.destination = destination;
	 this.fare = fare;
	 this.duration = duration;
 }
 	public String getAirline() {
 		return airline;
 	}

 	public void setAirline(String airline) {
 		this.airline = airline;
 	}

 	public String getSource() {
 		return source;
 	}

 	public void setSource(String source) {
 		this.source = source;
 	}

 	public String getDestination() {
 		return destination;
 	}

 	public void setDestination(String destination) {
 		this.destination = destination;
 	}

 	public float getFare() {
 		return fare;
 	}

 	public void setFare(float fare) {
 		this.fare = fare;
 	}

 	public float getDuration() {
 		return duration;
 	}

 	public void setDuration(float duration) {
 		this.duration = duration;
 	}

 	public int getId() {
 		return id;
 	}

 	@Override
 	public String toString() {
 		return "Flight [id=" + id + ", airline=" + airline + ", source=" + source + ", destination=" + destination
 				+ ", fare=" + fare + ", duration=" + duration + "]";
 	}

 	@Override
 	public int hashCode() {
 		return Objects.hash(airline, destination, duration, fare, id, source);
 	}

 	@Override
 	public boolean equals(Object obj) {
 		if (this == obj)
 			return true;
 		if (obj == null)
 			return false;
 		if (getClass() != obj.getClass())
 			return false;
 		Flight3 other = (Flight3) obj;
 		return Objects.equals(airline, other.getAirline()) && Objects.equals(destination, other.getDestination())
 				&& Float.floatToIntBits(duration) == Float.floatToIntBits(other.duration)
 				&& Float.floatToIntBits(fare) == Float.floatToIntBits(other.getFare()) && id == other.getId()
 				&& Objects.equals(source, other.getSource());
 	}
 	
 public static void main(String[] args) {
		Flight3 flight3 = new Flight3(1001, "Indigo", "Hyderabad", "Bengaluru", 356.0f, 2.5f);
		System.out.println("Flight details initialized by the Declaration");
		System.out.println(flight3.id);
		System.out.println(flight3.airline);
		System.out.println(flight3.source);
		System.out.println(flight3.destination);
		System.out.println(flight3.fare);
		System.out.println(flight3.duration);
	}
}
