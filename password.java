package util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class password {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder encriptador = new BCryptPasswordEncoder(4);
		System.out.println(encriptador.encode("1234"));
		}
}
