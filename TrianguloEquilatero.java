package figurasgeometricas;

public class TrianguloEquilatero extends FiguraGeometrica {
    private double lado;

    public TrianguloEquilatero(String cor, double lado) {
        super(cor);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return ((Math.sqrt(3) * (lado * lado))/4);
    }

    @Override
    public double calcularPerimetro() {
        return (3 * lado);
    }

    @Override
    public String getTipoFigura() {
        return "Triângulo Equilátero";
    }

    @Override
    public String getDetalhes() {
        return String.format("Lados: %.2f", lado);
    }
    
    @Override
    public String getInfo() {
        return String.format("ID: %d, Cor: %s, Área: %.2f, Perímetro: %.2f, Tipo: %s, Lados: %.2f" , getId(), getCor(), calcularArea(), calcularPerimetro(), getTipoFigura(), getLado());        
    }

}
