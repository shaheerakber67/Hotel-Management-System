package hotelmanagement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shahe
 */
public abstract class RupeesHandler
{
 RupeesHandler rupeesHandler;
 
 public void nextHandler( RupeesHandler rupeesHandler)
 {
 this.rupeesHandler= rupeesHandler;
 }
 
 public abstract void fetchRupees( long givenAmount );
 
}