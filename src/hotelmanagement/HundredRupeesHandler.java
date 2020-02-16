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
public class HundredRupeesHandler extends RupeesHandler
{
 
 public void fetchRupees(long givenAmount)
 {
 long numberofNotesToBeFetched = givenAmount / 100;
 if (numberofNotesToBeFetched > 0)
 {
 if(numberofNotesToBeFetched >1)
 {
 System.out.println(numberofNotesToBeFetched + " ,Hundred Rupees notes are Fetched by HundredRupeesHandler \n");
 }
 else
 {
 System.out.println(numberofNotesToBeFetched + " ,Hundred Rupees note is Fetched by HundredRupeesHandler \n");
  
 }
 }
 
 long pendingRupeesToBeProcessed = givenAmount % 100;
 
 if (pendingRupeesToBeProcessed > 0)
 {
 rupeesHandler.fetchRupees(pendingRupeesToBeProcessed);
 
 }
 
}
 
}