public class holaMundo {
    public static void main(String[] args) {
        Screen pantalla=new Screen();
        Dialog d=new Dialog();
        String str;

        pantalla.out("Bienvenidos a la mision Backend Java","Helvetica",28,Colors.BalticSea);
        pantalla.setVisible(true);
        str = d.readString("Quieres aprender a hacer esto s/n");

        if(str.charAt(0)== 'S' || str.charAt(0)=='s'){
            pantalla.out("\nHola explorers");
            pantalla.showImage("sakura.jpg");
        }else
        pantalla.out("Tal vez en otro momento, Adios", "Calibri",32,Colors.BeniukonBronze);
    }
}
