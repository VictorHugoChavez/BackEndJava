public class codecat extends originalMonaCat{
    @Override
    public void Accesosrios() {
        System.out.println("ACCESORIOS: EL codeGato  trae consigo una computadora, una tza de cafe, ademas de que trae una chamarra color negra");
    }

    @Override
    public void Actividad() {
        System.out.println("ACTIVIDAD: Su principal funcion es realizar codigo para un sistema mas seguro");
    }

    @Override
    public void profesion() {
        System.out.println("PROFESION: Desarollollador web");
    }

    public void showMessage(){
        originalMonaCat code=new originalMonaCat();
        code.setNombre("Alejandro");
        code.setGenero("Masculino");
        System.out.println("\nEl octogato se llama "+code.getNombre()+ " y es de genero " +code.getGenero());
        Accesosrios();
        Actividad();
        profesion();
    }
}
