package br.com.pucgoias.modelo;

import java.util.List;

public class PessoaFisica {

    private String id;
    private String cpf;
    private String nomeCompleto;
    private String cidade;
    private String estado;
    private String status;
    private List<Telefone> telefoneList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Telefone> getTelefoneList() {
        return telefoneList;
    }

    public void setTelefoneList(List<Telefone> telefoneList) {
        this.telefoneList = telefoneList;
    }


    @Override
    public String toString() {
        return "PessoaFisica{" +
                "id='" + id + '\'' +
                ", cpf='" + cpf + '\'' +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", status='" + status + '\'' +
                ", telefoneList=" + telefoneList +
                '}';
    }
}
