public class mamaGato extends  originalMonaCat{
    @Override
    public void Accesosrios() {
        System.out.println("ACCESESORIOS : Ella tiene su computadora y esta sentada sobre una silla");
    }

    @Override
    public void Actividad() {
        System.out.println("ACTIVIDAD : Cuidar a sus hijos y estar atenediendo lo de su trabajo");
    }

    @Override
    public void profesion() {
        System.out.println("PROFESION: Ama de casa");
    }

    public void showMess(){
        originalMonaCat maa=new originalMonaCat();
        maa.setNombre("Ana Karen");
        maa.setGenero("Mujer");
        System.out.println("\nEl nombre de la octogato "+ maa.getNombre() + " y su genero es "+ maa.getGenero());
        Accesosrios();
        Actividad();
        profesion();
    }
}
