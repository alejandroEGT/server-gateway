package filters.factory;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.ResponseCookie;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Mono;

//@Component
public class EjemploGateWayFilterFactory{

	/*private final Logger logger = LoggerFactory.getLogger(EjemploGateWayFilterFactory.class);
	public EjemploGateWayFilterFactory() {
		super(Configuracion.class);
		
	}
	@Override
	public GatewayFilter apply(Configuracion config) {
		return (exchange, chain) -> {
			logger.info("ejecutando pre gateway filter factory: " + config.mensaje);
			return chain.filter(exchange).then(Mono.fromRunnable(()->{
				Optional.ofNullable(config.cookieValor).ifPresent(cookie -> {
					exchange.getResponse().addCookie(ResponseCookie.from(config.cookieNombre, config.cookieValor).build());
				});
				logger.info("ejecutando post gateway filter factory: " + config.mensaje);
			}));
		};
	}
	
	public static class Configuracion {
		private String mensaje;
		private String cookieValor;
		public String getMensaje() {
			return mensaje;
		}
		public void setMensaje(String mensaje) {
			this.mensaje = mensaje;
		}
		public String getCookieValor() {
			return cookieValor;
		}
		public void setCookieValor(String cookieValor) {
			this.cookieValor = cookieValor;
		}
		public String getCookieNombre() {
			return cookieNombre;
		}
		public void setCookieNombre(String cookieNombre) {
			this.cookieNombre = cookieNombre;
		}
		private String cookieNombre;
	}
	*/

}
