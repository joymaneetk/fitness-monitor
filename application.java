package javaapplication;

import java.util.Scanner;

/**
 *
 * @author joykaur
 */
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           System.out.println("Let's find out if you are fit!");
        Scanner userInput= new Scanner(System.in);
       System.out.println("How much exercise do you get each day?");         
       System.out.println("Enter 1 for no exercise");
       System.out.println("Enter 2 for 30 min");
       System.out.println("Enter 3 for 1 hour");
       System.out.println("Enter 4 for 2 hours or more");
       
       
        int exercise = userInput.nextInt();
 
       switch(exercise){
          case 1: System.out.println("You are not very fit! Try to get at least 30 min of exercise!");break;
          case 2: System.out.println("Pretty good! Keep it up!");break;
          case 3: System.out.println("Nice job! That's a good amount of exercise!");break;
          case 4: System.out.println("You are like a machine! You are on a roll!");break;
          default: System.out.println("not valid option! Please enter a valid option");
       }
       System.out.println("------------------------------------------");
       
          System.out.println("Let's find out if you are getting enough sleep!");
        Scanner userInput1= new Scanner(System.in);
       System.out.println("How much sleep do you get each night?");         
       System.out.println("Enter 1 for 2-3 hours");
       System.out.println("Enter 2 for 4-5 hours");
       System.out.println("Enter 3 for 6-7 hours");
       System.out.println("Enter 4 for 8 hours");
       
       
        int sleep = userInput1.nextInt();
 
       switch(sleep){
          case 1: System.out.println("You need more sleep. A lack of sleep is detremental to the health. Get about 4 more hours of sleep");break;
          case 2: System.out.println("You need more sleep. Try to sleep for about 2 more hours. You need it!");break;
          case 3: System.out.println("Nice job! You are getting a good amount of rest! Keep it up!");break;
          case 4: System.out.println("Great! You are getting plenty of sleep!");break;
          default: System.out.println("not valid option! Please enter a valid option");
       }

        System.out.println("------------------------------------------");
        
          System.out.println("Let's find out if you are eating well!");
        Scanner userInput2= new Scanner(System.in);
       System.out.println("Is this your approximate portion size?:");         
       System.out.println("5-7 servings of vegetables");
       System.out.println("3-5 servings of wholemeal cereals and breads, potatoes, pasta and rice");
       System.out.println("3 servings of milk, yogurt and cheese");
       System.out.println("2 servings of meat, poultry, fish, eggs, beans, and nuts");
       System.out.println("Small amounts of fats, spreads, and oils");
       System.out.println("Only a max of 2 times a week for foods and drinks high in fat, sugar and salt");
       System.out.println("Enter 1 if yes");
       System.out.println("Enter 2 if no");
       
        int eating = userInput2.nextInt();
 
       switch(eating){
          case 1: System.out.println("You are eating SUPER HEALTHY! Great job!");break;
          case 2: System.out.println("Try to eat at the serving sizes stated for the healthiest diet!");break;
        
       }
       System.out.println("------------------------------------------");
       
        System.out.println("Let's find out if you are spending enough time with your friends!");
       Scanner userInput3= new Scanner(System.in);
       System.out.println("Do you spend at least 30 min with your friends?");         
       System.out.println("Enter 1 if yes");
       System.out.println("Enter 2 if no");
       
        int friends = userInput3.nextInt();
 
       switch(friends){
          case 1: System.out.println("Great Job!");break;
          case 2: System.out.println("Try to spend at least 30 min with your friends");break;
          
       }
         System.out.println("------------------------------------------");
         
       System.out.println("Let's find out about your screen time habits!");
       Scanner userInput4= new Scanner(System.in);
       System.out.println("How much time do you spend on a screen (phone, computer, etc.)?");         
       System.out.println("Enter 1 for 6 or more hours");
       System.out.println("Enter 2 for 3-5 hours");
       System.out.println("Enter 3 for 2 hour");
       System.out.println("Enter 2 for 1 hour or less");
       
        int networking = userInput4.nextInt();
 
       switch(networking){
          case 1: System.out.println("Try to limit your screen time to 3-5 hours!");break;
          case 2: System.out.println("Pretty normal!");break;
          case 3: System.out.println("Nice!");break;
          case 4: System.out.println("Amazing!");break;
                   
       }
         
    }
    
}
