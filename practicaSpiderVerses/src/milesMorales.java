public class milesMorales extends spiderman implements atacck{
    public milesMorales(String nombre, String universo, String ocupacion, String genero, String vestimenta) {
        super(nombre, universo, ocupacion, genero, vestimenta);
    }

    @Override
    public void shootweb(Screen pantalla) {
        pantalla.out("\n\nPODER: TOQUE ELECTRICO E INVISIBLE\n","Times New Roman",50,Colors.BLACK);
        pantalla.showImage("C:\\Users\\vic97\\GitHub\\BackEndJava\\practicaSpiderVerses\\src\\img\\spider.jpg");
    }

    @Override
    public void defensa(Screen pantalla) {
        pantalla.out("\nMiles, incluyendo su ropa, pueden mezclarse en su entorno, lo que le permite acercarse sigilosamente a sus enemigos o, en algunos casos, huir de ellos. El efecto resultante se asemeja mucho al de la invisibilidad\n","Times New Roman",50,Colors.BLACK);
        pantalla.showImage("C:\\Users\\vic97\\GitHub\\BackEndJava\\practicaSpiderVerses\\src\\img\\spider-man.jpg");
    }
}
