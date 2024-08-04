class canBeEqual {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> countTarget = new HashMap<>();
        for (int i = 0; i < target.length; i++) {
            if (!countTarget.containsKey(target[i])) {
                countTarget.put(target[i], 0);
            }
            countTarget.put(target[i], countTarget.get(target[i]) + 1);
        }

        Map<Integer, Integer> countArr = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!countArr.containsKey(arr[i])) {
                countArr.put(arr[i], 0);
            }
            countArr.put(arr[i], countArr.get(arr[i]) + 1);
        }

        return countArr.equals(countTarget);
        // Runtime: O(N), space: O(N)
    }
}
