public class Pizza extends Massa {
    private final int fatias;
    private String borda;

    public Pizza(String sabor, String tamanho, float preco, String borda) {
        super(sabor, tamanho, preco);
        this.borda = borda;
        fatias = (tamanho.equals("Grande")) ? 8 : 6;
    }

    public int getFatias() {
        return fatias;
    }

    public void setBorda(String borda) {
        this.borda = borda;
    }

    public String getBorda() {
        return borda;
    }
}
