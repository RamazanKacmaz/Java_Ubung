package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoItem {
    private String description;
    private boolean isDone;

    public TodoItem(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void markAsDone() {
        isDone = true;
    }

    @Override
    public String toString() {
        String status = isDone ? "[X]" : "[ ]";
        return status + " " + description;
    }


    public static void main(String[] args) {
        ArrayList<TodoItem> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Yapılacaklar Listesi:");
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i + 1) + ". " + todoList.get(i));
            }

            System.out.println("\n1. Yeni Görev Ekle");
            System.out.println("2. Görevi Tamamla");
            System.out.println("3. Çıkış");
            System.out.print("Seçiminizi yapın: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Yeni görevi girin: ");
                scanner.nextLine();
                String description = scanner.nextLine();
                todoList.add(new TodoItem(description));
            } else if (choice == 2) {
                System.out.print("Tamamlanan görevin numarasını girin: ");
                int taskNumber = scanner.nextInt();
                if (taskNumber >= 1 && taskNumber <= todoList.size()) {
                    todoList.get(taskNumber - 1).markAsDone();
                } else {
                    System.out.println("Geçersiz görev numarası!");
                }
            } else if (choice == 3) {
                System.out.println("Çıkılıyor...");
                break;
            } else {
                System.out.println("Geçersiz seçim!");
            }
        }

        scanner.close();
    }
}
