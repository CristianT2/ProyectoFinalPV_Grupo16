package ar.edu.unju.fi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import ar.edu.unju.fi.tracking.services.LoginUsuarioServiceImp;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private AutenticacionSuccessHandler autenticacion;

	String[] resources = new String[] { "/include/**", "/css/**", "/icons/**", "/images/**", "/js/**", "/layer/**",
			"/webjars/**", };

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()

				.antMatchers(resources).permitAll()

				.antMatchers("/", "/login").permitAll().antMatchers("/", "/home").permitAll()

//paginas
				.antMatchers("/usuarios").hasAuthority("bd").antMatchers("/barrio").hasAuthority("bd")

				.antMatchers("/registroTesteo").hasAuthority("registrador")

				.anyRequest().authenticated()

				.and()

				.formLogin().loginPage("/login").permitAll()
//.defaultSuccessUrl("/home")

				.successHandler(autenticacion)

				.failureUrl("/login?error=true")

				.usernameParameter("username").passwordParameter("password")

				.and()

				.logout().permitAll().logoutSuccessUrl("/login?logout");

	}

	BCryptPasswordEncoder BCryptPasswordEncoder;

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder = new BCryptPasswordEncoder(4);
		return BCryptPasswordEncoder;
	}

	@Autowired
	LoginUsuarioServiceImp loginService;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(loginService).passwordEncoder(passwordEncoder());
	}

}
