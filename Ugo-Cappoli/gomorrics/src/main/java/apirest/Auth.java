package apirest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import db.Database;
import models.LoginResponse;
import models.Users;

@RequestMapping("/api/auth")
@RestController
public class Auth {
	
	@GetMapping("/getAllUsers")
	public List<Users> getAllUsers()
	{
		return new Database().getUsersDao().getAll();
	}
	
	@PostMapping("/registrati")
	public void registrati(@RequestBody Users u)
	{
		new Database().getUsersDao().registra(u);
	}
	
	@PostMapping("/login")
	public LoginResponse login(@RequestBody Users u)
	{
		return new Database().getUsersDao().login(u);
	}


}
