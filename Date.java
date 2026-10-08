public class Date {
    int d;
    int m;
    int y;

    public Date(int d,int m,int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

   
    public String toString() {
        return String.format("%02d-%02d-%04d", d, m, y);
    }
}
