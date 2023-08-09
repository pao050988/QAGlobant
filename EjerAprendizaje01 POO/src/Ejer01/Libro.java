/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer01;

import java.util.Scanner;


public class Libro {

    public Libro() {
    }

    public Libro(String Autor, String Titulo, int Isbn, int NumPags) {
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.Isbn = Isbn;
        this.NumPags = NumPags;
    }
    public String Autor;
    public String Titulo;
    public int Isbn;
    public int NumPags;

    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el titulo del libro: ");
        this.Titulo = scanner.nextLine();

        System.out.println("Ingrese el autor del libro: ");
        this.Autor = scanner.nextLine();

        System.out.println("Ingrese el isbn del libro: ");
        this.Isbn = scanner.nextInt();

        System.out.println("Ingrese el numero de paginas del libro: ");
        this.NumPags = scanner.nextInt();
        

    }
    
    public void mostrarLibro(){
        
        System.out.println("ISBN: " + this.Isbn);

        System.out.println("Título: " + this.Titulo);

        System.out.println("Autor: " + this.Autor);

        System.out.println("Número de páginas: " + this.NumPags);
    }

 }





