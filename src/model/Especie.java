
package model;



public class Especie {
    private String faunaFlora;
    private String grupo;
    private String familia;
    private String especieSimplificado;
    private String nomeComum;
    private String categoriaAmeaca;
    private String bioma;
    private String principaisAmeacas;
    private String estadosOcorrencia;

    public Especie() {}

    public String getFaunaFlora() {
        return faunaFlora;
    }

    public void setFaunaFlora(String faunaFlora) {
        this.faunaFlora = faunaFlora;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getEspecieSimplificado() {
        return especieSimplificado;
    }

    public void setEspecieSimplificado(String especieSimplificado) {
        this.especieSimplificado = especieSimplificado;
    }

    public String getNomeComum() {
        return nomeComum;
    }

    public void setNomeComum(String nomeComum) {
        this.nomeComum = nomeComum;
    }

    public String getCategoriaAmeaca() {
        return categoriaAmeaca;
    }

    public void setCategoriaAmeaca(String categoriaAmeaca) {
        this.categoriaAmeaca = categoriaAmeaca;
    }

    public String getBioma() {
        return bioma;
    }

    public void setBioma(String bioma) {
        this.bioma = bioma;
    }

    public String getPrincipaisAmeacas() {
        return principaisAmeacas;
    }

    public void setPrincipaisAmeacas(String principaisAmeacas) {
        this.principaisAmeacas = principaisAmeacas;
    }

    public String getEstadosOcorrencia() {
        return estadosOcorrencia;
    }

    public void setEstadosOcorrencia(String estadosOcorrencia) {
        this.estadosOcorrencia = estadosOcorrencia;
    }
}