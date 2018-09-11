/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelEdad;
import views.ViewEdad;
import extra.DataValidation;

/**
 *
 * @author Zeo
 */
public class ControllerEdad {
    ModelEdad modelEdad;
    ViewEdad viewEdad;
    DataValidation dataValidation = new DataValidation();
    
    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == viewEdad.jb_validar)
                jb_validad_actionPerformed();
        }
    };

    public ControllerEdad(ModelEdad modelEdad, ViewEdad viewEdad) {
        this.modelEdad = modelEdad;
        this.viewEdad = viewEdad;
        this.viewEdad.jb_validar.addActionListener(actionListener);
        initComponents();
    }
    
    public void jb_validad_actionPerformed(){
        modelEdad.setAnio_nacimiento(dataValidation.string2Int(viewEdad.jtf_anio_nacimiento.getText()));
        modelEdad.validarEdad4();
        viewEdad.jl_mayor_menor.setText(modelEdad.getMensaje());
    }
    
    public final void initComponents(){
        viewEdad.setVisible(true);
    }
}
