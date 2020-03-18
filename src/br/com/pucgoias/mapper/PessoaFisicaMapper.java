package br.com.pucgoias.mapper;

import br.com.pucgoias.modelo.PessoaFisica;
import br.com.pucgoias.modelo.Telefone;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

public class PessoaFisicaMapper implements BaseMapper<PessoaFisica>{


    public Function<Map<String,String>,PessoaFisica> rowMapper(){
        return rowMapper ->{
            PessoaFisica pessoaFisica = new PessoaFisica();
            pessoaFisica.setId(rowMapper.get("id"));
            pessoaFisica.setCpf(rowMapper.get("cpf"));
            pessoaFisica.setNomeCompleto(rowMapper.get("nomecompleto"));
            pessoaFisica.setCidade(rowMapper.get("cidade"));
            pessoaFisica.setEstado(rowMapper.get("estado"));
            pessoaFisica.setStatus(rowMapper.get("status"));
            pessoaFisica.setTelefoneList(Arrays
                    .asList(new Telefone(rowMapper.get("telefonecomercial")),
                            new Telefone(rowMapper.get("telefonecelular")),
                            new Telefone(rowMapper.get("telefonecontato"))));
            return pessoaFisica;
        };
    }
}
