package tp_mochila;

public class Elemento {
    private int id;
    private int volumen;
    private int valor;
    private float valorEnPeso;

    
    public float getvalorEnPeso() {
        return valorEnPeso;
    }

    
    public void setId(float valorEnPeso) {
        this.valorEnPeso = valorEnPeso;
    }
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public Elemento(){};
    
    public Elemento(int ID, int VOL, int VAL){
        this.id=ID;
        this.valor=VAL;
        this.volumen=VOL;
        this.valorEnPeso= (float)(VAL/VOL);
    }
    
    
}
