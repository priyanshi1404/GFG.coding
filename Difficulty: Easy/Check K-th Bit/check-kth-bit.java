class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        return (n&(1<<k)) !=0;
    }
}