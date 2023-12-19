package concepts.abstraction;

abstract class Operation {
    int a, b;

    public Operation(int a, int b){
        this.a = a;
        this.b = b;
    }

    abstract void solve();
}
