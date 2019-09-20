/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbernsd_IMS.Model;

import javafx.beans.property.*;

/**
 *
 * @author JJ_2
 */
public abstract class Part {
    
    public Part() {
        this("", 0, 0.0, 0, 0, 0);
    }
    
    public Part(String partName,int partID, double partCost, int inStock, int min, int max) {
        this.partName.set(partName);
        this.partID.setValue(partID);
        this.partCost.setValue(partCost);
        this.inStock.setValue(inStock);
        this.min.setValue(min);
        this.max.setValue(max);            
    } 
    
    
    // private encapsulates
    // public allows access through methods
    private SimpleStringProperty partName = new SimpleStringProperty("");
        public SimpleStringProperty partNameProperty = partName;

    private SimpleIntegerProperty partID = new SimpleIntegerProperty(0);
        public SimpleIntegerProperty partIdProperty = partID;
    
    private SimpleDoubleProperty partCost = new SimpleDoubleProperty(0.0);
        public SimpleDoubleProperty partCostProperty = partCost;    
    
    private SimpleIntegerProperty inStock = new SimpleIntegerProperty(0);
        public SimpleIntegerProperty inStockProperty = inStock;
    
    private SimpleIntegerProperty min = new SimpleIntegerProperty(0);
        public SimpleIntegerProperty minProperty = min;
    
    private SimpleIntegerProperty max = new SimpleIntegerProperty(0);
        public SimpleIntegerProperty maxProperty = max;
    
    // @return the partName
    public String getPartName() {
        return partName.getValue();
    }
    // @param PartName the partName to set
    public void setPartName(String partName) {
        partNameProperty.setValue(partName);
    }
    // define a getter for partNameProperty
    public SimpleStringProperty partNameProperty() {
        return partName;
    }
    
    // @return the partID
    public int getPartID() {
        return partID.getValue();
    }
    // @param partID the partID to set
    public void setPartID(int partId) {
        partIdProperty.setValue(partId);
    }
    // accesses the partId
    public SimpleIntegerProperty partIdProperty() {
        return partID;
    }
    
    
    // @return the partCost
    public double getPartCost() {
        return partCost.getValue();
    }
    // @param PartCost the partCost to set
    public void setPartCost(double cost) {
        partCost.setValue(cost);
    }
    // define a getter for partCostProperty
    public SimpleDoubleProperty partCostProperty() {
        return partCost;
    }
    
    
    // @return the value of partInv
    public int getInStock() {
        return inStock.getValue();
    }
    // @param PartInv the partInv to set
    public void setInStock(int PartInv) {
        inStock.setValue(PartInv);
    }
    // define a getter for inStockProperty
    public SimpleIntegerProperty inStockProperty() {
        return inStock;
    }
    
    // return the value of min
    public int getMin() {
        return min.getValue();
    }
    // set the value of min
    public void setMin(int minimum) {
        min.setValue(minimum);
    }
    // assign minProperty the value of min for use in jfx
    public SimpleIntegerProperty minProperty() {
        return min;
    }
    
    // return the value of max
    public int getMax() {
        return max.getValue();
    }
    // set the value of max
    public void setMax(int maximum) {
        max.setValue(maximum);
    }
    // assign maxProperty the value of max for use in jfx
    public SimpleIntegerProperty maxProperty() {
        return max;
    }
    
    
       
    
    
}
