package src.oops.textBox;

public class Main {
    public static void main(String[] args) {
        TextBox textBox1 = new TextBox();
        UIControl control = new UIControl(true);
        show(control);
    }

    public static void show(UIControl control){
        if (control instanceof TextBox) {
            TextBox textBox = (TextBox) control;
            textBox.setText("Hello ji");
        }
        System.out.println(control);
    }
}