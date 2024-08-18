package recurtion.Hard;

public class FriensINParty {
    public static void main(String[] args) {
        int numberOfFriends = 3;
        System.out.println(inviteFriends(numberOfFriends));
    }

    private static int inviteFriends(int numberOfFriends) {
        if(numberOfFriends == 1){
            return 1;
        }
        if (numberOfFriends == 2){
            return 2;
        }
        // if called in Alone
        int alone = inviteFriends(numberOfFriends-1);
        // if called in pair
        int pair = (numberOfFriends-1)*inviteFriends(numberOfFriends-2);

        return alone+pair;
    }
}
