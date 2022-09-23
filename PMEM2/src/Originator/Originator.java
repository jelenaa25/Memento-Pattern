
package Originator;

import DomainClasses.DKPorudzbina;
import Memento.Memento;


public class Originator {
    DKPorudzbina ip;
    
    public Originator(DKPorudzbina ip) {this.ip = ip;}
    
    public DKPorudzbina setMemento(Memento mem)
    { 
      this.ip = mem.getState();
      return this.ip;
    }
    
    public Memento createMemento()
    { return new Memento(this.ip);}
    
    
}
