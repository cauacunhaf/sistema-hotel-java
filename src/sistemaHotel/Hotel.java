package sistemaHotel;

import java.util.ArrayList;

public class Hotel {
	
	ArrayList<Quarto> quartos = new ArrayList<>();
	
	public void adicionarQuarto(Quarto quarto) {
		quartos.add(quarto);
	}
	
	public void listarQuarto() {
		System.out.println("===========================");
		System.out.println("     Lista de Quartos:");
		System.out.println("===========================");
		
		for(int i = 0; i < quartos.size(); i++) {
			System.out.println("Número: " + quartos.get(i).getNumero());
			System.out.println("Tipo: " + quartos.get(i).getTipo());
			
			if (quartos.get(i).getDisponibilidade()) {
				System.out.println("Disponibilidade: Disponível");
				
			}else {
				System.out.println("Disponibiliadde: Indisponível");
			}
			System.out.println();
		}
	}
	
	public void reservarQuarto(int numeroQuarto) {
		
		for(int i = 0; i < quartos.size(); i++) {
			
			if(quartos.get(i).getNumero() == numeroQuarto) {
				
				if(quartos.get(i).getDisponibilidade()) {
					quartos.get(i).setDisponibilidade(false);
					System.out.println("=======================================");
					System.out.println("     Quarto reservado com sucesso!     ");
					System.out.println("=======================================");
				}else {
					System.out.println("=============================");
					System.out.println("     Quarto indisponível     ");
					System.out.println("=============================");
				}
				return;
			}
			
		}
		System.out.println("================================");
		System.out.println("     Quarto não encontrado!     ");
		System.out.println("================================");
	}
	
	public void cancelarReserva(int numeroQuarto) {
		
		for(int i = 0; i < quartos.size(); i++) {
			
			if(quartos.get(i).getNumero() == numeroQuarto) {
				
				if(quartos.get(i).getDisponibilidade()) {
					quartos.get(i).getDisponibilidade();
					System.out.println("==============================");
					System.out.println("     Quarto não reservado     ");
					System.out.println("===============================");
					
				}else {
					quartos.get(i).setDisponibilidade(true);
					System.out.println("===========================");
					System.out.println("     Reserva cancelada     ");
					System.out.println("===========================");
				}
				return;
			}
			
		}
		System.out.println("================================");
		System.out.println("     Quarto não encontrado!     ");
		System.out.println("================================");
		
	}

}
