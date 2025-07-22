import java.util.Scanner;
import java.util.ArrayList;

public class toDoList{

   private static Scanner sc=new Scanner(System.in);
   private static ArrayList<String> tasks=new ArrayList<>();
    public static void main(String[] args){

        while(true){

        displayMenu();

        int choice=sc.nextInt();
        sc.nextLine();

         switch(choice){

            case 1:
            addTask();
            break;

            case 2:
            viewTask();
            break;

            case 3:
            markTaskComplete();
            break;

            case 4:
            deleteTask();
            break;

            case 5:
            System.out.println("Good Day.");
            return;

            default:
            System.out.println("Invalid choice. Please try again.");
        }
        }
    }

    public static void displayMenu(){
        System.out.println("\n To Do List Menu \n");
        System.out.println("1. Add Task ");
        System.out.println("2. View All Tasks ");
        System.out.println("3. Mark Task As Complete ");
        System.out.println("4. Delete Task ");
        System.out.println("5. Exit ");
        System.out.println("Enter your Choice:");
    }

    public static void addTask(){
        System.out.println("Enter Task:");
        String task=sc.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    public static void viewTask(){
        if (tasks.isEmpty()){
            System.out.println("No Tasks available.");
            return;
        }
        System.out.println("Your Tasks:\n");
        for (int i=0; i<tasks.size(); i++){
            System.out.println((i+1)+". "+tasks.get(i));
        }
    }

    public static void markTaskComplete(){
       if (tasks.isEmpty()){
            System.out.println("No Tasks available.");
            return;
        }

        viewTask(); 
        System.out.println("Enter the task number to mark as complete:\n");
        int taskNum=sc.nextInt();
        sc.nextLine();

        if (taskNum<=0 || taskNum>tasks.size()){
            System.out.println("Invalid Task Number.");
        }
        else{
            String completedTask=tasks.get(taskNum-1)+"[Completed]";
            tasks.set(taskNum-1, completedTask);
            System.out.println("Task Completed");
        }
    }

    public static void deleteTask(){
        if (tasks.isEmpty()){
            System.out.println("No Tasks available.");
            return;
        }
        
        viewTask();
        System.out.println("Enter the task number to delete the task.");
        int taskNum=sc.nextInt();
        sc.nextLine();

        if (taskNum<=0 || taskNum>tasks.size()){
            System.out.println("Invalid Task Number.");
        }
        else{
            tasks.remove(taskNum-1);
            System.out.println("Task deleted.");
        }
    }
}