public class SpecCala extends Cala{
    private int color;

    public SpecCala() {
        super();
    }

    public SpecCala(String owner, int price, int color) {
        super(owner, price);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " # " + color;
    }
    
    public void setData() {
//        //bien chu cai dau tien thanh uppercase
//        String upperCase = super.getOwner().substring(0, 1).toUpperCase();
//        //bien chu cai con lai thanh lowercase
//        String lowerCase = super.getOwner().substring(1);
//        super.setOwner(upperCase + lowerCase);
        String[] array =  super.getOwner().split("\\s+");
        for (int i = 0; i < array.length; i++) {
            //bien chu cai dau tien thanh uppercase
            String uppercase = array[i].substring(0, 1).toUpperCase();
            //bien chu cai con lai thanh lowercase
            String lowerCase = array[i].substring(1).toLowerCase();
            //set lai gia tri moi
            array[i] = uppercase + lowerCase;
        }
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += (array[i] + " ");
        }
        result = result.trim();
        super.setOwner(result);
    }
    
    public int getValue() {
        if (color % 2 == 0) {
            return super.getPrice() + 1;
        }else {
            return super.getPrice() * 2;
        }
    }
    
    
}
