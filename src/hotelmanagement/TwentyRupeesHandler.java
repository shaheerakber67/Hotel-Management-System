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
public class TwentyRupeesHandler extends RupeesHandler
{
 
 public void fetchRupees(long givenAmount)
 {
 long numberofNotesToBeFetched = givenAmount / 20;
 if (numberofNotesToBeFetched > 0)
 {
 if(numberofNotesToBeFetched >1)
 {
 System.out.println(numberofNotesToBeFetched + " ,Twenty Rupees notes are Fetched by TwentyRupeesHandler \n");
 }
 else
 {
 System.out.println(numberofNotesToBeFetched + " ,Twenty Rupees note is Fetched by TwentyRupeesHandler \n");
  
 }
 }
 
 long pendingRupeesToBeProcessed = givenAmount % 20;
 
 if (pendingRupeesToBeProcessed > 0)
 {
 rupeesHandler.fetchRupees(pendingRupeesToBeProcessed);
 
 }
 
 }
 
}