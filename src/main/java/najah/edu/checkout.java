package najah.edu;

public class checkout {

	private int totalprice = 0;
	public void add(int count, int price) {
	totalprice += (count * price);}
	
	public int total() {
		
		return totalprice;
		}
	
}
