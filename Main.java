class Main {
  public static void gradeLab5(){
   int score = 0;
   int number = 1;
   try {
       number = 1;
       int[] a = {0, 4, 0, 12, 1, 6, 100, 0};
       boolean b = sum(a) == 123;
       if (b)
           score++;
       System.out.println(number + ". sum():\t\t\t\t\t\t\t" + b);
   } catch (Exception e1) {
       System.out.println("\n\n" + number + ". Your code crashed.");
   }
   try {
       number = 2;
       int[] a = {0, 4, 0, 12, 1, 6, 100, 0};
       boolean b = countZero(a) == 3;
       if (b)
           score++;
       System.out.println(number + ". countZero():\t\t\t\t\t\t" + b);
   } catch (Exception e1) {
       System.out.println("\n\n" + number + ". Your code crashed.");
   }
   try {
       number = 3;
       int[] a = {0, 4, 0, -12, 1, -6, 100, 0};
       boolean b = countPositive(a) == 3;
       if (b)
           score++;
       System.out.println(number + ". countPositive():\t\t\t\t\t" + b);
   } catch (Exception e1) {
       System.out.println("\n\n" + number + ". Your code crashed.");
   }
   try {
       number = 4;
       int[] a = {0, 4, 0, 12, 4, 4, 100, 0};
       boolean b = countN(a, 4) == 3;
       if (b)
           score++;
       System.out.println(number + ". countN():\t\t\t\t\t\t" + b);
   } catch (Exception e1) {
       System.out.println("\n\n" + number + ". Your code crashed.");
   }
   try {
       number = 5;
       int[] a = {0, 4, 0, 12, 1, 6, 100, 0};
       boolean b = arrayToString(a).equals("{0, 4, 0, 12, 1, 6, 100, 0}");
       if (b)
           score++;
       System.out.println(number + ". arrayToString():\t\t\t\t\t" + b);
   } catch (Exception e1) {
       System.out.println("\n\n" + number + ". Your code crashed.");
   }
   try {
       number = 6;
       int[] a = {0, 2, 4};
       int[] c = copy(a);
       c[1] = 3;
       boolean b = a[1] == 2 && c[1] == 3 && c[2] == 4;
       if (b)
           score++;
       System.out.println(number + ". copy():\t\t\t\t\t\t" + b);
   } catch (Exception e1) {
       System.out.println("\n\n" + number + ". Your code crashed.");
   }
   try {
       number = 7;
       int[] a = {1, 3, 5};
       int[] c = bigger(a);
       boolean b = c.length == 4 && c[0] == 1 && c[1] == 3 && c[2] == 5 && c[3] == 0;
       if (b)
           score++;
       System.out.println(number + ". bigger():\t\t\t\t\t\t" + b);
   } catch (Exception e1) {
       System.out.println("\n\n" + number + ". Your code crashed.");
   }
   try {
       number = 8;
       int[] a = {1, 3, 5};
       int[] c = bigger(a);
       boolean b = c.length == 4 && c[0] == 1 && c[1] == 3 && c[2] == 5 && c[3] == 0;
       if (b)
           score++;
       System.out.println(number + ". bigger():\t\t\t\t\t\t" + b);
   } catch (Exception e1) {
       System.out.println("\n\n" + number + ". Your code crashed.");
   }
   try {
       number = 9;
       int[] a = {1, 3, 5};
       int[] c = smaller(a);
       boolean b = c.length == 2 && c[0] == 1 && c[1] == 3;
       if (b)
           score++;
       System.out.println(number + ". smaller():\t\t\t\t\t\t" + b);
   } catch (Exception e1) {
       System.out.println("\n\n" + number + ". Your code crashed.");
   }
   try {
       number = 10;
       int[] a = {1, -3, 5};
       makeSquared(a);
       boolean b = a.length == 3 && a[0] == 1 && a[1] == 9 && a[2] == 25;
       if (b)
           score++;
       System.out.println(number + ". makeSquared():\t\t\t\t\t" + b);
   } catch (Exception e1) {
       System.out.println("\n\n" + number + ". Your code crashed.");
   }
   try {
       number = 11;
       int[] a = {1, -3, 5};
       int[] c = square(a);
       boolean b = a.length == 3 && a[0] == 1 && a[1] == -3 && a[2] == 5 &&
               c != null && c.length == 3 && c[0] == 1 && c[1] == 9 && c[2] == 25;
       if (b)
           score++;
       System.out.println(number + ". makeSquared():\t\t\t\t\t" + b);
   } catch (Exception e1) {
       System.out.println("\n\n" + number + ". Your code crashed.");
   }
   try {
       number = 12;
       int[] a = splitDigits(2010);
       boolean b = a.length == 4 && a[0] == 2 && a[1] == 0 && a[2] == 1 && a[3] == 0;
       if (b)
           score++;
       System.out.println(number + ". splitDigits():\t\t\t\t\t" + b);
   } catch (Exception e1) {
       System.out.println("\n\n" + number + ". Your code crashed.");
   }
   try {
       number = 13;
       int[] a = {1, 0, 0}, d = {0, 2, 3, 0, 4}, c = append(a, d);
       boolean b = c.length == 8 && c[0] == 1 && c[1] == 0 && c[2] == 0 && c[3] == 0 &&
               c[4] == 2 && c[5] == 3 && c[6] == 0 && c[7] == 4;
       if (b)
           score++;
       System.out.println(number + ". append():\t\t\t\t\t\t" + b);
   } catch (Exception e1) {
       System.out.println("\n\n" + number + ". Your code crashed.");
   }
   try {
       number = 14;
       int[] a = {1, 2, 3, 4};
       makeReversed(a);
       boolean b = a.length == 4 && a[0] == 4 && a[1] == 3 && a[2] == 2 && a[3] == 1;
       if (b)
           score++;
       System.out.println(number + ". makeReversed():\t\t\t\t\t" + b);
   } catch (Exception e1) {
       System.out.println("\n\n" + number + ". Your code crashed.");
   }
   try {
       number = 15;
       int[] a = {7, 8, 9, 0};
       int[] c = reverse(a);
       boolean b = a.length == 4 && a[0] == 7 && a[1] == 8 && a[2] == 9 && a[3] == 0 &&
               c.length == 4 && c[0] == 0 && c[1] == 9 && c[2] == 8 && c[3] == 7;
       if (b)
           score++;
       System.out.println(number + ". reverse():\t\t\t\t\t" + b);
   } catch (Exception e1) {
       System.out.println("\n\n" + number + ". Your code crashed.");
   }
   try {
       number = 16;
       int[] a = {1, 2, 3, 1, 1};
       int[] c = remove(a, 1);
       boolean b = a.length == 5 && a[0] == 1 && a[1] == 2 && a[2] == 3 && a[3] == 1 && a[4] == 1 &&
               c.length == 2 && c[0] == 2 && c[1] == 3;
       if (b)
           score++;
       System.out.println(number + ". remove():\t\t\t\t\t\t" + b);
   } catch (Exception e1) {
       System.out.println("\n\n" + number + ". Your code crashed.");
   }
   try {
       number = 17;
       double[] a = {1, -2, 3, 1, 1};
       boolean b = min(a) == -2;
       if (b)
           score++;
       System.out.println(number + ". min():\t\t\t\t\t\t\t" + b);
   } catch (Exception e1) {
       System.out.println("\n\n" + number + ". Your code crashed.");
   }
   try {
       number = 18;
       double[] a = {1, -2, 3, 1, 1};
       boolean b = max(a) == 3;
       if (b)
           score++;
       System.out.println(number + ". max():\t\t\t\t\t\t\t" + b);
   } catch (Exception e1) {
       System.out.println("\n\n" + number + ". Your code crashed.");
   }
   try {
       number = 19;
       double[] a = {1, 2, 4, 5, 3};
       boolean b = mean(a) == 3;
       if (b)
           score++;
       System.out.println(number + ". mean():\t\t\t\t\t\t\t" + b);
   } catch (Exception e1) {
       System.out.println("\n\n" + number + ". Your code crashed.");
   }
   try {
       number = 20;
       double[] a = {1, 2, 4, 6, 7};
       boolean b = Math.abs(standardDev(a) - 2.28) < .001;
       if (b)
           score++;
       System.out.println(number + ". standardDev():\t\t\t\t\t" + b);
   } catch (Exception e1) {
       System.out.println("\n\n" + number + ". Your code crashed.");
   }
   System.out.println("Score: " + score + " / 20");
  }
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
    gradeLab5();
  }
}
