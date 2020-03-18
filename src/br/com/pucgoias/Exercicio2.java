package br.com.pucgoias;

import br.com.pucgoias.mapper.PessoaFisicaMapper;

public class Exercicio2 {

    public static void main(String args[]){
        ArquivoTexto arquivoTexto = new ArquivoTexto("C:\\Users\\Rafael\\Downloads\\PessoaFisica.csv");
        PessoaFisicaMapper pessoaFisicaMapper = new PessoaFisicaMapper();
        arquivoTexto.getArquivo().parallelStream()
                .map(pessoaFisicaMapper.rowMapper())
                .forEach(System.out::println);
    }
}
