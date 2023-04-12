public class Lasanha extends Massa {
    private final float peso;

    public Lasanha(String sabor, String tamanho, float preco) {
        super(sabor, tamanho, preco);
        peso = (tamanho.equals("Grande")) ? 1000f : 500f;
    }

    public float getPeso() {
        return peso;
    }
}
