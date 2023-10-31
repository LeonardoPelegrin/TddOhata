package LoginScreen;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Leonardo Pelegrin 
 * Uma classe simples usada para autenticação de usúario, simulando um banco de dados de usuários.
 */
public class LoginScreen {
   private Map <String, String> userDatabase; // Simulando um banco de dados de usuário, (username, password)

/**
 * Aqui temos a construção/inicialização de uma simulação de um banco de dados, com alguns exemplos já 
 * inseridos
 */
	public LoginScreen() {
		userDatabase = new HashMap<>();
		userDatabase.put("john", "password123");
		userDatabase.put("alice", "securepass");
	}
	
	/**
	 * Aqui temos um método que autentica o usuário com base no seu úsuario e senha.
	 * 
	 * @param username este campo username seria o campo de usuário para ser feito o login.
	 * @param password Neste campo é a senha do usuario, para que seja realizado o login.
	 * @return {@code true} se a autenticação for bem sucedida, {@code false} caso contrário.
	 */
	public boolean login(String username, String password) {
		if (userDatabase.containsKey(username)) {
			String storedPassword = userDatabase.get(username);
			if (storedPassword.equals(password)) {
				return true; // Autenticação Bem Sucedida!
			}
		}
		return false; // Autenticação Mal Sucedida!
	}
	/**
	 * Este método adiciona novos usuários no banco de dados, fica a anotação dada que este método não é,
	 * recomendado para usar em ambiente de produção, em relação a medidas de segurança.
	 * 
	 * 
	 * @param username O username(nome/login) do Usuário.
	 * @param password A password (senha) do Usuário.
	 */
	
	public void addUser(String username, String password) {
		userDatabase.put(username, password);
	}
}
