package lt.itmokymai.spring;

//@Component
public class ServiceA {

	private String message = "labas";

	public String getResult() {
		return "ServiceA result: " + getMessage();
	}

	public String getMessage() {

		return message;
	}

//	@Autowired
	public void setMessage(String message) {
		this.message = message;
	}

	public void init() {
		System.out.println("Bean is going through init.");
	}

	public void destroy() {
		System.out.println("Bean will destroy now.");
	}

}
