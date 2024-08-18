package recurtion.Hard;

public class FriensINParty {
    public static void main(String[] args) {
        int numberOfFriends = 3;
        System.out.println(inviteFriends(numberOfFriends));
    }

    private static int inviteFriends(int numberOfFriends) {
        //if there is only one friend left then he can be only called alone so return 1
        if(numberOfFriends == 1){
            return 1;
        }
        //if there are only 2 friends left then they can only be called 1-1 or in a pair of 1 so return 2
        if (numberOfFriends == 2){
            return 2;
        }
        // if called in Alone
        int alone = inviteFriends(numberOfFriends-1);
        // if called in pair (numberOFFriends-1)*inviteFriend because he can choose any one friend as a pair from the remaining n-1 Friends
        int pair = (numberOfFriends-1)*inviteFriends(numberOfFriends-2);

        return alone+pair;
    }
}
