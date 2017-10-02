package ittepic.edu.mx.proyecto_caso1;

/**
 * Created by NandoLizola on 01/10/2017.
 */

public class Cliente {
    private String cliente,descripcion;
    private int id;
    Cliente(String cliente,String descripcion,int id){
        this.cliente=cliente;
        this.id=id;
        this.descripcion=descripcion;
    }
    public String getCliente(){return cliente;}
    public int getID(){return id;}
    public String getDescripcion(){return descripcion;}
}
