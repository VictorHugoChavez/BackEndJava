public class djcastello extends originalMonaCat{
    @Override
    public void Actividad() {
        System.out.println("El dj PulpoGato esta tocando Shigatsu wa Kimi no Uso");
    }

    @Override
    public void Accesosrios() {
        System.out.println("Trae una computadora y sus audifonos para el concierto");
    }

    public void showMessage(){
        originalMonaCat djcas=new originalMonaCat();
        djcas.setBigotes(4);
        djcas.setGenero("Masculino");
        djcas.setNombre("Castellos");
        djcas.setTentaculos(5);
        djcas.setProfesion("Dj");

    }

}
