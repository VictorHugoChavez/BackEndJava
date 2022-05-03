public abstract class spiderman {
    private String nombre,universo,ocupacion,genero,vestimenta;

    public spiderman(String nombre, String universo, String ocupacion, String genero, String vestimenta) {
        this.nombre = nombre;
        this.universo = universo;
        this.ocupacion = ocupacion;
        this.genero = genero;
        this.vestimenta = vestimenta;
    }

    public String getNombre() {return nombre;}
    public String getUniverso() {return universo;}
    public String getOcupacion() {return ocupacion;}
    public String getGenero() {return genero;}
    public String getVestimenta() {return vestimenta;}


    public boolean setNombre(String nombre) {
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }



    public boolean setUniverso(String universo) {
        if(!universo.isEmpty()){
            this.universo = universo;
            return true;
        }else
            return false;
    }



    public boolean setOcupacion(String ocupacion) {
        if(!ocupacion.isEmpty()){
            this.ocupacion = ocupacion;
            return true;
        }else
            return false;
    }



    public boolean setGenero(String genero) {
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        }else
            return false;
    }


    public boolean setVestimenta(String vestimenta) {
        if(!vestimenta.isEmpty()){
            this.vestimenta = vestimenta;
            return true;
        }else
            return false;
    }
}
