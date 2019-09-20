/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbernsd_IMS.Model;

import javafx.beans.property.SimpleIntegerProperty;


/**
 *
 * @author JJ_2
 */
public class InHouse extends Part {
    
    private SimpleIntegerProperty machineID = new SimpleIntegerProperty(0);
    public SimpleIntegerProperty machineIdProperty = machineID;
    
    public InHouse() {
        this(0);
    
    }
    
    public InHouse(int machId) {
        this.machineID.setValue(machId);
    }
    
    // Setting, Getting, and Property methods
    public int getMachineID() {
        return machineID.getValue();
    }

    public void setMachineID(int machineID) {
        this.machineID.setValue(machineID);
    }

    public SimpleIntegerProperty machineIdProperty() {
        return machineID;
    }
 
    
}