package chap8;

class UnsupportedFuctionException extends RuntimeException {
	private final int ERR_CODE;

	public UnsupportedFuctionException(String message) {
		super(message);
		ERR_CODE = 100;
	}

	public UnsupportedFuctionException(String message, int err) {
		super(message);
		ERR_CODE = err;

	}

	public int getERR_CODE() {
		return ERR_CODE;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "[" + ERR_CODE + "]" + super.getMessage();
	}

}

public class Ex8_9 {

	public static void main(String[] args) /* throws Exception */ {
		try {
			throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);

		} catch (UnsupportedFuctionException e) {

			System.out.println(e.getMessage());
		}
	}
}