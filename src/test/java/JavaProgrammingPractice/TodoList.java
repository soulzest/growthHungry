package JavaProgrammingPractice;

//Todo List: Create a simple command-line to-do
// list application where users can add tasks,
// view all tasks, and delete a task. This will i
// ntroduce arrays or arraylists and the basics of CRUD
// (Create, Read, Update, Delete) operations.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        System.out.println("--TODO LIST--");
        System.out.println("Choose 1 to add a task, 2 to view all tasks, 3 to delete a task");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        ArrayList<String> toDoList = new ArrayList();
        if (number == 1) {
            System.out.println("What task you want to add?");
            String newTask = scanner.next();
            toDoList.add(newTask);
        } else if (number == 2) {
            System.out.println("Your tasks: " + toDoList);
        } else {
            System.out.println("What task you want to delete from " + toDoList + "?");
            int deleteTask = scanner.nextInt();
            toDoList.remove(deleteTask);
        }
//houseAddress.forEach(System.out::print);
        System.out.println("You to do list now: ");
        toDoList.forEach(System.out::print);
    }

}
