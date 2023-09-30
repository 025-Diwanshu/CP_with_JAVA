import java.util.*;
import java.io.*;

/**
 * 30-09-2023 10:04
 */
public class BufferedReaderFastIO {

    /*-----------------------your solution goes here----------------------*/

    /**
     * if elements in array is 10^9 take long always.
     * <p>
     * if calculating sum of elements then take long variable always.
     * <p>
     * be careful while dealing with one base indexing.
     * <p>
     * if nothing striking in the mind then think about same problem as a graph or
     * <p>
     * how can you apply binary search on answer for this question.
     */

    static void solve() {
        int n = ni();


    }






    /*-------------------------------Main Method-----------------------------*/

    public static void main(String[] args) throws IOException {
        long startTime = System.nanoTime();
        long initialMemoryUsed = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        boolean localFileReader = fileReader();
        int testcase = ni();
        while (testcase-- > 0) {
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
    static int i_min = Integer.MIN_VALUE;
    static long lmax = Long.MAX_VALUE;
    static long l_min = Long.MIN_VALUE;
    static int mod = 1000_000_007;
    static int maxArraySize = 2_000_001;
    static long[] fact;


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
            } catch (IOException ignored) {
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
        } catch (IOException ignored) {
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

    static void pl(int[][] a) {
        for (int[] e : a) {
            pl(e);
        }
    }

    static void pl(long[][] a) {
        for (long[] e : a) pl(e);
    }

    static void pl(double[][] a) {
        for (double[] e : a) {
            pl(e);
        }
    }

    static void pl(char[][] a) {
        for (char[] e : a) pl(e);
    }

    static void pl(Object[][] s) {
        for (Object[] e : s) pl(e);
    }

    /**
     * Closes the stream and releases any system resources associated with it.
     * Closing a previously closed stream has no effect.
     */
    static void close() {
        out.close();
    }




    /*---------------------------------Frequently used methods------------------------------------------*/

    static void reverse(int[] a) {
        int n = a.length - 1, temp;
        for (int i = 0; i < (n + 1) / 2; i++) {
            temp = a[i];
            a[i] = a[n - i];
            a[n - i] = temp;
        }
    }

    static void reverse(long[] a) {
        long temp;
        int n = a.length - 1;
        for (int i = 0; i < (n + 1) / 2; i++) {
            temp = a[i];
            a[i] = a[n - i];
            a[n - i] = temp;
        }
    }

    static void reverse(double[] a) {
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

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    static int upperBound(int[] a, int key) {
        int low = 0, high = a.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] >= key) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return ans;
    }

    static int lowerBound(int[] a, int key) {
        int low = 0, high = a.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] <= key) {
                ans = mid;
                low = mid + 1;
            } else high = mid - 1;
        }
        return ans;
    }

    static <Number extends Comparable<Number>> int lowerBound(List<Number> a, Number key) {
        int low = 0, high = a.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a.get(mid).compareTo(key) <= 0) {
                ans = mid;
                low = mid + 1;
            } else high = mid - 1;
        }
        return ans;
    }

    static <Number extends Comparable<Number>> int upperBound(List<Number> a, Number key) {
        int low = 0, high = a.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a.get(mid).compareTo(key) >= 0) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return ans;
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        int i = 1;
        while (++i <= Math.sqrt(n))
            if (n % i == 0) return false;
        return true;
    }//return true or false for prime check

    static boolean isPrime(long l) {
        if (l < 2) return false;
        long i = 1;
        while (++i <= Math.sqrt(l))
            if (l % i == 0) return false;
        return true;
    }

    static long pow(long a, long n) {
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

    static long pow(long a, int n) {
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

    static String reverse(String s) {
        StringBuilder reversedString = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            reversedString.append(s.charAt(i));
        }
        return reversedString.reverse().toString();
    }//Reverse the string;

    static long nCr(long n, long r) {
        if ((n - r) < r) {
            return nCr(n, n - r);
        }
        long ans = 1;
        for (long i = 1; i <= r; i++, n--) {
            if (n % i == 0) {
                ans = n / i * ans;
            } else if (ans % i == 0) {
                ans = ans / i * n;
            } else {
                ans = (ans * n) / i;
            }
        }
        return ans;
    }

    static long rootFloor(long n) {
        double tentativeRoot = Math.sqrt(n);
        long low = (long) tentativeRoot - 3;
        long ans = 0;
        long high = low + 6;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if ((mid * mid) <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    static long rootHigher(long n) {
        return rootFloor(n) + 1;
    }

    static long rootCeil(long n) {
        double tentativeRoot = Math.sqrt(n);
        long low = (long) tentativeRoot - 3;
        long ans = 0;
        long high = low + 6;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if ((mid * mid) >= n) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static long rootLower(long n) {
        return rootCeil(n) - 1;
    }

    static long inv(long val) {
        return pow(val, mod - 2);
    }

    static long nCrWithMod(int n, int r) {
        return ((fact[n] * inv(fact[r]) % mod) * inv(fact[n - r])) % mod;
    }

    static void factorial() {
        fact = new long[maxArraySize];
        fact[0] = 1;
        for (int i = 1; i < maxArraySize; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
        }
    }
}
