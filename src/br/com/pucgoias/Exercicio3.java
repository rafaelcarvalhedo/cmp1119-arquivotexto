package br.com.pucgoias;

import br.com.pucgoias.mapper.PessoaJuridicaMapper;
import br.com.pucgoias.modelo.PessoaJuridica;
import java.util.stream.Stream;

public class Exercicio3 {

    public static void main(String args[]) {
        ArquivoTexto arquivoTexto = new ArquivoTexto("C:\\Users\\Rafael\\Downloads\\PessoaFisica.csv");
        PessoaJuridicaMapper pessoaJuridicaMapper = new PessoaJuridicaMapper();
        Stream<PessoaJuridica> pessoaJuridicas = arquivoTexto.getArquivo().parallelStream()
                .map(pessoaJuridicaMapper.rowMapper());
    }
}
