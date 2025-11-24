package leetCode.easy.stackQueue;

/// 1700. Number of Students Unable to Eat Lunch
public class NumberOfStudentsUnableToEatLunch {
    public static int countStudents(int[] students, int[] sandwiches) {
        int[] count = {0,0};
        int res = students.length;
        for (int student : students)
            count[student]++;
        for (int sandwich : sandwiches){
            if (count[sandwich]==0)
                return res;
            count[sandwich]--;
            res--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num1 = {1,1,0,0};
        int[] num2 = {0,1,0,1};
        System.out.println(countStudents(num1,num2));
    }
}
