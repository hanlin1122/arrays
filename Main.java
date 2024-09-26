class Main {
  public static int sum(int[] a){
    int sum = 0;
    for(int i = 0; i < a.length; i++){
      sum += a[i];
    }
    return sum;
  }
  public static int countZero(int[] a){
    int count = 0;
    for(int i = 0; i < a.length; i++){
      if(a[i] == 0){
        count++;
      }
    }
    return count;
  }
  public static int countPositive(int[] a){
    int count = 0;
    for(int i = 0; i < a.length; i++){
      if(a[i] > 0){
        count++;
      }
    }
    return count;
  }
  public static int countN(int[] a, int n){
    int count = 0;
    for(int i = 0; i < a.length; i++){
      if(a[i] == n){
        count++;
      }
    }
    return count;
  }
  public static void printArray(int[] a){
    System.out.print("{");
    for(int i = 0; i < a.length; i++){
      if(i != a.length-1){
        System.out.print(a[i] + ", ");
      }
      else{System.out.print(a[i]);}
    }
    System.out.print("}");
  }
  public static String arrayToString(int[] a){
    String str = "{";
    for(int i = 0; i < a.length; i++){
      if(i != a.length-1){
        str += (a[i] + ", ");
      }
      else{
        str += a[i];
      }
    }
    str += "}";
    return str;
  }
  public static int[] copy(int[] a){
    int[] copiedA = new int[a.length];
    for(int i = 0; i < a.length; i++){
      copiedA[i] = a[i];
    }
    return copiedA;
  }
  public static int[] bigger(int[] a){
    int[] biggerA = new int[a.length + 1];
    for(int i = 0; i < a.length; i++){
      biggerA[i] = a[i];
    }
    biggerA[a.length] = 0;
    return biggerA;
  }
  public static int[] smaller(int[] a){
    int[] smallerA = new int[a.length-1];
    for(int i = 0; i < a.length-1; i++){
      smallerA[i] = a[i];
    }
    return smallerA;
  }
  public static void makeSquared(int[] a){
    int[] copiedA = a;
    for (int x = 0; x < a.length; x++) {
      copiedA[x] = copiedA[x] * copiedA[x];
    }
  }
  public static int[] square(int[] a){
    int[] copiedSquaredA = new int[a.length];
    for(int i = 0; i < a.length; i++){
      copiedSquaredA[i] = a[i] * a[i];
    }
    return copiedSquaredA;
  }
  public static int[] splitDigits(int a){
    int t = 0;
    int b = a;
    while (b != 0) {
      b /= 10;
      t++;
    }
    int[] s = new int[t];
    int i = 0;
    while (a != 0) {
      s[t-1-i] = a % 10;
      a /= 10;
      i++;
    }
    return s;
  }
  public static int[] append(int[] a, int[] b){
    int len = a.length + b.length;
    int[] c = new int[len];
    for(int i = 0; i < a.length; i++){
      c[i] += a[i];
    }
    for(int i = 0; i < b.length; i++){
      c[i+a.length] = b[i];
    }
    return c;
  }
  public static void makeReversed(int[] a) {
    int temp = 0;
    if (a.length % 2 == 0) {
      temp = a.length/2 -1;
    }
    else {
      temp = a.length / 2;
    }
    
    for (int x = 0; x <= temp; x++) {
      int t = a[x];
      a[x] = a[a.length-x-1];
      a[a.length-x-1] = t;
    }

  }
  public static int[] reverse(int[] a){
    int[] b = new int[a.length];
    int n = a.length;
    for(int i = 0; i < a.length; i++){
      b[n - 1] = a[i];
      n--;
    }
    return b;
  }
  public static int[] remove(int[] a, int n){
    int count = 0;
    for(int i = 0; i < a.length; i++){
      if(a[i] == n){
        count++;
      }
    }
    int[] b = new int[a.length - count];
    int index = 0;
    for (int j = 0; j < a.length; j++) {
      if (a[j] == n) {
        continue;
      }
      b[index] = a[j];
      index++;
    }
    return b;
  }
  public static double min(double[] a){
    double min = 0;
    for(int i = 0; i < a.length; i++){
      if(a[i] < min){
        min = a[i];
      }
    }
    return min;
  }

  public static double max(double[] a){
    double max = 0;
    for(int i = 0; i < a.length; i++){
      if(a[i] > max){
        max = a[i];
      }
    }
    return max;
  }
  public static double mean(double[] a){
    int sum = 0;
    for(int i = 0; i < a.length; i++){
      sum += a[i];
    }
    double mean = sum / a.length;
    return mean;
  }
  public static double median(double[] a){
    int n = a.length;
    if(n % 2 != 0){
      return (double) a[n/2];
    }
    return (double)(a[(n-1)/2] + a[n/2] / 2);
  }
  public static double standardDev(double[] a) {
    double s = 0;
    for (int x = 0; x < a.length; x++) {
      s += a[x];
    }
    double mean = s / a.length;
    double sum2 = 0;
    for (int x = 0; x < a.length; x++) {
      sum2 += (a[x] - mean)* (a[x] - mean);
    }
    sum2 = sum2 / a.length;
    double ans = Math.pow(sum2, 0.5);

    return ans;
  }
  
  public static void main(String[] args){
    
  }
}
