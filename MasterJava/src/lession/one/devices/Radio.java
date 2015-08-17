package lession.one.devices;

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
