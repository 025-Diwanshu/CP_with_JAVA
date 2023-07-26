import java.io.*;
import java.util.*;

public class CP_template_JAVA {


    /*-----------------------your solution goes here----------------------*/


    static void solve() {
        int n = ni();


    }






    /*-------------------------------Main Method-----------------------------*/

    public static void main(String[] args) throws IOException {
        long startTime = System.nanoTime();
        long initialMemoryUsed = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        boolean localFileReader = fileReader();
        int t = 1;
        t = ni();
        while (t-- > 0) {
            solve();
        }

        if (localFileReader) {
            timeAndMemoryDetails(startTime, initialMemoryUsed);
        }
        close();
    }


    /*----------------------------Time and Memory------------------------------*/

    static void timeAndMemoryDetails(long startTime, long initialMemory) {
        final long MEGABYTE = 1024L * 1024L;
        final long millisecond = 1000_000L;
        long afterUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        p("--------------------------\nExecution Time :");
        p((System.nanoTime() - startTime) / millisecond);
        p("ms \nMemory used    :");
        p((afterUsedMem - initialMemory) / MEGABYTE);
        pl("MB");
    }


    /*------------------------------Variables -----------------------------*/
    static int imax = Integer.MAX_VALUE;
    static int imin = Integer.MIN_VALUE;
    static long lmax = Long.MAX_VALUE;
    static long lmin = Long.MIN_VALUE;
    static int mod = 1000_000_007;


    /*--------------------------------------FastIO Class-------------------*/
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = new StringTokenizer("");


    /*-----------------local file reader ---------------------------------------*/
    public static boolean fileReader() throws IOException {
        String File = "someFile";
        try {
            File = System.getProperty("user.dir");
        } catch (Exception ignored) {
        }
        if (new File(File).getName().equals("CP")) {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("src/Input.txt")));
            out = new PrintWriter(new FileOutputStream("src/Output.txt"));
            return true;
        }
        return false;
    }

    /*-----------------------input methods-----------------------------------------*/
    static String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    static int ni() {
        return Integer.parseInt(next());
    }

    static long nl() {
        return Long.parseLong(next());
    }

    static double nd() {
        return Double.parseDouble(next());
    }

    static float nf() {
        return Float.parseFloat(next());
    }

    static String ns() {
        return next();
    }

    static String nextLine() {
        String str = "";
        try {
            str = br.readLine().trim();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    static int[] nia(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = ni();
        }
        return a;
    }

    static long[] nla(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nl();
        }
        return a;
    }

    static double[] nda(int n) {
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = nd();
        }
        return a;
    }

    static String[] nsa(int n) {
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = ns();
        }
        return s;
    }


    /*---------------------------------output methods-----------------------------------------------*/

    static PrintWriter out = new PrintWriter(System.out);

    /**
     * print single space.
     */
    static void ps() {
        out.print(' ');
    }

    static void pl(int n) {
        out.println(n);
    }

    static void pl(long n) {
        out.println(n);
    }

    static void pl(char c) {
        out.println(c);
    }

    static void pl(double n) {
        out.println(n);
    }

    static void pl(String s) {
        out.println(s);
    }

    /**
     * print YES for true and NO for false.
     */
    static void pl(boolean flag) {
        pl(flag ? "YES" : "NO");
    }

    /**
     * Print new line
     */
    static void PL() {
        out.println();
    }

    static <E> void pl(List<E> a) {
        for (E e : a) {
            p(e);
        }
        PL();
    }

    static <E> void pl(Queue<E> q) {
        for (E e : q) {
            p(e);
        }
        PL();
    }

    static void pl(Object o) {
        out.println(o);
    }

    static <E> void p(List<E> a) {
        for (E e : a) {
            p(e);
        }
    }

    static <E> void p(Queue<E> q) {
        for (E e : q) {
            p(e);
        }
    }

    static void p(int n) {
        out.print(n);
        ps();
    }

    static void p(long n) {
        out.print(n);
        ps();
    }

    static void p(double d) {
        out.print(d);
        ps();
    }

    static void p(char c) {
        out.print(c);
        ps();
    }

    static void p(String s) {
        out.print(s);
        ps();
    }

    static void p(Object o) {
        out.print(o);
        ps();
    }

    static void pl(int[] a) {
        for (int e : a) {
            p(e);
        }
        PL();
    }

    static void pl(long[] a) {
        for (long e : a) {
            p(e);
        }
        PL();
    }

    static void pl(String[] a) {
        for (String e : a) {
            p(e);
        }
        PL();
    }

    static void pl(char[] a) {
        for (char e : a) {
            p(e);
        }
        PL();
    }

    static void pl(double[] a) {
        for (double e : a) {
            p(e);
        }
        PL();
    }

    static void pl(boolean[] a) {
        for (boolean e : a) {
            out.print(e);
            ps();
        }
        PL();
    }

    static void pl(Object[] a) {
        for (Object e : a) {
            p(e);
        }
        PL();
    }

    /**
     * Closes the stream and releases any system resources associated with it.
     * Closing a previously closed stream has no effect.
     */
    static void close() {
        out.close();
    }




    /*---------------------------------Frequently used methods------------------------------------------*/

    static void reverseArray(int[] a) {
        int n = a.length - 1, temp;
        for (int i = 0; i < (n + 1) / 2; i++) {
            temp = a[i];
            a[i] = a[n - i];
            a[n - i] = temp;
        }
    }

    static void reverseArray(long[] a) {
        long temp;
        int n = a.length - 1;
        for (int i = 0; i < (n + 1) / 2; i++) {
            temp = a[i];
            a[i] = a[n - i];
            a[n - i] = temp;
        }
    }

    static void reverseArray(double[] a) {
        double temp;
        int n = a.length - 1;
        for (int i = 0; i < (n + 1) / 2; i++) {
            temp = a[i];
            a[i] = a[n - i];
            a[n - i] = temp;
        }
    }

    static double rootX(double a, double b, double c) {
        double d = (b * b) - 4 * a * c;
        return (Math.sqrt(d) - b) / (2 * a);
    }

    static double rootY(double a, double b, double c) {
        double d = (b * b) - 4 * a * c;
        return (-Math.sqrt(d) - b) / (2 * a);
    }

    static long pow(long a, long n, int mod) {
        long ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ((ans % mod) * a) % mod;
            }
            a = (a * a) % mod;
            n >>= 1;
        }
        return ans % mod;
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    static int upperBound(long[] arr, long elem) {
        int l = 0;
        int r = arr.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] > elem) {
                r = mid;
            } else l = mid + 1;
        }
        return r;
    }

    static int lowerBound(long[] arr, long elem) {
        int l = 0;
        int r = arr.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] >= elem) {
                r = mid;
            } else l = mid + 1;
        }
        return l;
    }

    /* -----------------------------Pair Class --------------------------------*/
    static class Pair<T extends Comparable<T>, V extends Comparable<V>> implements Comparable<Pair<T, V>> {
        T a;
        V b;

        Pair(T a, V b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Pair pair) {
            return this.a.compareTo((T) pair.a);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o instanceof Pair<?, ?>) {
                Pair<?, ?> pair = (Pair<?, ?>) o;
                return a.equals(pair.a) && b.equals(pair.b);
            }
            return false;
        }

        @Override
        public String toString() {
            return a + " : " + b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }

}
