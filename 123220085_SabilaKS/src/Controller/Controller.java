/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.ModelConnector;
import View.ViewInsert;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author PC PRAKTIKUM
 */
public class Controller {
    ModelConnector connector;
    ViewInsert vi;
    double score;
    String candidate;
    String result;

    public Controller (ModelConnector connector, ViewInsert vi) {
        this.connector = connector;
        this.vi = vi;
        vi.badd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fname=vi.getFname().getText();
                //String candidate=isview.getRad().isSelected()?"Android Developers" : "Web Developers";
                double fwe=Integer.parseInt(vi.getFwe().getText());
                double fct=Integer.parseInt(vi.getFct().getText());
                double fit=Integer.parseInt(vi.getFit().getText());
                
                //final score based the candidate
                if (vi.getRad().isSelected()){
                    String candidate="Android Developer";
                    double score=(fwe*0.2)+(fct*0.5)+(fit*0.3);
                }else if (vi.getRwd().isSelected()){
                    String candidate="Web Developer";
                    double score=(fwe*0.4)+(fct*0.35)+(fit*0.25);
                }
                
                if (score>=85){
                    String result="ACCEPTED";
                }else{
                    String result="NOT ACCEPTED";
                }

                connector.insertData(vi.getFname().getText(), vi.getRad().getText(), Integer.parseInt(vi.getFwe().getText()),Integer.parseInt(vi.getFct().getText()),Integer.parseInt(vi.getFit().getText()), score, result); 
            }
        });
       
    }

    public ModelConnector getConnector() {
        return connector;
    }

    public ViewInsert getVi() {
        return vi;
    }

    public double getScore() {
        return score;
    }

    public String getCandidate() {
        return candidate;
    }

    public String getResult() {
        return result;
    }
    
   
}

