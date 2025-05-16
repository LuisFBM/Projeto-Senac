/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;

/**
 *
 * @author luis.fbmattos
 */
public class Boletim {
    private String[] disciplinas = {"Português","Matemática","Física","História","Geografica"};
    private double[] notas = new double[5];
    private double media = 0.0;
    
    //para o encapsulamento use o botão direito do mouse, refactor e depois encapsule fields;
    //lenght representa o tamanho do vetor;
    // getters - pegar um valor de um atributo;
    // setters - define um valor para um atributo e toda vez que ele é chamado ele atualiza;
    // this - se refere a var e "substitui" o valor anterior;
    

    /**
     * @return the disciplinas
     */
    public String[] getDisciplinas() {
        return disciplinas;
    }
    /**
     * @return the notas
     */
    public double[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(double[] notas) {
        this.notas = notas;
        processaMedia();
    }

    /**
     * @return the media
     */
    public double getMedia() {
        return media;
    }    
    
    public void processaMedia(){
       
    double somaNotas = 0.0;
    
        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i];
        }
        
    media = somaNotas / notas.length; // ultiliza o vetor como o valor para a divisão das notas;
     
}
    
}

