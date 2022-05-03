public class peniParker extends spiderman implements atacck{
    public peniParker(String nombre, String universo, String ocupacion, String genero, String vestimenta) {
        super(nombre, universo, ocupacion, genero, vestimenta);
    }


    @Override
    public void shootweb(Screen pantalla) {
    pantalla.out("\nPODER: Psychic Connection with SP//dr  \n"
    ,"Times New Roman",50,Colors.BLACK);
    }

    @Override
    public void defensa(Screen pantalla) {
        pantalla.out("\nACERCA DE: Peni Parker is a fictional comic book superhero appearing in publications by Marvel Comics. She is an alternative version of Spider-Man. he character is depicted as a 14-year-old high school student who was adopted by Aunt May and Uncle Ben following the death of her father/caretake\n","Times New Roman",56,Colors.BLACK);
        pantalla.showImage("C:\\Users\\vic97\\GitHub\\BackEndJava\\practicaSpiderVerses\\src\\img\\peni-parker2.jpg");
    }
}
