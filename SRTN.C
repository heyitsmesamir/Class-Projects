#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

struct Process {
    int id;
    int arrivalTime;
    int burstTime;
    int remainingTime;
};

bool compareArrivalTime(const Process& a, const Process& b) {
    return a.arrivalTime < b.arrivalTime;
}

bool compareRemainingTime(const Process& a, const Process& b) {
    return a.remainingTime < b.remainingTime;
}

int main() {
    int n;
    cout << "Enter the number of processes: ";
    cin >> n;

    vector<Process> processes(n);
    cout << "Enter arrival time and burst time for each process:\n";
   
 for (int i = 0; i < n; ++i) {
        processes[i].id = i + 1;
        cout << "Process " << processes[i].id << " arrival time: ";
        cin >> processes[i].arrivalTime;
        cout << "Process " << processes[i].id << " burst time: ";
        cin >> processes[i].burstTime;
        processes[i].remainingTime = processes[i].burstTime;
    }

    sort(processes.begin(), processes.end(), compareArrivalTime);

    int currentTime = 0;
    cout << "Execution order:\n";
    while (!processes.empty()) {
        sort(processes.begin(), processes.end(), compareRemainingTime);
        Process& currentProcess = processes[0];
        processes.erase(processes.begin());

        cout << "Process " << currentProcess.id << endl;
        currentTime += currentProcess.remainingTime;
        currentProcess.remainingTime = 0;

        for (int i = 0; i < processes.size(); ++i) {
            if (processes[i].arrivalTime <= currentTime) {
                processes[i].remainingTime -= currentProcess.remainingTime;
            }
        }
    }

    return 0;
}
