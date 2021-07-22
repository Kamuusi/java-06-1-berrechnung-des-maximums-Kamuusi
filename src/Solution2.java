import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        //Provide a program that reads numbers from the console until it reads the letter 'q'. Calculate the maximum of all values and print it to the console.

        Scanner sc = new Scanner(System.in);
        boolean pressedQ = false;
        String userInput = "";
        System.out.println("Geben Sie eine Reihe von Zahlen ein die Sie mit einem Leerzeichen trennen um sich die höchste Zahl ausgeben zu lassen");
        System.out.println("Beenden Sie das Programm indem Sie q drücken");
        int max = 0;

        while (!pressedQ) {//as long as pressedQ is false, do ->

                userInput = sc.nextLine();  //let me enter my String

                String strArr[] = userInput.split(" "); // now i'm forming my input into an string array and delete all spaces
                for (String input : strArr) { //create me an array input that saves every value of stringArray

                    int temp = Integer.MIN_VALUE;// sets my temp to the lowest possible value

                    try {   //try lets me try as long as i get an exception
                        temp = Integer.parseInt(input); //now I'm creating an Integer paseInt from Input to get an Int out of a String

                    } catch (NumberFormatException e) {//catch is my exception

                        if (input.equals("q")) {   //it says if the input have a q in it our pressedQ is "true" and we get except the exception a message
                            pressedQ = true;
                            System.out.println("User pressed Q!");
                        } else {
                            System.out.println("Error " + e.getMessage());   //if there is another letter in it we get an error message whats telling us what was wrong
                        }
                    }
                    if (temp > max && !pressedQ ) max = temp; //we are now replacing the min value with the highest value
                }

        }
        System.out.println(max); //printing the highest value of all entries
        sc.close();
    }
}
