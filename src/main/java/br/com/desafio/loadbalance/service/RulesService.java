package br.com.desafio.loadbalance.service;

import org.springframework.stereotype.Service;

import br.com.desafio.loadbalance.aws.elb.model.Rule;

@Service
public class RulesService extends ServiceDefault{

	public void createRule(Rule rule,String signature) {
		try {
			String retorno = null;
			 retorno = 	restTemplate.getForObject(ressources.getUrlAwsElb().concat(ressources.getCreateLoadBalancer()) ,String.class);
		}catch(Exception e) {
			logger.error("Erro na camada service",e);
		}
	}
	
}