package lession.one.devices;

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

