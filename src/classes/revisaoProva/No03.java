
package classes.revisaoProva;


public class No03 {
    private No03 apontProx;
    private int num;
    
    public No03(int num){
        this.apontProx = null;
        this.num = num;
    }

    public No03 getApontProx() {
        return apontProx;
    }

    public void setApontProx(No03 apontProx) {
        this.apontProx = apontProx;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
}
