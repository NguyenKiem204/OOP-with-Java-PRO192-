
public class MyString implements IString {

	@Override
	public int f1(String arg0) {
		int result = 0;
                //Đặt hết phần tử về dạng lowercase)
		arg0 = arg0.toLowerCase();
		String words[] = arg0.split("\\s");
                //check và đếm
		for (String string : words) {
			if (string.endsWith("m") || string.endsWith("n")) {
				result++;
			}
		}
		
		
		return result;
	}

	@Override
	public String f2(String arg0) {
		// TODO Auto-generated method stub
		String result ="";
		String word[] = arg0.split("\\s");
		//tìm word có độ dài dài nhất
		int max = word[0].length(); int position = 0;
		for (int i = 0; i < word.length; i++) {
			if (word[i].length() > max ) {
				max  = word[i].length();
				position = i;
			}
		}
		//đảo ngược từ và trả về string gốc
		result = new StringBuilder(word[position]).reverse().toString();
		arg0 = arg0.replaceFirst(word[position], result);
		return arg0;
	}

}
