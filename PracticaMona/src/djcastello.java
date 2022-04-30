public class djcastello extends originalMonaCat{
    @Override
    public void Actividad() {
        System.out.println("ACTIVIDAD : El dj PulpoGato esta tocando Shigatsu wa Kimi no Uso");
    }

    @Override
    public void Accesosrios() {
        System.out.println("ACCESORIOS : Trae una computadora y sus audifonos para el concierto");
    }

    @Override
    public void profesion() {
        System.out.println("PROFESION: DJ");
    }

    public void showMessage(){
        originalMonaCat djcas=new originalMonaCat();
        djcas.setBigotes(4);
        djcas.setGenero("Masculino");
        djcas.setNombre("Castellos");
        djcas.setTentaculos(5);
        djcas.setProfesion("Dj");
        System.out.println("");
        System.out.println("El octogato tiene como nombre "+ djcas.getNombre() +" y es de genero masculino");
        Accesosrios();
        Actividad();
        profesion();
    }

}
