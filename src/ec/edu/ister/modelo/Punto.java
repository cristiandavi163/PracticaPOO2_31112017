package ec.edu.ister.modelo;

/**
 * @Instituto Rumiñahui
 * @author SSolis
 */
public class Punto {
    private Integer x;
    private Integer y;
    private static int contadorPuntos;
    
    public Punto(){
        ++contadorPuntos;
    }
    
    /**
     * @return the x
     */
    public Integer getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(Integer x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public Integer getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(Integer y) {
        this.y = y;
    }
    
    public static int getContador(){
        return contadorPuntos;
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + ", contadorPuntos=" + contadorPuntos + '}';
    }
    
    

}
