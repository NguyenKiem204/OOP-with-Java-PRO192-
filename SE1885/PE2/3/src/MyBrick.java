import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyBrick implements IBrick {

	@Override
	public int f1(List<Brick> arg0) {
		int result  = 0;
                
                for(int i = 0; i < arg0.size(); i++)
                {
                   if(Character.isDigit(arg0.get(i).getPlace().charAt(0)))
                   {
                       int n = arg0.get(i).getPlace().length();
                       if(Character.isAlphabetic(arg0.get(i).getPlace().charAt(n-1)))
                           result++;
                   }
                }
                		return result;
        }

                /*int count =0;
        for (Brick brick : arg0) {
            if ("1234567890".contains(brick.getPlace().substring(0, 1)) && ("qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM".contains(brick.getPlace().substring(brick.getPlace().length()-1, brick.getPlace().length()))) ) {
                count++;
            }
        } 
        return count;
*/

	@Override
	public void f2(List<Brick> arg0) {
		int max = arg0.get(0).getPrice();
		int position = 0;
		for (int i = 0; i < arg0.size(); i++) {
			if(arg0.get(i).getPrice() > max && arg0.get(i).getPrice() %2 == 1) {
				max = arg0.get(i).getPrice();
				position = i;
			}
		}
		arg0.get(position).setPlace("XX");
		
	}

	@Override
	public void f3(List<Brick> arg0) {
		// tìm vị trí của phần tử đầu tiên có price lớn nhất
		int max = arg0.get(0).getPrice();
		int position = 0;
		for (int i = 0; i < arg0.size(); i++) {
			if(arg0.get(i).getPrice() > max ) {
				max = arg0.get(i).getPrice();
				position = i;
			}
		}
		//sắp xếp hết những phần tử  sau phàn tử ấy theo thứ tự tăng dần
                //muốn sắp xếp từ đâu đến đâu thì thay ở dòng này
		Collections.sort(arg0.subList(0,position),new Comparator<Brick>() {

			@Override
                        // sắp xếp theo thứ tự nào thì thay ở đây
			public int compare(Brick o1, Brick o2) {
				
				return o1.getPrice() - o2.getPrice();
			}
		});
	}

}
