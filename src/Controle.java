import java.util.ArrayList;

public class Controle {
	
	public int limitList;
    public ArrayList<String> listPatos = new ArrayList<String>();
    
	private static Controle meuSingleton = new Controle();
	
	private Controle() {
		
	}

	public static Controle getInstance() {
		return meuSingleton;
	}
	public void listControl(String patoName) {
		listPatos.add(patoName);
		if(listPatos.size() == limitList) {
			formatar(listPatos);
		}
	}

	private void formatar(ArrayList<String> list){
		System.out.println("\nOrdem de chegada:");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i+1 + "º lugar: " + list.get(i));
		}
	}
	
}