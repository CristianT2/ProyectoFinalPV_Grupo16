 package ar.edu.unju.fi;


 import java.io.IOException;
 import java.util.Collection;

 import javax.servlet.ServletException;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;

 import org.springframework.security.core.Authentication;
 import org.springframework.security.core.GrantedAuthority;
 import org.springframework.security.web.DefaultRedirectStrategy;
 import org.springframework.security.web.RedirectStrategy;
 import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
 import org.springframework.stereotype.Component;

 @Component
 public class AutenticacionSuccessHandler implements AuthenticationSuccessHandler{
 private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

 @Override
 public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
 Authentication authentication) throws IOException, ServletException {
 boolean tipoBD = false;
 boolean tipoConsultor = false;
 boolean tipoRegistrador = false;

 Collection <? extends GrantedAuthority > authorities = authentication.getAuthorities();

 for (GrantedAuthority grantedAuthority : authorities) {
 if (grantedAuthority.getAuthority().equals("bd")) {
 tipoBD = true;
 break;
 }else {
 if(grantedAuthority.getAuthority().equals("consultor")) {
 tipoConsultor = true;
 break;
 }else {
 if(grantedAuthority.getAuthority().equals("registrador")) {
 tipoRegistrador = true;
 break;
 }
 }
 }
 }


 //Se redirige a una pagina relacionada al rol del usuario
 if (tipoBD) {
 redirectStrategy.sendRedirect(request, response, "/usuarioForm");

 }else {
 if(tipoConsultor) {
 redirectStrategy.sendRedirect(request, response, "/personaTesteadaForm");
 }else {
 if(tipoRegistrador) {
 redirectStrategy.sendRedirect(request, response, "/registroTesteoForm");
 }else {
 throw new IllegalStateException();
 }
 }
 }

 }
 }