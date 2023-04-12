public class Macarronada extends Massa {
    private final float peso;
    private String tipoMassa;

    public Macarronada(String sabor, String tamanho, float preco, String tipoMassa) {
        super(sabor, tamanho, preco);
        this.tipoMassa = tipoMassa;
        peso = (tamanho.equals("Grande")) ? 500f : 250f;
    }

    public float getPeso() {
        return peso;
    }

    public String getTipoMassa() {
        return tipoMassa;
    }

    public void setTipoMassa(String tipoMassa) {
        this.tipoMassa = tipoMassa;
    }
}
