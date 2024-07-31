public class TestLinkedList {
    public static void main(String[] args) {
        // Create a SinglyLinkedList instance
        SinglyLinkedList taskList = new SinglyLinkedList();

        // Add some tasks
        taskList.addTask(new Task("T001", "Task One", "Incomplete"));
        taskList.addTask(new Task("T002", "Task Two", "Complete"));
        taskList.addTask(new Task("T003", "Task Three", "Incomplete"));

        // Traverse and print all tasks
        System.out.println("All Tasks:");
        taskList.traverseTasks();

        // Search for a task
        System.out.println("\nSearching for task with ID T002:");
        Task foundTask = taskList.searchTaskById("T002");
        if (foundTask != null) {
            System.out.println(foundTask);
        } else {
            System.out.println("Task not found.");
        }

        // Delete a task
        System.out.println("\nDeleting task with ID T001:");
        taskList.deleteTaskById("T001");

        // Traverse and print all tasks after deletion
        System.out.println("\nAll Tasks after deletion:");
        taskList.traverseTasks();
    }
}
