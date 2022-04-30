public class originalMonaCat {
    private int tentaculos,bigotes;
    private String Profesion,Genero,Nombre;

    public int getTentaculos() {return tentaculos;}
    public int getBigotes() {return bigotes;}
    public String getProfesion() {return Profesion;}
    public String getGenero() {return Genero;}
    public String getNombre() {return Nombre;}




    public boolean setTentaculos(int tentaculos) {
        if(tentaculos>0){
            this.tentaculos = tentaculos;
            return true;
        }else
            return false;
    }

    public boolean setBigotes(int bigotes) {
        if(bigotes>0){
            this.bigotes = bigotes;
            return true;
        }else
            return false;
    }

    public boolean setProfesion(String profesion) {
        if(!profesion.isEmpty()){
            this.Profesion = profesion;
            return true;
        }else
            return false;
    }

    public boolean setGenero(String genero) {
        if(!genero.isEmpty()){
            this.Genero = genero;
            return true;
        }else
            return false;
    }

    public boolean setNombre(String nombre) {
        if(!nombre.isEmpty()){
            this.Nombre = nombre;
            return true;
        }else
            return false;
    }




    public void Actividad(){
        System.out.println("El octogato esta en forma habitual");
    }
    public void Accesosrios(){
        System.out.println("Sin Accesorios");
    }
}
