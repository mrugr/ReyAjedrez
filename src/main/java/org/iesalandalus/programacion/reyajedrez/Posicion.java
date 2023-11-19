package org.iesalandalus.programacion.reyajedrez;

    public class Posicion {
        private int fila;
        private char columna;

    //Métodos GET y SET para atributos fila y columna

        public int getFila(){ return fila;}

        private void setFila(int fila) {
            if (fila>=1 && fila<=8){
                this.fila = fila;
            } else{
            //Excepción de tipo IllegalArgumentException
            throw new IllegalArgumentException("ERROR:no es una fila válida");
        }

    }

        public char getColumna(){return columna;}

        private void setColumna( char columna){
            if (columna >='a' && columna<='h'){
                this.columna =columna;
            }else{
                //Excepción de tipo IllegalArgumentException
                throw new IllegalArgumentException("ERROR:no es una columna válida");
            }

        }

        //Constructor con parámetros fila y columna

        public Posicion (int fila,char columna){
            setFila(fila);
            setColumna(columna);
        }

        //constructor copia y validación de fila y columna

        public Posicion (Posicion posicion){
            if(posicion!=null){
                setFila(posicion.getFila());
                setColumna(posicion.getColumna());
            }else{
                //Excepción de tipo IllegalArgumentException
                throw new IllegalArgumentException("ERROR:no es una posición válida");
            }

        }





        }





