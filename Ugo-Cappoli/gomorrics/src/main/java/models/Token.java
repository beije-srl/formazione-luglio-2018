package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "token")
public class Token {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdToken")
	private int IdToken;
	
	@Column(name = "Token")
	private String Token;
	
	@Column(name = "Fk_IdUtente")
	private int Fk_IdUtente;
	
	public Token()
	{
		
	}

	public Token(String token, int fk_IdUtente) {
		super();
		Token = token;
		Fk_IdUtente = fk_IdUtente;
	}

	public int getIdToken() {
		return IdToken;
	}

	public void setIdToken(int idToken) {
		IdToken = idToken;
	}

	public String getToken() {
		return Token;
	}

	public void setToken(String token) {
		Token = token;
	}

	public int getFk_IdUtente() {
		return Fk_IdUtente;
	}

	public void setFk_IdUtente(int fk_IdUtente) {
		Fk_IdUtente = fk_IdUtente;
	}
}
