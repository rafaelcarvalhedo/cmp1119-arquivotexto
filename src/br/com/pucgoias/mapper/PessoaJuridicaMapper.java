package br.com.pucgoias.mapper;

import br.com.pucgoias.modelo.PessoaJuridica;
import java.util.Map;
import java.util.function.Function;

public class PessoaJuridicaMapper implements BaseMapper<PessoaJuridica> {

    @Override
    public Function<Map<String, String>, PessoaJuridica> rowMapper() {
        return rowMapper ->{
            PessoaJuridica pessoaJuridica = new PessoaJuridica();
            pessoaJuridica.setId(rowMapper.get("id"));
            pessoaJuridica.setCnpj(rowMapper.get("cnpj"));
            pessoaJuridica.setRazaoSocial(rowMapper.get("razaoSocial"));
            pessoaJuridica.setCidade(rowMapper.get("cidade"));
            pessoaJuridica.setEstado(rowMapper.get("estado"));
            pessoaJuridica.setaVista(rowMapper.get("aVista"));
            pessoaJuridica.setStatus(rowMapper.get("status"));
            return pessoaJuridica;
        };
    }
}
