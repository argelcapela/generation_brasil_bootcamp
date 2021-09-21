package ex02;

public class Aviao {
	private	String	name;
	private	String	company;
	private int		year;
	private	String	flightTarget;
	private	String	flightSource;
	private	int		turnedon;
	
	public Aviao(String name, String company, int year, String flightTarget, String flightSource, int turnedon) {
		super();
		this.name = name;
		this.company = company;
		this.year = year;
		this.flightTarget = flightTarget;
		this.flightSource = flightSource;
		this.turnedon = turnedon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getFlightTarget() {
		return flightTarget;
	}

	public void setFlightTarget(String flightTarget) {
		this.flightTarget = flightTarget;
	}

	public String getFlightSource() {
		return flightSource;
	}

	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}

	public int getTurnedon() {
		return turnedon;
	}

	public void setTurnedon(int turnedon) {
		this.turnedon = turnedon;
	}

	@Override
	public String toString() {
		return "Aviao [name=" + name + ", company=" + company + ", year=" + year + ", flightTarget=" + flightTarget
				+ ", flightSource=" + flightSource + ", turnedon=" + turnedon + "]";
	}
	
	
}
