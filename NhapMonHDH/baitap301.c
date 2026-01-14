#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
    int pid = fork();

    if (pid < 0) {
        return 1;
    } 
    else if (pid == 0) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                printf("%d ", i);
            }
        }
        printf("\n");
    } 
    else {
        wait(NULL); 
    }

    return 0;
}