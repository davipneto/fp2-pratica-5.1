import utfpr.ct.dainf.if62c.pratica.Matriz;
import utfpr.ct.dainf.if62c.pratica.MatrizInvalidaException;
import utfpr.ct.dainf.if62c.pratica.MatrizesIncompativeisException;
import utfpr.ct.dainf.if62c.pratica.ProdMatrizesIncompativeisException;
import utfpr.ct.dainf.if62c.pratica.SomaMatrizesIncompativeisException;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica51 {

    public static void main(String[] args) throws MatrizInvalidaException {
        try {
            Matriz orig = new Matriz(3, 2);
            double[][] m = orig.getMatriz();
            m[0][0] = 0.0;
            m[0][1] = 0.1;
            m[1][0] = 1.0;
            m[1][1] = 1.1;
            m[2][0] = 2.0;
            m[2][1] = 2.1;
            Matriz transp = orig.getTransposta();
            System.out.println("Matriz original: " + orig);
            System.out.println("Matriz transposta: " + transp);
        }
        catch (MatrizInvalidaException mie) {
            System.out.println(mie.getLocalizedMessage());
        }
            
        try {
            Matriz A = new Matriz(2,2);
            Matriz B = new Matriz(2,2);
            double[][] a = A.getMatriz();
            a[0][0] = 0.0;
            a[0][1] = 1.0;
            a[1][0] = 2.0;
            a[1][1] = 3.0;
            double[][] b = B.getMatriz();
            b[0][0] = 0.0;
            b[0][1] = 0.2;
            b[1][0] = 0.4;
            b[1][1] = 0.6;
            System.out.println("Matriz A: " + A);
            System.out.println("Matriz B: " + B);
            System.out.println("A + B: " + A.soma(B));
            System.out.println("A x B: " + A.prod(B));
        }
        catch (MatrizInvalidaException mie){
            System.out.println(mie.getLocalizedMessage());
        }
        catch (SomaMatrizesIncompativeisException smi){
            System.out.println(smi.getLocalizedMessage());
        }
        catch (ProdMatrizesIncompativeisException pdi){
            System.out.println(pdi.getLocalizedMessage());
        }
        
        try {
            Matriz C = new Matriz(2,2);
            Matriz D = new Matriz(1,1);
            double[][] c = C.getMatriz();
            c[0][0] = 1.0;
            c[0][1] = 2.0;
            c[1][0] = 3.0;
            c[1][1] = 4.0;
            double[][] d = D.getMatriz();
            d[0][0] = 4.7;
            System.out.println("C + D: " + C.soma(D));
            System.out.println("C x D: " + C.prod(D));
        }
        catch (MatrizInvalidaException mie){
            System.out.println(mie.getLocalizedMessage());
        }
        catch (SomaMatrizesIncompativeisException smi){
            System.out.println(smi.getLocalizedMessage());
        }
        catch (ProdMatrizesIncompativeisException pdi){
            System.out.println(pdi.getLocalizedMessage());
        }
        try {    
            Matriz E = new Matriz(0,3);
        }
        catch (MatrizInvalidaException mie){
            System.out.println(mie.getLocalizedMessage());
        }
            
        }
        
        
    }
