public class TennisBall {
    private String marca;
    private String color;
    private double diametro;
    private boolean estaPresurizada;
    private boolean esPeluda;

    public TennisBall(String marca, String color, double diametro, boolean estaPresurizada, boolean esPeluda) {
        this.marca = marca;
        this.color = color;
        this.diametro = diametro;
        this.estaPresurizada = estaPresurizada;
        this.esPeluda = esPeluda;
    }

    public void rebotar() {
        System.out.println("La pelota de tenis está rebotando.");
    }

    public void servir() {
        System.out.println("Sirviendo la pelota de tenis.");
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    // Método abstracto para una acción genérica
    public void realizarAccion() {
        System.out.println("Realizando una acción genérica con la pelota de tenis.");
    }
}

// Crea una subclase que hereda de TennisBall
class PelotaEspecialDeTenis extends TennisBall {
    private String caracteristicaEspecial;

    public PelotaEspecialDeTenis(String marca, String color, double diametro, boolean estaPresurizada, boolean esPeluda, String caracteristicaEspecial) {
        super(marca, color, diametro, estaPresurizada, esPeluda);
        this.caracteristicaEspecial = caracteristicaEspecial;
    }

    // Sobrescribe el método realizarAccion con una acción especial
    @Override
    public void realizarAccion() {
        System.out.println("Realizando una acción especial con la pelota de tenis: " + caracteristicaEspecial);
    }
}

// Clase principal para demostrar los conceptos de POO
public class DemoPelotaDeTenis {
    public static void main(String[] args) {
        TennisBall pelota1 = new TennisBall("Wilson", "Amarillo", 2.7, true, true);
        TennisBall pelota2 = new PelotaEspecialDeTenis("Babolat", "Verde", 2.6, true, false, "Brilla en la oscuridad");

        System.out.println("Propiedades iniciales de la pelota1:");
        System.out.println("Marca: " + pelota1.getMarca());
        System.out.println("Color: " + pelota1.getColor());
        System.out.println("Diametro: " + pelota1.getDiametro());
        pelota1.realizarAccion();

        System.out.println("\nPropiedades iniciales de la pelota2:");
        System.out.println("Marca: " + pelota2.getMarca());
        System.out.println("Color: " + pelota2.getColor());
        System.out.println("Diametro: " + pelota2.getDiametro());
        pelota2.realizarAccion();
    }
}
