public class Fraction {

    // HCF Euclidian algo
    public static int hcf(int num, int den) {
        // TODO Auto-generated method stub

        while (num>0 && den>0) {
            if (num>den) {
                num %= den;
            }
            else{
                den %= num;
            }
        }
        if (num==0) {
            return den;
        }
        else{
            return num;
        }
    }

    public static InnerFraction add(InnerFraction a , InnerFraction b){
        int nume = (a.num*b.den) + (a.den*b.num);
        int deno = a.den*b.den;

        return new InnerFraction(nume, deno);
    }
    
    public static InnerFraction multiply(InnerFraction a , InnerFraction b){
        int nume = (a.num*b.num);
        int deno = a.den*b.den;

        return new InnerFraction(nume, deno);
    }

    public static class InnerFraction {
    
        int num;
        int den;

        public InnerFraction(int num,int den){
            this.num = num;
            this.den = den;
            Simplyfy();
        }

        public void Simplyfy(){
            int gcd = hcf(num,den);
            num /= gcd;
            den /= gcd;
        }
    }
    public static void main(String[] args) {
        InnerFraction f1 = new InnerFraction(7, 3);
        System.out.println(f1.num+"/"+f1.den);
        InnerFraction f2 = new InnerFraction(35, 21);
        System.out.println(f2.num+"/"+f2.den);

        InnerFraction f3 = add(f1,f2);
        System.out.println("Add : "+f3.num+"/"+f3.den);
        
        InnerFraction f4 = multiply(f1,f2);
        System.out.println("Mul : "+f4.num+"/"+f4.den);
    }
    
}
