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
public class ThousandRupeesHandler extends RupeesHandler
{
 
 public void fetchRupees(long givenAmount)
 {
 long numberofNotesToBeFetched = givenAmount / 1000;
 if (numberofNotesToBeFetched > 0)
 {
 if(numberofNotesToBeFetched >1)
 {
 System.out.println(numberofNotesToBeFetched + " ,Thousand Rupees notes are Fetched by ThousandRupeesHandler \n");
 }
 else
 {
 System.out.println(numberofNotesToBeFetched + " ,Thousand Rupees note is Fetched by ThousandRupeesHandler \n");
  
 }
 }
 
 long pendingRupeesToBeProcessed = givenAmount % 1000;
 
 if (pendingRupeesToBeProcessed > 0)
 {
 rupeesHandler.fetchRupees(pendingRupeesToBeProcessed);
 
 }
 
 }
 
}