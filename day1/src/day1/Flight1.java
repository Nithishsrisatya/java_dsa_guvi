package day1;

import java.util.Objects;

public class Flight1 {
	private int id;
	private String airline;
	private String source;
	private String destination;
	private float fare;
	private float duration;
	
	
	public Flight1() {
		
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
		System.out.println("Flight default Values");
		Flight1 flight1 = new Flight1();
		System.out.println(flight1.id);
		System.out.println(flight1.airline);
		System.out.println(flight1.source);
		System.out.println(flight1.destination);
		System.out.println(flight1.fare);
		System.out.println(flight1.duration);
	}
}