public class contructorcat extends originalMonaCat{
    @Override
    public void Actividad() {
        System.out.println("ACTIVIDAD : El realiza un edificio con las herramientas nesesarias");
    }

    @Override
    public void Accesosrios() {
        System.out.println("ACCESORIOS : El utiliza un casco de seguridad y una llave ppara reparar");
    }

    @Override
    public void profesion() {
        System.out.println("PROFESION : Constructor");
    }
    public void showMessage(){
        originalMonaCat cons=new originalMonaCat();
        cons.setNombre("Victor");
        cons.setGenero("Masculino");
        System.out.println("\nEl octogato se llama " + cons.getNombre()+ " y su genero es " + cons.getGenero());
        Accesosrios();
        Actividad();
        profesion();

    }

}
