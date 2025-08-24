package src.oops.textBox;

public class TextBox extends UIControl{
    private String text = "";     //attributes/ data/ field

    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    @Override
    public String toString(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}
