import java.util.*;
public class sort
{
 static int max = 2000;  int [] b;
 void Merge(int a[], int low, int mid, int high)
 {
  int i, j, k;
  b = new int[max];
  i=low; j=mid+1; k=low;
  while ( i<=mid && j<=high ) 
  {
   if( a[i] <= a[j] )
   b[k++] = a[i++] ;
   else
   b[k++] = a[j++] ;
  }
  while (i<=mid)
   b[k++] = a[i++] ;
  while (j<=high)
   b[k++] = a[j++] ;
  for(k=low; k<=high; k++)
   a[k] = b[k];
 }

 void MergeSort(int a[], int low, int high)
 {
  int mid;
  if(low >= high)
   return;
  mid = (low+high)/2 ;
  MergeSort(a, low, mid);
  MergeSort(a, mid+1, high);
  Merge(a, low, mid, high);
 }
 public  void main()
 {
  int [] a;
  int i;
  System.out.println("Enter the array size");
  Scanner sc= new Scanner (System.in);
  int n =sc.nextInt();
  a = new int[max];
  Random generator = new Random();
  for(i=0;i<=n;i++)
   a[i]=generator.nextInt(20);
  System.out.println("Array before Sorting");
  for(i=0;i<n;i++)
   System.out.println(a[i] +" ");
  MergeSort(a, 0, n);
  System.out.println("\n Sorted Numbers are : \n ");
  for(int k=0; k<=n; k++)
   System.out.println( a[k] + " ");
   }
}
