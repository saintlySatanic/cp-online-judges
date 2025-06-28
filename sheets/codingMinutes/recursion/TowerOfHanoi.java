import java.util.Scanner;

public class TowerOfHanoi {
    static void moveDisks(int disks, int diskId, char from, char to, char aux) {
        if (disks == 1) {
            System.out.printf("Moving Disk %s from %s to %s \n", diskId, from, to);
            return;
        }
        // if (disks == 2) {
        //     System.out.printf("Moving Disk %s from %s to %s \n", diskId-1, from, aux);
        //     System.out.printf("Moving Disk %s from %s to %s \n", diskId, from, to);
        //     System.out.printf("Moving Disk %s from %s to %s \n", diskId-1, aux, to);
        //     return;
        // }
        
        // make way for largest disk to be transferred from -> to
        moveDisks(disks-1, disks-1, from, aux, to);
        // for largest disk to move all the disks above it should be in aux
        moveDisks(1, disks, from, to, aux);
        // move the remaining disks on the top of largest disk
        moveDisks(disks-1, disks-1, aux, to, from);
    }

    static void towerOfHanoi(int x) {
        moveDisks(x, x, 'A', 'C', 'X');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        towerOfHanoi(x);
    }
}