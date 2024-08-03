class countNumTeams {
    public int numTeams(int[] rating) {
        // Treat each soldier as the middle soldier.
        // Count the number of soldiers to the left and to the right with ascending.
        // Repeat for descending
        // Calculate the final count; each left can combine with each right, so left * right.

        int count = 0;
        for (int i = 0; i < rating.length; i++) {
            // Let soldier i be the middle soldier.
            
            int leftSmall = 0;
            int rightLarge = 0;
            int leftLarge = 0;
            int rightSmall = 0;
            for (int j = 0; j < i; j++) {
                if (rating[j] < rating[i]) {
                    leftSmall++;
                } else if (rating[j] > rating[i]) {
                    leftLarge++;
                }
            }

            for (int k = i+1; k < rating.length; k++) {
                if (rating[k] < rating[i]) {
                    rightSmall++;
                } else if (rating[k] > rating[i]) {
                    rightLarge++;
                }
            }

            count += leftSmall * rightLarge + leftLarge * rightSmall;

        }

        return count;
    }
}
