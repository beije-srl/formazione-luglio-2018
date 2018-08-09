package models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUtente")
    private int idUtente;
    
    @Column(name = "Email")
    private String Email;
    
    @Column(name = "Password")
    private String Password;
    
    @Column(name = "Nome")
    private String Nome;

    @Column(name = "Cognome")
    private String Cognome;
    
    public Users()
    {
    	
    }

	public Users(int idUtente, String email, String password, String nome, String cognome) {
		super();
		this.idUtente = idUtente;
		Email = email;
		Password = password;
		Nome = nome;
		Cognome = cognome;
	}

	public int getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}


}