mport java.util.Scanner;

public class maryam {
	public static void main(String[] args) 
    { 
        String str = "Julia Lucas Mia -1"; 
        int n = str.length(); 
        Permutation permutation = new Permutation(); 
        permutation.permute(str, 0, n-1); 
    } 
}

private void permute(String str, int l, int r) 
{ 
    if (l == r) 
        System.out.println(str); 
    else
    { 
        for (int i = l; i <= r; i++) 
        { 
            str = swap(str,l,i); 
            permute(str, l+1, r); 
            str = swap(str,l,i); 
        } 
    } 
} 


