import java.util.LinkedList;
import java.util.Scanner;


public class QueueList {
    public static LinkedList<String> dataBase = new LinkedList<>();
    public static void main(String[] args){
        for (int index = 0; index < 5; index++) {
            write();
        }
    }
    public static String dequeue(LinkedList<String> dataBase){
        return ((LinkedList<String>) dataBase).pop();
    }
    public static String first(LinkedList<String> dataBase){
        return ((LinkedList<String>) dataBase).element();
    }
    private static void enqueue(String userInput){
        dataBase.add(userInput); 
    }
    private static String getUserInput(){
        System.out.println("Введите: ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
    private static void write() {
        String userInput = getUserInput();
        if (userInput.equalsIgnoreCase("dequeue")){
            System.out.println(dequeue(dataBase));
        }
        if (userInput.equalsIgnoreCase("first")){
            System.out.println(first(dataBase));
        }
        enqueue(userInput);
    }
}