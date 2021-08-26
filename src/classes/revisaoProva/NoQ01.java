
package classes.revisaoProva;


public class NoQ01 {
    private NoQ01 apontProx;
    private int num;
    
    public NoQ01(int  num){
        this.apontProx = null;
        this.num = num;
    }

    public NoQ01 getApontProx() {
        return apontProx;
    }

    public void setApontProx(NoQ01 apontProx) {
        this.apontProx = apontProx;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
}
