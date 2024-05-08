import java.util.Scanner;

class Process {
    String name;
    int arrivalTime;
    int burstTime;
    int completionTime;
    int turnaroundTime;
    int waitingTime;

    public Process(String name, int arrivalTime, int burstTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
    }
}

public class FCFS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int numProcesses = scanner.nextInt();

        Process[] processes = new Process[numProcesses];

        for (int i = 0; i < numProcesses; i++) {
            System.out.print("Enter the arrival time for Process P" + (i + 1) + ": ");
            int arrivalTime = scanner.nextInt();

            System.out.print("Enter the burst time for Process P" + (i + 1) + ": ");
            int burstTime = scanner.nextInt();

            processes[i] = new Process("P" + (i + 1), arrivalTime, burstTime);
        }

        fcfsScheduling(processes);

        displayResults(processes);

        scanner.close();
    }

    public static void fcfsScheduling(Process[] processes) {
        int currentTime = 0;

        for (Process process : processes) {
            process.completionTime = currentTime + process.burstTime;

            process.turnaroundTime = process.completionTime - process.arrivalTime;
            process.waitingTime = process.turnaroundTime - process.burstTime;

            currentTime = process.completionTime;
        }
    }
    public static void displayResults(Process[] processes) {
        System.out.println("\nFCFS Scheduling Results:");
        System.out.printf("%-10s%-15s%-15s%-20s%-15s\n", "Process", "Arrival Time", "Burst Time", "Completion Time", "Turnaround Time");

        for (Process process : processes) {
            System.out.printf("%-10s%-15s%-15s%-20s%-15s\n", process.name, process.arrivalTime, process.burstTime,
                    process.completionTime, process.turnaroundTime);
        }

        double avgTurnaroundTime = 0;
        double avgWaitingTime = 0;

        for (Process process : processes) {
            avgTurnaroundTime += process.turnaroundTime;
            avgWaitingTime += process.waitingTime;
        }

        avgTurnaroundTime /= processes.length;
        avgWaitingTime /= processes.length;

        System.out.println("\nAverage Turnaround Time: " + avgTurnaroundTime);
        System.out.println("Average Waiting Time: " + avgWaitingTime);
    }
}
