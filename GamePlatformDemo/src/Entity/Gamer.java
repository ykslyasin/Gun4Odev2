package Entity;

import java.time.LocalDate;

public class Gamer {
	private int id;
	private String firstName;
	private String lastName;
	private long nationalId;
	private LocalDate birthDate;
	private int ownedGames;
	
	public Gamer() {
		
	}

	public Gamer(int id, String firstName, String lastName, long nationalId, LocalDate birthDate , int ownedGames) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.birthDate = birthDate;
		this.ownedGames = ownedGames;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getNationalId() {
		return nationalId;
	}

	public void setNationalId(long nationalId) {
		this.nationalId = nationalId;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public int getOwnedGames() {
		return ownedGames;
	}

	public void setOwnedGames(int ownedGames) {
		this.ownedGames = ownedGames;
	}
	
}
