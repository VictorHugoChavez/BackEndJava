public class jugadorAmericanoCat extends originalMonaCat{
    @Override
    public void Actividad() {
        System.out.println("ACTIVIDAD : El practica y juega futbool americano");
    }

    @Override
    public void Accesosrios() {
        System.out.println("ACCESORIOS : El trae consigo su casco y equipo de proteccion para jugar");
    }

    @Override
    public void profesion() {
        System.out.println("PROFESION: Jugador de futbool Americano");
    }
    public void showMessage(){
        originalMonaCat jA=new originalMonaCat();
        jA.setNombre("Alejandro");
        jA.setGenero("Masculino");
        System.out.println("\nEl octogato se llama "+ jA.getNombre() +" y es de genero "+ jA.getGenero());
        Accesosrios();
        Actividad();
        profesion();
    }
}
