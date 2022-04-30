public class main {
    public static void main(String[] args) {
    show();
    }
    public static void show(){
        personaje HarryPotter=new personaje("HarryPotter","mestiza",
                "Humano","Masculino","Negro azabache","Verde-azul",
                "Clara","Jefe del departamneto de Seguridad Informatica","Gryffindor",
                31,07,1980);
        personaje HermonieJean=new personaje("Hermonie Jean Granger","Hija de muggles",
                "Humana","Femenino","Castanio","Marrones",
                "Clara","Empleada del Departamento de Regulacion y Control de Criaturas Magicas",
                "Gryffindor",19,9,1979);
        personaje PetterPitt=new personaje("Peteer Pettigres","Pura",
                "Humano","Masculino","Calvo","azul acuoso",
                "Palido","Mortifigo","Gryffindor",1,9,1960);
        personaje lord=new personaje("Tom Ryddle Lord Voldemort", "Mestiza",
                "Humano","Masculino","Calvo","Rojos","Blanca",
                "Mortifigo","Slytherin",31,12,1926);
        personaje Sybil=new personaje("Sybill Patricia Tralawney","Mestiza","Humana",
                "Femenino","Castanio","Verde oscuro","Blanca",
                "Profesora de Adivinacion en Hogwarts","Ravenclaw",9,3,1963);

        System.out.println("Nombre : " + HarryPotter.getNombre() +
                "\nTipo de sanagre :  "+HarryPotter.getTipodeSangre()
                +"\nEspecie :  "+HarryPotter.getEspecie()
                +"\nGenero :"+HarryPotter.getGnenero()
                +"\nColor del pelo :  "+HarryPotter.getPelo()
                +"\nColor de los ojos:  "+HarryPotter.getColorOjos()
                +"\nColor de la Piel :  "+HarryPotter.getColorPiel()
                +"\nOcupacion  :  "+HarryPotter.getOcupacion()
                +"\nCasa :  "+HarryPotter.getCasa()
                +"\nFecha de Nacimiento: " + HarryPotter.getDia()+ "/"+ HarryPotter.getMes()+"/"+ HarryPotter.getYear()
        );

        System.out.println("\n \nNombre : " + HermonieJean.getNombre() +
                "\nTipo de sanagre :  "+HermonieJean.getTipodeSangre()
                +"\nEspecie :  "+HermonieJean.getEspecie()
                +"\nGenero :"+HermonieJean.getGnenero()
                +"\nColor del pelo :  "+HermonieJean.getPelo()
                +"\nColor de los ojos:  "+HermonieJean.getColorOjos()
                +"\nColor de la Piel :  "+HermonieJean.getColorPiel()
                +"\nOcupacion  :  "+HermonieJean.getOcupacion()
                +"\nCasa :  "+HermonieJean.getCasa()
                +"\nFecha de Nacimiento: " + HermonieJean.getDia()+ "/"+ HermonieJean.getMes()+"/"+ HermonieJean.getYear()
        );

        System.out.println("\n \nNombre : " + PetterPitt.getNombre() +
                "\nTipo de sanagre :  "+PetterPitt.getTipodeSangre()
                +"\nEspecie :  "+PetterPitt.getEspecie()
                +"\nGenero :"+PetterPitt.getGnenero()
                +"\nColor del pelo :  "+PetterPitt.getPelo()
                +"\nColor de los ojos:  "+PetterPitt.getColorOjos()
                +"\nColor de la Piel :  "+PetterPitt.getColorPiel()
                +"\nOcupacion  :  "+PetterPitt.getOcupacion()
                +"\nCasa :  "+PetterPitt.getCasa()
                +"\nFecha de Nacimiento: " + PetterPitt.getDia()+ "/"+ PetterPitt.getMes()+"/"+ PetterPitt.getYear()
        );

        System.out.println("\n \nNombre : " + lord.getNombre() +
                "\nTipo de sanagre :  "+lord.getTipodeSangre()
                +"\nEspecie :  "+lord.getEspecie()
                +"\nGenero :"+lord.getGnenero()
                +"\nColor del pelo :  "+lord.getPelo()
                +"\nColor de los ojos:  "+lord.getColorOjos()
                +"\nColor de la Piel :  "+lord.getColorPiel()
                +"\nOcupacion  :  "+lord.getOcupacion()
                +"\nCasa :  "+lord.getCasa()
                +"\nFecha de Nacimiento: " + lord.getDia()+ "/"+ lord.getMes()+"/"+ lord.getYear()
        );

        System.out.println("\n \nNombre : " + Sybil.getNombre() +
                "\nTipo de sanagre :  "+Sybil.getTipodeSangre()
                +"\nEspecie :  "+Sybil.getEspecie()
                +"\nGenero :"+Sybil.getGnenero()
                +"\nColor del pelo :  "+Sybil.getPelo()
                +"\nColor de los ojos:  "+Sybil.getColorOjos()
                +"\nColor de la Piel :  "+Sybil.getColorPiel()
                +"\nOcupacion  :  "+Sybil.getOcupacion()
                +"\nCasa :  "+Sybil.getCasa()
                +"\nFecha de Nacimiento: " + Sybil.getDia()+ "/"+ Sybil.getMes()+"/"+ Sybil.getYear()
        );
    }
}
