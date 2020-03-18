package br.com.pucgoias;

public class Exercicio1 {

    public static void main(String args[]){
        ArquivoTexto arquivoTexto = new ArquivoTexto("C:\\Users\\Rafael\\Downloads\\PessoaFisica.csv");
        arquivoTexto.getArquivo().forEach(System.out::println);
    }
}
