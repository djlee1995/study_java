
interface PlaneObject {
	Location getLocation();

	void setLocation(int x, int y);

	static class Location {
		int x, y;

		Location(int x, int y) {
			// TODO Auto-generated constructor stub
			this.x = x;
			this.y = y;
		}
	}

}