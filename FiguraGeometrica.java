package figurasgeometricas;

public abstract class FiguraGeometrica implements CalculosGeometricos {
    String cor;
    private int id;
    private static int totalFiguras = 0;
    
    public FiguraGeometrica(String cor) {
        this.cor = cor;
        totalFiguras++;
        this.id = totalFiguras;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotalFiguras() {
        return totalFiguras;
    }

    public static void setTotalFiguras(int TotalFiguras) {
        totalFiguras = TotalFiguras;
    }

    public String getInfo() {
        return String.format("ID: %d, Cor: %s, Área: %.2f, Perímetro: %.2f, Tipo: %s" , getId(), getCor(), calcularArea(), calcularPerimetro(), getTipoFigura());
    }

    public abstract String getDetalhes();
}
