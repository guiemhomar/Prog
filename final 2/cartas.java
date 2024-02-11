package pkgfinal.pkg2;


    public class Carta {
    public enum CartaTipo {
        ATAQUE, CURA, ATURDIR
    }

    private String nombre;
    private CartaTipo tipo;
    private int ataque;

    public Carta(String nombre, CartaTipo tipo, int ataque) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
    }

    public void mostrarInfo() {
        System.out.println("Nombre de la carta: " + nombre);
        System.out.println("Tipo de la carta: " + tipo);
        System.out.println("Ataque de la carta: " + ataque);
    }

    public String getNombre() {
        return nombre;
    }

    public Carta.CartaTipo getTipo() { // Corregir aquí
        return tipo;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(CartaTipo tipo) {
        this.tipo = tipo;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void aplicarEfecto(Personaje jugadorQueJuega, Personaje jugadorObjetivo) {
        switch (tipo) {
            case ATAQUE:
                jugadorObjetivo.recibirAtaque(ataque);
                break;
            case CURA:
                jugadorQueJuega.curar(ataque);
                break;
            case ATURDIR:
                jugadorObjetivo.setAturdido(true);
                break;
        }
    }
}
