package java_testing1;

public class FormulaGeneral {
    int A;
    int B;
    int C;
    public void SetA(int A) {
        this.A = A;
    }
    public void SetB(int B) {
        this.B = B;
    }
    public void SetC(int C) {
    	this.C = C;
    }
    
    public void GetA() {
        System.out.println(this.A);
    }
    public void GetB() {
        System.out.println(this.B);
    }
    public void GetC() {
        System.out.println(this.C);
    }
    
    
    public void FormulaGeneral() {
    	//1ra instancia 
    	double x1 = (this.B - Math.pow(Math.pow(this.B, 2)-4*this.A*this.C, 0.5))/(2*this.A);
        System.out.println("X_1 = " + x1);

    	//2da instancia
    	double x2 = (this.B + Math.pow(Math.pow(this.B, 2)-4*this.A*this.C, 0.5))/(2*this.A);
        System.out.println("X_2 = " + x2);
    }

}
