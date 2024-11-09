import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;


public class Generador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final List<Worker> empleados = new ArrayList<>();
		for (int i=0; i<=100 ;i++) {
			empleados.add(new Worker());
		}
		
		Gson gson = new Gson();
		String data = gson.toJson(empleados);
		System.out.println(data);
	}

}
