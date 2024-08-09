package recurtion;

public class TowerOfHanoi {
    // Recursive function to solve the Tower of Hanoi puzzle
    public static void solve(int n, char source, char auxiliary, char destination) {
        System.out.println(n);
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        // Move n-1 disks from source to auxiliary
        solve(n - 1, source, destination, auxiliary);
        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " fro " + source + " to " + destination);
        // Move the n-1 disks from auxiliary to destination
        solve(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        solve(n, 'A', 'B', 'C'); // A is the source peg, B is the auxiliary peg, C is the destination peg
    }
}

