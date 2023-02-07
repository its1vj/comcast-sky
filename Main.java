public class Main {

    static class calculator{
        int x=3,y=4;
    }
    public void main(String[] args) {

        int x,y;
        calculator calc= new calculator();
        int result=calc.x+calc.y;
        System.out.println(result);
    }
}