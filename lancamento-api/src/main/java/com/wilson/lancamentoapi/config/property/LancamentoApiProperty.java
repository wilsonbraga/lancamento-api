package com.wilson.lancamentoapi.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("lancamento")
public class LancamentoApiProperty {

	private String originPermitida = "http://localhost:4200";

	private final Seguranca seguranca = new Seguranca();
	
	private final Mail mail = new Mail();
	
	private final S3 s3 = new S3();
	
	public S3 getS3() {
		return s3;
	}
	
	public Mail getMail() {
		return mail;
	}

	public Seguranca getSeguranca() {
		return seguranca;
	}

	public String getOriginPermitida() {
		return originPermitida;
	}

	public void setOriginPermitida(String originPermitida) {
		this.originPermitida = originPermitida;
	}
	
	
	public static class S3 {
		
		private String accessKeyId;
		private String secretAccessKeyId;
		
		private String bucket = "wrb-api-lancamentos-arquivos";
		
		public String getAccessKeyId() {
			return accessKeyId;
		}
		
		public void setAccessKeyId(String accessKeyId) {
			this.accessKeyId = accessKeyId;
		}
		
		public String getSecretAccessKeyId() {
			return secretAccessKeyId;
		}
		
		public void setSecretAccessKeyId(String secretAccessKeyId) {
			this.secretAccessKeyId = secretAccessKeyId;
		}
		
		public String getBucket() {
			return bucket;
		}
		
		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

	}

	public static class Seguranca {

		private boolean enableHttps;

		public boolean isEnableHttps() {
			return enableHttps;
		}

		public void setEnableHttps(boolean enableHttps) {
			this.enableHttps = enableHttps;
		}
	}
	
	public static class Mail{
		
		private String host;
		
		private Integer port;
		
		private String nome;
		
		private String senha;

		public String getHost() {
			return host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public Integer getPort() {
			return port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getNome() {
			return nome;
		}
			
		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSenha() {
			return senha;
		}
		
		public void setSenha(String senha) {
			this.senha = senha;
		}
		
	}
}
