package ua.lviv.lgs;

import java.util.Set;
import java.util.TreeSet;

public class Schedule {
	
	private Set<Seance> schedule;

	public Schedule() {
		super();
		this.schedule = new TreeSet<>();
	}

	public Set<Seance> getSchedule() {
		return schedule;
	}

	public void setSchedule(Set<Seance> schedule) {
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return schedule + " ";
	}
	
	public void printSchedule() {
		
		for (Seance seance : schedule) {
			System.out.println();
			seance.toString();	
		}
	}
	
	public void addSeance (Seance seance) {
		
		schedule.add(seance);
		
	}
	
	
	public void removeSeance (Seance seance) {
		
		schedule.remove(seance);
		
	} 
	
	
	

}
