package com.wilson.lancamentoapi.resource;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wilson.lancamentoapi.config.property.LancamentoApiProperty;


@Profile("oauth-security")
@RestController
@RequestMapping("/tokens")
public class TokenResource {
	
	// Class responsavel por invalidar o Cookie 
	
	@Autowired
	private LancamentoApiProperty lancamentoApiProperty;
	
	
	@DeleteMapping("/revoke")
	public void revoke(HttpServletRequest req, HttpServletResponse resp) {
		
		Cookie cookie = new Cookie("refreshToken", null);
		cookie.setHttpOnly(true);
		cookie.setSecure(lancamentoApiProperty.getSeguranca().isEnableHttps()); 
		cookie.setPath(req.getContextPath() + "/oauth/token");
		cookie.setMaxAge(0); // Um valor zero faz com que o cookie seja excluído. Um valor negativo significa que o cookie não é armazenado de forma persistente e será excluído quando o navegador da Web sair. 
		
		resp.addCookie(cookie);
		resp.setStatus(HttpStatus.NO_CONTENT.value()); //204 No Content.
	}
}
