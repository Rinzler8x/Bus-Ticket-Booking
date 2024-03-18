/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ticketbookingsystem;

/**
 *
 * @author rinzler
 */
public class TicketBookingSystem {

    /**
     * @param args the command line arguments
     */ 
    public static String globalUser = "";
    public static int globalFlag = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        LoginPage lpage = new LoginPage();
        lpage.show();        
    }
}
