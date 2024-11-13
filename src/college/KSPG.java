package college;

import java.util.Arrays;

public class KSPG {
    static int n = 5; // Number of items
    static int p[] = {3, 3, 2, 5, 1}; // Array of weights of each item
    static int w[] = {10, 15, 10, 12, 8}; // Array of values (profit) for each item
    static int W = 10; // Maximum weight capacity of the knapsack

    public static void main(String args[]) {
        int cur_w; // Current weight capacity left in the knapsack
        float tot_v = 0; // Total value of items in the knapsack
        int i, maxi; // Loop counter and index of item with the maximum value/weight ratio
        int used[] = new int[5];// Array to keep track of whether an item has been used
        Arrays.fill(used, 0); // Initialize all items as unused

        cur_w = W; // Initialize remaining capacity to maximum weight W
        while (cur_w > 0) { // Repeat while there's remaining capacity in the knapsack
            maxi = -1; // Index for the item with the highest value-to-weight ratio
            for (i = 0; i < n; ++i) // Loop through each item
                if ((used[i] == 0) && ((maxi == -1)
                        || ((float)w[i] / p[i] > (float)w[maxi] / p[maxi])))
                    maxi = i; // Select the item with the maximum value-to-weight ratio

            used[maxi] = 1; // Mark the chosen item as used
            cur_w -= p[maxi]; // Subtract the item's weight from the current capacity
            tot_v += w[maxi]; // Add the item's value to the total value
            if (cur_w >= 0) // If the item was added fully
                System.out.println("Added object " + (maxi + 1) + " (" + w[maxi] + "," + p[maxi] + ") completely in the bag. Space left: " + cur_w);
            else { // If the item couldn't be added fully due to weight constraints
                System.out.println("Added " + ((int)((1 + (float)cur_w / p[maxi]) * 100)) + "% (" + w[maxi] + "," + p[maxi] + ") of object " + (maxi + 1) + " in the bag.");
                tot_v -= w[maxi]; // Remove the full value of the item
                cur_w += p[maxi];
                tot_v += ((float)w[maxi] / p[maxi])*cur_w;
                cur_w -= cur_w;
                //tot_v += (1 + (float)cur_w / p[maxi]) * w[maxi]; // Add the fraction of the item's value that fits
            }
        }

        System.out.println("Filled the bag with objects worth " + tot_v);
    }
}

