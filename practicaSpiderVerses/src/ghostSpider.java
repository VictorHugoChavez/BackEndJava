import java.awt.*;

public class ghostSpider extends spiderman implements atacck{

    public ghostSpider(String nombre, String universo, String ocupacion, String genero, String vestimenta) {
        super(nombre, universo, ocupacion, genero, vestimenta);
    }

    @Override
    public void shootweb(Screen pantalla) {
    pantalla.out("\nPODER: Physiology \n","Times New Roman",50,Colors.BLACK);
    pantalla.showImage("C:\\Users\\vic97\\GitHub\\BackEndJava\\practicaSpiderVerses\\src\\img\\ghost-spider.jpg");
    }

    @Override
    public void defensa(Screen pantalla) {
    pantalla.out("\nAs Spider-Gwen, she wears a hooded spandex suit that's white from head to waist, black from the waist down. Inside the hoodie and under her arms is pink coloring with a green web pattern. She also keeps her hair in a ponytail.\n","Times Nwe Roman",50, Color.black);
    pantalla.showImage("C:\\Users\\vic97\\GitHub\\BackEndJava\\practicaSpiderVerses\\src\\img\\ghost2.jpg");
    }
}
