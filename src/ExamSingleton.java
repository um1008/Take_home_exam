
public class ExamSingleton {
    private static ExamSingleton sInstance;
    public String joke;

    public static ExamSingleton createInstance() {
        if (sInstance == null) {
            sInstance = new ExamSingleton();
        }

        return sInstance;
    }


    public static void tellJoke() {
    	System.out.println("The Great Muffin:"+"\nSo there are these two muffins baking in an oven."+"\nOne of them yells, “Wow, it’s hot in here! and the other muffin replies: “Holy cow! A talking muffin!”");

    }
}