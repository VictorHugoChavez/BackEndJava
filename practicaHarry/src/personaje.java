public class personaje {
    private String Nombre, TipodeSangre, Especie, Gnenero, Pelo, ColorOjos, ColorPiel, Ocupacion, Casa;
    private int dia, mes, year;

     personaje(String nombre, String tipodeSangre, String especie, String gnenero, String pelo, String colorOjos, String colorPiel, String ocupacion, String casa, int dia, int mes, int year) {
        this.Nombre = nombre;
        this.TipodeSangre = tipodeSangre;
        this.Especie = especie;
        this.Gnenero = gnenero;
        this.Pelo = pelo;
        this.ColorOjos = colorOjos;
        this.ColorPiel = colorPiel;
        this.Ocupacion = ocupacion;
        this.Casa = casa;
        this.dia = dia;
        this.mes = mes;
        this.year = year;
    }


    public String getNombre() {return Nombre;}
    public String getTipodeSangre() {return TipodeSangre;}
    public String getEspecie() {return Especie;}
    public String getGnenero() {return Gnenero;}
    public String getPelo() {return Pelo;}
    public String getColorOjos() {return ColorOjos;}
    public String getColorPiel() {return ColorPiel;}
    public String getOcupacion() {return Ocupacion;}
    public String getCasa() {return Casa;}
    public int getDia() {return dia;}
    public int getMes() {return mes;}
    public int getYear() {return year;}

    @Override
    public String toString() {
        return "personaje{" +
                "Nombre='" + Nombre + '\'' +
                ", TipodeSangre='" + TipodeSangre + '\'' +
                ", Especie='" + Especie + '\'' +
                ", Gnenero='" + Gnenero + '\'' +
                ", Pelo='" + Pelo + '\'' +
                ", ColorOjos='" + ColorOjos + '\'' +
                ", ColorPiel='" + ColorPiel + '\'' +
                ", Ocupacion='" + Ocupacion + '\'' +
                ", Casa='" + Casa + '\'' +
                ", dia=" + dia +
                ", mes=" + mes +
                ", year=" + year +
                '}';
    }

}



/*
    public boolean setTipodeSangre(String tipodeSangre) {
        if(!tipodeSangre.isEmpty()){
            this.tipodeSangre=tipodeSangre;
            return true;
        }else
            return false;
    }

    public boolean setEspecie(String especie) {
        Especie = especie;
    }

    public void setGnenero(String gnenero) {
        Gnenero = gnenero;
    }

    public void setPelo(String pelo) {
        Pelo = pelo;
    }

    public void setColorOjos(String colorOjos) {
        ColorOjos = colorOjos;
    }

    public void setColorPiel(String colorPiel) {
        ColorPiel = colorPiel;
    }

    public void setOcupacion(String ocupacion) {
        Ocupacion = ocupacion;
    }

    public void setCasa(String casa) {
        Casa = casa;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
*/