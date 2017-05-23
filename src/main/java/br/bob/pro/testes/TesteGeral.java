package br.bob.pro.testes;

import br.bob.pro.dao.BairroDao;
import br.bob.pro.dao.CidadeDao;
import br.bob.pro.dao.EnderecoDao;
import br.bob.pro.dao.EstadoDao;
import br.bob.pro.entidades.Bairro;
import br.bob.pro.entidades.Cidade;
import br.bob.pro.entidades.Endereco;
import br.bob.pro.entidades.Estado;
import br.bob.pro.entidades.TipoDeLogradouro;

public class TesteGeral {
	public static void main(String[] args) {

		Estado estado = new Estado();
		estado.setUf("BA");
		estado.setNome("Bahia");

		EstadoDao estd = new EstadoDao();
		estd.adiciona(estado);
		System.out.println("Estado Gravado Com Sucesso !");
		
		Cidade cidade = new Cidade();
		cidade.setId(1);
		cidade.setNome("Santa Maria da Vitória");
		cidade.setEstado(estado);
	
		
		CidadeDao cid = new CidadeDao();
		cid.adiciona(cidade);
		System.out.println("Cidade Gravada Com Sucesso !");
		
		Bairro bairro = new Bairro();
		bairro.setId(1);
		bairro.setNome("Centro");
		bairro.setCidade(cidade);
		
		BairroDao bair = new BairroDao();
		bair.adiciona(bairro);
		System.out.println("Bairro Gravado Com Sucesso !");
		
		TipoDeLogradouro tipolog = new TipoDeLogradouro();
		tipolog.setId(1);
		tipolog.setNome("Casa");
		
		Endereco endereco = new Endereco();
		endereco.setCep("47640-000");
		endereco.setNome("Coronel Clemente Araújo Castro");
		endereco.setTipolog(tipolog);
		endereco.setBairro(bairro);
		
		EnderecoDao end = new EnderecoDao();
		end.adiciona(endereco);
		System.out.println("Endereco Gravado Com Sucesso !");
		
		

	}
}
