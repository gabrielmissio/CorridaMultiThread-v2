public class Main {

	public static void main(String args[]) {
			
	  int numParticipantes = 15;
      for(int num = 0; num < numParticipantes; num++) {
    	  Pato pato = new Pato("Pato " + String.valueOf(num+1));
    	  pato.start();
      }
		Controle controle = Controle.getInstance();
		controle.limitList = numParticipantes;
   }   

}
