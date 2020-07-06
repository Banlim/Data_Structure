
public class Hash {
	public void inputString(String s) {
		int result = runHashString(s);
		System.out.println("result hash value : " + result);
	}
	private int runHashString(String s) {
		int p = 53;
		int m = 2^31;
		int resultHash = 0;
		int pow_p = 1;
		
		for(int i = 0; i < s.length(); i++) {
			resultHash = (resultHash + (s.charAt(i) - 'a' + 1) * pow_p) % m;
			pow_p = (p * pow_p) % m;
		}
		return resultHash;
	}
}
