
public class main {
    public static void main(String[] args) {
            Screen pantalla = new Screen();
            peniParker sp1=new peniParker("\nNombre: Peni Parker","\tUniverso : Earth-14512","\t\t Ocupacion: Estudiante \n","Femenino","Falda y chaleco");
            pantalla.out(sp1.getNombre(),"Action Man",50, Colors.Desire);
            pantalla.out(sp1.getUniverso(),"Action Man",50,Colors.Desire);
            pantalla.out(sp1.getOcupacion(),"Action Man",50,Colors.Desire);
            sp1.shootweb(pantalla);
            pantalla.showImage("C:\\Users\\vic97\\GitHub\\BackEndJava\\practicaSpiderVerses\\src\\img\\peni-parker.jpg");
            sp1.defensa(pantalla);
            ghostSpider sp2=new ghostSpider("\n\nNombre: Gwendolyne Stacy","\tUniverso: EARTH- 65\t","\t\tOcupacion: Musica\n","Femenino","Traje de color blanco y negro");
            pantalla.out(sp2.getNombre(),"Action Man",50, Colors.Desire);
            pantalla.out(sp2.getUniverso(),"Action Man",50, Colors.Desire);
            pantalla.out(sp2.getOcupacion(),"Action Man",50, Colors.Desire);
            sp2.shootweb(pantalla);
            sp2.defensa(pantalla);
            milesMorales sp3=new milesMorales("\n\nNombre: Miles Morales","\t\tUniverso: EARTH-616","\tOcupacion: Estudiante","Masculino","traje negro");
            pantalla.out(sp3.getNombre(),"Action Man",50, Colors.Desire);
            pantalla.out(sp3.getUniverso(),"Action Man",50, Colors.Desire);
            pantalla.out(sp3.getOcupacion(),"Action Man",50, Colors.Desire);
            sp3.shootweb(pantalla);
            sp3.defensa(pantalla);
            pantalla.setVisible(true);
            pantalla.setBounds(0,50,1800,1000);

    }
}
