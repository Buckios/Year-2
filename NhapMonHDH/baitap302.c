#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

long long factorial(int n) {
    long long f = 1;
    for (int i = 1; i <= n; i++) {
        f *= i;
    }
    return f;
}

int main() {
    int n;
    printf("Enter n: ");
    scanf("%d", &n);

    int pid = fork();

    if (pid < 0) {
        return 1;
    } 
    else if (pid == 0) {
        double S = 1.0;
        
        for (int i = 2; i <= n; i++) {
            S += 1.0 / factorial(i);
        }
        
        printf("Result S: %lf\n", S);
    } 
    else {
        wait(NULL); 
    }

    return 0;
}