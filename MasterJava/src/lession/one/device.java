package lession.one;

class Device {

	private int id;

	public Device(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.valueOf(id);
	}
}

class Radio extends Device {

	public Radio(int id) {
		super(id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Radio r1 = new Radio(1);
		System.out.println(r1);

		Radio r2 = new Radio(2);
		System.out.println(r2);

		Device d1 = new Radio(3);
		System.out.println(d1);
	}

}
