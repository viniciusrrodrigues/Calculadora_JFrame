/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame{

  JLabel rotulo1, rotulo2,exibir;
  JTextField texto1,texto2;  
  JButton somar, subtrair, multiplicar, dividir;
  
  
  public Calculadora(){
        super("calculadora");
      Container tela = getContentPane();
      setLayout(null);
      rotulo1 = new JLabel("1° Número: ");
      rotulo2 = new JLabel("2° Número: ");
      
      texto1 = new JTextField(5);
      texto2 = new JTextField(5);
      
      exibir = new JLabel("");
      somar = new JButton ("Somar");
      subtrair = new JButton("Subtrair");
      multiplicar = new JButton("Multiplicar");
      dividir = new JButton("Dividir");
      
      rotulo1.setBounds(50,20,100,20);
      rotulo2.setBounds(50,60,100,20);
      texto1.setBounds(120,20,200,20);
      texto2.setBounds(120,60,200,20);
      exibir.setBounds(50,120,200,20);
      somar.setBounds(190,100,80,20);
      subtrair.setBounds(270,100,80,20);
      dividir.setBounds(190,120,80,20);
      multiplicar.setBounds(270,120,100,20);
      
      somar.addActionListener(
      new ActionListener(){
          public void actionPerformed(ActionEvent e){
              int numero1, numero2, soma;
              soma = 0;
              numero1 = Integer.parseInt(texto1.getText());
              numero2 = Integer.parseInt(texto2.getText());
              soma = numero1 + numero2;
              exibir.setVisible(true);
              exibir.setText("A soma é: "+soma);
          }
      }
      );
      subtrair.addActionListener(
      new ActionListener(){
          public void actionPerformed(ActionEvent e){
              int numero1, numero2, subtracao;
              subtracao = 0;
              numero1 = Integer.parseInt(texto1.getText());
              numero2 = Integer.parseInt(texto2.getText());
              subtracao = numero1 - numero2;
              exibir.setVisible(true);
              exibir.setText("A subtração é: "+subtracao);
          }
      }
      );
      multiplicar.addActionListener(
      new ActionListener(){
          public void actionPerformed(ActionEvent e){
              int numero1, numero2, multiplicacao;
              multiplicacao = 0;
              numero1 = Integer.parseInt(texto1.getText());
              numero2 = Integer.parseInt(texto2.getText());
              multiplicacao = numero1 * numero2;
              exibir.setVisible(true);
              exibir.setText("A Multiplicação é: "+multiplicacao);
          }
      }
      );
      dividir.addActionListener(
      new ActionListener(){
          public void actionPerformed(ActionEvent e){
              int numero1, numero2, divicao;
              divicao = 0;
              numero1 = Integer.parseInt(texto1.getText());
              numero2 = Integer.parseInt(texto2.getText());
              divicao = numero1 / numero2;
              exibir.setVisible(true);
              exibir.setText("A Divisão é: "+divicao);
          }
      }
      );
      exibir.setVisible(false);
      
      tela.add(rotulo1);
      tela.add(rotulo2);
      tela.add(texto1);
      tela.add(texto2);
      tela.add(exibir);
      tela.add(somar);
      tela.add(subtrair);
      tela.add(multiplicar);
      tela.add(dividir);
      setSize(400,250);
      setVisible(true);
  }
   public static void main(String[] args) {
        Calculadora app = new Calculadora();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
}
