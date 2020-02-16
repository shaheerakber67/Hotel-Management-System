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
public class FiveRupeesHandler extends RupeesHandler
{
 
 public void fetchRupees(long givenAmount)
 {
 long numberofNotesToBeFetched = givenAmount / 5;
 if (numberofNotesToBeFetched > 0)
 {
 if(numberofNotesToBeFetched >1)
 {
 System.out.println(numberofNotesToBeFetched + " ,Five Rupees notes are Fetched by FiveRupeesHandler \n");
 }
 else
 {
 System.out.println(numberofNotesToBeFetched + " ,Five Rupees note is Fetched by FiveRupeesHandler \n");
  
 }
 }
 
 long pendingRupeesToBeProcessed = givenAmount % 5;
 
 if (pendingRupeesToBeProcessed > 0)
 {
 rupeesHandler.fetchRupees(pendingRupeesToBeProcessed);
 
 }
 
 }
 
}