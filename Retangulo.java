package figurasgeometricas;

public class Retangulo extends FiguraGeometrica {
    private double largura;
    private double altura;

    public Retangulo(String cor, double largura, double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return (largura * getAltura());
    }

    @Override
    public double calcularPerimetro() {
        return (2 * (largura + getAltura()));
    }

    @Override
    public String getTipoFigura() {
        return "Retângulo";
    }

    @Override
    public String getDetalhes() {
        return String.format("Largura: %.2f, Altura: %.2f", largura, altura);
    }
    
    @Override
    public String getInfo() {
        return String.format("ID: %d, Cor: %s, Área: %.2f, Perímetro: %.2f, Tipo: %s, Largura: %.2f, Altura: %.2f" , getId(), getCor(), calcularArea(), calcularPerimetro(), getTipoFigura(), getLargura(), getAltura());        
    }

}
