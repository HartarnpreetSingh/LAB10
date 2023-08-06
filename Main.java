import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        try {
            // Replace "YOUR_API_URL" with the actual API URL
            String apiUrl = "YOUR_API_URL";
            String json = APIUtility.callAPI(apiUrl);

            Gson gson = new Gson();
            Model model = gson.fromJson(json, Model.class);

            // Now you have the JSON data converted into a Java object (Model)
            // You can access its properties like:
            System.out.println("Name: " + model.getName());
            System.out.println("Age: " + model.getAge());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
