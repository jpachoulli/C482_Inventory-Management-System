/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbernsd_IMS.Model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author JJ_2
 */
public class Outsourced extends Part {
    
    private SimpleStringProperty companyName = new SimpleStringProperty("");
    public SimpleStringProperty companyNameProperty = new SimpleStringProperty();
    
    public Outsourced() {
        this("");
    }
    
    public Outsourced(String compName) {
        this.companyName.setValue(compName);
    }

    public String getCompanyName() {
        return companyName.getValue();
    }

    public void setCompanyName(String companyName) {
        this.companyName.setValue(companyName);
    }
    
    public SimpleStringProperty companyNameProperty() {
        return companyName;
    }
    
    
}