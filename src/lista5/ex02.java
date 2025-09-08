package lista5;

public class ex02 {
    private int num1 = 1;
    private int num2 = 2;

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Seus números são: ");
        builder.append(num1);
        builder.append(" e ");
        builder.append(num2);
        builder.append(".");
        return builder.toString();
    }


}