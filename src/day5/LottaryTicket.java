package day5;

import java.util.Random;

public class LottaryTicket {
   private static final int LENGTH = 6;
   private  static final int MAX_LOTTARY_NUMBER = 69;
   public static void main(String[] args){
       int[] ticket = generateTicketNumber();
       printTicketNumber(ticket);
   }
   public static int[] generateTicketNumber(){
        int [] ticket = new int[LENGTH];
       Random random = new Random();

        for(int i =0;i<ticket.length;i++){
    ticket[i] = random.nextInt(MAX_LOTTARY_NUMBER)+1;
        }
        return ticket;
   }
   public static void printTicketNumber(int [] ticket){
       for(int number:ticket){
           System.out.print(number + " | ");
       }
   }
}
