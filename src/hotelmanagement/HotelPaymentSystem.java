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
public class HotelPaymentSystem {
 private static ThousandRupeesHandler thousandRupeesHandler = new ThousandRupeesHandler();
 private static FiveHundredRupeesHandler fivehundredRupeesHandler = new FiveHundredRupeesHandler();
 private static HundredRupeesHandler hundredRupeesHandler = new HundredRupeesHandler();
 private static FiftyRupeesHandler   fiftyRupeesHandler   = new FiftyRupeesHandler();
 private static TwentyRupeesHandler  twentyRupeesHandler  = new TwentyRupeesHandler();
 private static FiveRupeesHandler    fiveRupeesHandler    = new FiveRupeesHandler();
 
 static
 {
 // Construct the chain of Rupees Handlers
 thousandRupeesHandler.nextHandler(fivehundredRupeesHandler);
 fivehundredRupeesHandler.nextHandler(hundredRupeesHandler);
 hundredRupeesHandler.nextHandler(fiftyRupeesHandler);
 fiftyRupeesHandler.nextHandler(twentyRupeesHandler);
 twentyRupeesHandler.nextHandler(fiveRupeesHandler);
 }
 
 public void payment( long givenAmount )
 {
 
 thousandRupeesHandler.fetchRupees(givenAmount);
 }

    void invoke(int cash) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}