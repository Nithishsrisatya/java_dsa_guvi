package day1;

import java.util.Objects;

public class Flight2 {
 private int id = 123;
 private String airline ="Emirates";
 private String source = "Delhi";
 private String destination = "Ahmedhabad";
 private float fare = 3500.0f;
 private float duration = 2.5f;
 
 public Flight2() {
		
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
 		Flight other = (Flight) obj;
 		return Objects.equals(airline, other.getAirline()) && Objects.equals(destination, other.getDestination())
 				&& Float.floatToIntBits(duration) == Float.floatToIntBits(other.getDuration())
 				&& Float.floatToIntBits(fare) == Float.floatToIntBits(other.getFare()) && id == other.getId()
 				&& Objects.equals(source, other.getSource());
 	}
 	
 public static void main(String[] args) {
		Flight2 flight2 = new Flight2();
		System.out.println("Flight details initialized by the Declaration");
		System.out.println(flight2.id);
		System.out.println(flight2.airline);
		System.out.println(flight2.source);
		System.out.println(flight2.destination);
		System.out.println(flight2.fare);
		System.out.println(flight2.duration);
	}
}
