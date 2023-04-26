/*public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		user.report();
		user.save();
	}
}*/

public class Main{                           // изменения
    public static void main(String[] args){
        User user = new User("Bob");

        Saveable saveable = new Persister(user);
        saveable.save();

        Reportable reportable = new Report(user);
        reportable.report();
    }
}