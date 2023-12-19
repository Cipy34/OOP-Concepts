package concepts.abstraction;

public class Addition extends Operation {
    public Addition(int a, int b){
        super(a, b);
    }

    public void solve(){
        System.out.println(a + b);
    }
}
