package fr.elite.lingui.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "inscription")
	private Date inscription;
	
	@Column(name = "nativeLanguage")
	private String nativeLanguage;
	
	@Column(name = "languageToLearn")
	private String languageToLearn;

	public UserEntity(long id, String name, Date inscription, String nativeLanguage, String languageToLearn) {
		this.id = id;
		this.name = name;
		this.setInscription(inscription);
		this.setNativeLanguage(nativeLanguage);
		this.setLanguageToLearn(languageToLearn);
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getNativeLanguage() {
		return nativeLanguage;
	}

	public void setNativeLanguage(String nativeLanguage) {
		this.nativeLanguage = nativeLanguage;
	}

	public String getLanguageToLearn() {
		return languageToLearn;
	}

	public void setLanguageToLearn(String languageToLearn) {
		this.languageToLearn = languageToLearn;
	}
	
	@Override
    public String toString() {
        return "UserEntity [id=" + id + ", name=" + name + 
                ", inscription=" + inscription + ", nativeLanguage=" + nativeLanguage + ", languageToLearn=" + languageToLearn + "]";
    }
	
}
