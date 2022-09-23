/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import DomainClasses.DKPorudzbina;

/**
 *
 * @author prof.dr Sinisa Vlajic
 */
public class Memento {
    DKPorudzbina dkip;
    
    public Memento(DKPorudzbina dkip){this.dkip = dkip;}
    
    public DKPorudzbina getState() {return dkip;}
    public void setState(DKPorudzbina dkip) {this.dkip = dkip;}
}
