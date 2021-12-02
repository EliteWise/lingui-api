package fr.lingui.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(value = "user")
public class UserEntity {
	
	@Transient
    public static final String SEQUENCE_NAME = "users_sequence";

	@Id()
	private Long id;
	
	@Field(name = "name")
	private String name;
	
	@Field(name = "inscription")
	private Date inscription;
	
	@Field(name = "nativeLanguages")
	private List<String> nativeLanguages;
	
	@Field(name = "learningLanguages")
	private List<String> learningLanguages;
	
	@Field(name = "hobbies")
	private List<String> hobbies;
	
	@Field(name = "location")
	private String location;
	
	@Field(name = "friends")
	private List<String> friends;

	public UserEntity(long id, String name, Date inscription, List<String> nativeLanguages, List<String> learningLanguages, List<String> hobbies, String location, List<String> friends) {
		this.id = id;
		this.name = name;
		this.setInscription(inscription);
		this.setNativeLanguages(nativeLanguages);
		this.setLearningLanguages(learningLanguages);
		this.setHobbies(hobbies);
		this.setLocation(location);
		this.setFriends(friends);
	}

	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getInscription() {
		return inscription;
	}

	public void setInscription(Date inscription) {
		this.inscription = inscription;
	}

	public List<String> getNativeLanguages() {
		return nativeLanguages;
	}

	public void setNativeLanguages(List<String> nativeLanguages) {
		this.nativeLanguages = nativeLanguages;
	}

	public List<String> getLearningLanguages() {
		return learningLanguages;
	}

	public void setLearningLanguages(List<String> learningLanguages) {
		this.learningLanguages = learningLanguages;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((friends == null) ? 0 : friends.hashCode());
		result = prime * result + ((hobbies == null) ? 0 : hobbies.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((inscription == null) ? 0 : inscription.hashCode());
		result = prime * result + ((learningLanguages == null) ? 0 : learningLanguages.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nativeLanguages == null) ? 0 : nativeLanguages.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserEntity other = (UserEntity) obj;
		if (friends == null) {
			if (other.friends != null)
				return false;
		} else if (!friends.equals(other.friends))
			return false;
		if (hobbies == null) {
			if (other.hobbies != null)
				return false;
		} else if (!hobbies.equals(other.hobbies))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (inscription == null) {
			if (other.inscription != null)
				return false;
		} else if (!inscription.equals(other.inscription))
			return false;
		if (learningLanguages == null) {
			if (other.learningLanguages != null)
				return false;
		} else if (!learningLanguages.equals(other.learningLanguages))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nativeLanguages == null) {
			if (other.nativeLanguages != null)
				return false;
		} else if (!nativeLanguages.equals(other.nativeLanguages))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", inscription=" + inscription + ", nativeLanguages="
				+ nativeLanguages + ", learningLanguages=" + learningLanguages + ", hobbies=" + hobbies + ", location="
				+ location + ", friends=" + friends + "]";
	}
	
}
