/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.ModelConnector;
import View.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author PC PRAKTIKUM
 */
public class ControllerUpdt {
    ModelConnector connector;
    View vi;
    String name;

    public ControllerIpdt (ModelConnector connector, View vi, String name) {
        this.connector = connector;
        this.vi = vi;
        this.name = name;

        view.btnUpd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                connector.updateData(vi.getFname().getText(), vi.getRad().getText(), Integer.parseInt(vi.getFwe().getText()),Integer.parseInt(vi.getFct().getText()),Integer.parseInt(vi.getFit().getText()), score, result); 
            }
        });
    }
}
