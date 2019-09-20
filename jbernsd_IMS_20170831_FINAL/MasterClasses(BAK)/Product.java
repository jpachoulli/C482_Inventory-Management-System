/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbernsd_IMS.Model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author jbernsd
 */
public class Product {
    
      protected SimpleIntegerProperty prodId;
      protected SimpleStringProperty prodName;
      protected SimpleIntegerProperty inStock;
      protected SimpleDoubleProperty prodCost;
      protected SimpleIntegerProperty min;
      protected SimpleIntegerProperty max;
      
      private ObservableList<Part> parts = FXCollections.observableArrayList();
      
       
    public Product() {
        this.prodId = new SimpleIntegerProperty(0);
        this.prodName = new SimpleStringProperty("");
        this.inStock = new SimpleIntegerProperty(0);
        this.prodCost =  new SimpleDoubleProperty(0.0);
        this.min = new SimpleIntegerProperty(0);
        this.max = new SimpleIntegerProperty(0);
       
    }
       
       
       
    public Product(int prodId, String prodName, int inStock, double prodCost, int min, int max, Part firstPart) {
               this.prodId.setValue(prodId);
               this.prodName.setValue(prodName);
               this.inStock.setValue(inStock);
               this.prodCost.setValue(prodCost);
               this.min.setValue(min);
               this.max.setValue(max);
                       
               
               parts.add(firstPart);               
           }
    
    // Set, Get, Property of prodId
    public void setProdId(int prodId) {
           this.prodId.setValue(prodId);
        }
    public int getProdId() {
           return prodId.get();
        }
    public IntegerProperty prodIdProperty() {
            return prodId;
        }
 
    
    // Set, Get, Property of prodName
    public void setProdName(String prodName) {
        this.prodName.setValue(prodName);
    }
    public String getProdName() {
        return prodName.getValue();
    }
    public StringProperty prodNameProperty() {
        return prodName;
    }
    
    // Set, Get, Property of inStock
    public void setInStock(int inStock) {
        this.inStock.setValue(inStock);
    }
    public int getInStock() {
        return inStock.getValue();
    }
    public IntegerProperty inStockProperty() {
        return inStock;
    }
    
    // Set, Get, Property of prodCost
    public void setProdCost(int prodCost) {
        this.prodCost.setValue(prodCost);
    }
    public double getProdCost() {
        return prodCost.getValue();
    }
    public DoubleProperty prodCostProperty() {
        return prodCost;
    }
    
}