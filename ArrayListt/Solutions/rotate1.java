void rotate(ArrayList<Integer> a, int numOfRotations) {
    numOfRotations %= a.size();

    for (int i = 0; i < numOfRotations; i++) {
        int last = a.remove(a.size() - 1);// O(1)
        a.add(0, last); //O(1)
    }
}
// O(n) : n is number of rotation 
