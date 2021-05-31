import java.util.Scanner;

public class Main {


	private enum Command{
		EXIT("exit"), HELP("help"), REGISTER("register"), USERS("users"), 
		PROPERTY("property"), PROPERTIES("properties"), BOOK("book"), 
		CONFIRM("confirm"), REJECT("reject"), REJECTIONS("rejections"), 
		PAY("pay"), REVIEW("review"), GUEST("guest"), STAWS("staws"),
		SEARCH("search"), BEST("best"), GLOBALTROTTER("globaltrotter"),
		INVLAID_COMMAND("Unknown command. Type help to see available commands.");

		private String description;

		Command(String description) {this.description = description;}
		public String toString() { return this.description;}

	}


	private static final String HELP = "register - adds a new user\n"
			+ "users - lists all the registered users\n"
			+ "property - adds a new a property\n"
			+ "properties - lists all properties of a host\n"
			+ "book - guest adds a new booking\n"
			+ "confirm - host confirms a booking\n"
			+ "reject - host rejects a booking\n"
			+ "rejections - lists all rejected bookings by a host\n"
			+ "pay - guest pays for a booking\n"
			+ "review - adds a review to a stay\n"
			+ "guest - list statistical information about a guest\n"
			+ "stays - list all stays of a property\n"
			+ "search - lists all properties in a location over a given capacity\n"
			+ "best - lists the best properties in a location\n"
			+ "globetrotter - lists the guest who has visited more locations\n"
			+ "help - shows the available commands\n"
			+ "exit - terminates the execution of the program";
	private static final String BYE = "Bye!";
	private static final String UNKNOWN_TYPE = "Unknown user type.";
	private static final String USER_EXIST = "User %s already exists";
	private static final String NO_USERS = "No users registered";
	private static final String LIST_USERS = "All registered users:";
	private static final String CREATE_PROPERTY = "Property %s was added to host %s.";
	private static final String UNKNOWN_PROPERTY = "Unknown rental property type.";
	private static final String USER_NOT_EXIST = "User %s does not exit.";
	private static final String USER_IS_GUEST = "User %s is not a host user.";
	private static final String PROPERTY_EXIST = "Property %s already exists.";
	private static final String HOST_HASNT_PROPRIETIES = "Host %s has no registered properties.";
	private static final String LIST_HOST_PROPERTIES = "Properties of host %s:";
	private static final String CREATE_BOOKING = "Booking %s was registered.";
	private static final String PROPERTY_DOESNT_EXIST = "Property %s does not exist.";
	private static final String PROPERTY_HASNT_CAPACITY = "Property %s has a capacity limit of %d guests.";
	private static final String INVALID_DATES = "Invalid booking dates";
	private static final String CONFIRMED = "Booking %s was confirmed";
	private static final String REJECTED = "Booking %s was rejected";
	private static final String BOOKING_DOESNT_EXIST = "Booking %s does not exist.";
	private static final String CANT_CONFIRM = "Cannot confirm booking %s that is in state %s";
	private static final String HOST_HASNT_BOOKING = "User %s is not the host of booking %s";
	private static final String CANT_REJECT = "Cannot reject booking %s that is in state %s";
	private static final String HASNT_REJECTIONS = "Host %s has not rejected ant booking.";
	private static final String REJECTIONS = "Booking rejected by host %s:";
	private static final String USER_HASNT_BOKKINGS = "User %s has no booking.";
	private static final String PAY = "Booking %s was paid: %d";
	private static final String ISNT_GUEST_BOOKING = "User %s is not the guest of booking %s.";
	private static final String CANT_PAY = "Cannot pay booking %s that is in state %s.";
	private static final String REVIWED = "Review for linetti-jersey-4 was registered.";
	private static final String CANT_REVIEW = "Cannot review booking %s that is in state %s.";
	private static final String BOKKING_IS_REVIEWED = "Booking %s was already reviewed.";
	private static final String PROPERTY_NOT_FOUND = "No property found in %s.";
	private static final String LIST_CITY_PROPERTIES = "Properties in %s.";
	private static final String BEST_PROPERTIES = "The best properties in Miami:";
	private static final String NO_GLOBALTROTTER = "No globe trotter";
	private static final String GLOBALTROTTER = "Globe trotter %s has visited %d locations";
	
	
	public static void main(String[] args) {
		commands();
		System.out.println();
	}

	private static final Command getCommand(Scanner in) {
		try {
			return Command.valueOf(in.next().toLowerCase());
		} catch (IllegalArgumentException e) {
			return Command.INVLAID_COMMAND;
		}
	}

	private static void commands() {
		RentAway ra = new RentAwatClass();
		Scanner in = new Scanner(System.in);
		Command c = getCommand(in);
		while(!c.equals(Command.EXIT)) {
			switch(c) {
			case HELP:
				System.out.println(HELP);break;
			case REGISTER:
				register(); break;
			case USERS:
				users(); break;
			case PROPERTY:
				property(); break;
			case PROPERTIES:
				properties(); break;
			case BOOK:
				book(); break;
			case CONFIRM:
				confirm(); break;
			case REJECT:
				reject(); break;
			case REJECTIONS:
				rejections(); break;
			case PAY:
				pay(); break;
			case REVIEW:
				review(); break;
			case GUEST:
				guest();
			case STAWS:
				staws();
			case SEARCH:
				search(); break;
			case BEST:
				best(); break;
			case GLOBALTROTTER:
				globalTrotter(); break;
			default:
				System.out.println(Command.INVLAID_COMMAND);
			}
			System.out.println();
			c = getCommand(in);
		}
		System.out.println(BYE);
	}

	private static void globalTrotter() {
		// TODO Auto-generated method stub

	}

	private static void best() {
		// TODO Auto-generated method stub

	}

	private static void search() {
		// TODO Auto-generated method stub

	}

	private static void staws() {
		// TODO Auto-generated method stub

	}

	private static void guest() {
		// TODO Auto-generated method stub

	}

	private static void review() {
		// TODO Auto-generated method stub

	}

	private static void pay() {
		// TODO Auto-generated method stub

	}

	private static void rejections() {
		// TODO Auto-generated method stub

	}

	private static void reject() {
		// TODO Auto-generated method stub

	}

	private static void confirm() {
		// TODO Auto-generated method stub

	}

	private static void book() {
		// TODO Auto-generated method stub

	}

	private static void properties() {
		// TODO Auto-generated method stub

	}

	private static void property() {
		// TODO Auto-generated method stub

	}

	private static void users() {
		// TODO Auto-generated method stub

	}

	private static void register() {
		// TODO Auto-generated method stub

	}
}
