/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbernsd_IMS.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import jbernsd_IMS.MainApp;
/**
 *
 * @author JJ_2
 */
public class Inventory {
    
    static ObservableList <Product> products = FXCollections.observableArrayList();
//    static ObservableList <Part> allParts = FXCollections.observableArrayList();
    
    public Inventory() {
        
    }
    
    private void addProduct(Product newProduct) {
        // Insert functional code here
    }

    private boolean removeProduct(int productId) {
        boolean result = false;
        // Insert functional code here
        return result;
    }
    
    private Product lookupProduct(int productId) {
        int lookup = productId;
        Product found = null;
        // Insert functional code here
        return found;
    }
    
    private void updateProduct(int productId) {
        // Insert functional code here
    }
    
    
    
}
