package prova;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService {
	@PostMapping("/getResponse")
	public Response getResponse(@RequestParam ("nome") String nome, @RequestParam ("cognome") String cognome) throws SQLException {
		Response response = new Response();
		response.setNome(nome);
		response.setCognome(cognome);
		
		String snome = nome.toString();
		String scognome = cognome.toString();
		
		DbConnection conn = new DbConnection();
		conn.datidb(snome, scognome);
		
		return response;
		
	}
	
}
