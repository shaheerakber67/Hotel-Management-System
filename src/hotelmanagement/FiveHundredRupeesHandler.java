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
public class FiveHundredRupeesHandler extends RupeesHandler
{
 
 public void fetchRupees(long givenAmount)
 {
 long numberofNotesToBeFetched = givenAmount / 500;
 if (numberofNotesToBeFetched > 0)
 {
 if(numberofNotesToBeFetched >1)
 {
 System.out.println(numberofNotesToBeFetched + " ,Five Hundred Rupees notes are Fetched by FiveHundredRupeesHandler \n");
 }
 else
 {
 System.out.println(numberofNotesToBeFetched + " ,Five Hundred Rupees note is Fetched by FiveHundredRupeesHandler \n");
  
 }
 }
 
 long pendingRupeesToBeProcessed = givenAmount % 500;
 
 if (pendingRupeesToBeProcessed > 0)
 {
 rupeesHandler.fetchRupees(pendingRupeesToBeProcessed);
 
 }
 
}
 
}