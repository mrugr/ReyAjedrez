package org.iesalandalus.programacion.reyajedrez;

    public enum Color {
         BLANCO, NEGRO;

    //atributo cadenaAMostrar

    private String cadenaAMostrar ;

    private Color (String cadenaAMostrar){
        this.cadenaAMostrar =cadenaAMostrar;
    }

        Color() {

        }

        public String toString(){
            return cadenaAMostrar;
        }

    }


