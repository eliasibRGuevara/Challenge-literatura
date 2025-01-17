package com.cursosalura.literatura.model;

public enum Idioma {
    en("Inglés"),
    fr("Francés"),
    es("Español"),
    pt("Portugués"),
    nd("No disponible");

    private String idiomaCompleto;

    Idioma(String idiomaCompleto){
        this.idiomaCompleto=idiomaCompleto;
    }

    public static Idioma stringToEnum(String idioma){
        for(Idioma item:Idioma.values()){
            if(item.name().equalsIgnoreCase(idioma)){
                return item;
            }
        }
        return nd;
    }

    public static void listarIdiomas(){
        for (Idioma idioma:Idioma.values()){
            System.out.println(idioma.name()+" - "+idioma.getIdiomaCompleto());
        }
    }

    public String getIdiomaCompleto() {
        return idiomaCompleto;
    }
}
