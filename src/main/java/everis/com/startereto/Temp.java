package everis.com.startereto;

public class Temp {
	
	private String tempFormat;
	
	public Temp(String tempFormat) {
		this.tempFormat = tempFormat;
	}
	
	public String getTemp() {
		
		String result = "";
		
		switch (tempFormat) {
		
		case "far":
			result = "F�";
			break;
			
		case "celius":
			result = "C�";
			break;
			
		default:
			result = "C�";
		}
		return result;
	}
	
	public Integer conversor(Integer tempC) {
		return (tempC*9/5)+32;
	}

}
