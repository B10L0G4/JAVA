package ModeloDeEnuns;

public enum EstadosBrasileiros {
    SAO_PAULO("SP", "São Paulo"),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro"),
    MINAS_GERAIS("MG", "Minas Gerais"),
    BAHIA("BA", "Bahia"),
    CEARA("CE", "Ceará"),
    PERNAMBUCO("PE", "Pernambuco");

    private String nome;
    private String sigla;

    EstadosBrasileiros( String sigla, String nome) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
}
}
