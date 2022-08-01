package Modelo;

public class DatosDB {
    private String nit;
    private String nombreEmpresa;
    
    
    private int idDepartamento;
    private String nombreDep;

    public DatosDB() {
        this.nit = "";
        this.nombreEmpresa = "";
        this.idDepartamento = 0;
        this.nombreDep = "";
       
    }

    public String getNit() {
        return nit;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public String getNombreDep() {
        return nombreDep;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }
    
    
    
    
}
