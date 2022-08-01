package Modelo;


public class ItemListaDesp {
    private String nit;
    private String nombreEmpresa;

    public String getNit() {
        return nit;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    
    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
    @Override
    public String toString(){
        return getNombreEmpresa();
    }
    
}
