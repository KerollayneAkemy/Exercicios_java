public class Veterinario {
	private String nome; 
	private String especialidade; 
	private int anosExperiencia;
	private int atendimentosHoje; 
	private boolean disponivel; ]

			public Veterinario(String nome, String especialidade, int anosExperiencia, boolean disponivel) {

				this.nome = nome; 
				this.especialidade = especialidade; 
				this.anosExperiencia = anosExperiencia; 
				this.atendimentosHoje = 0; 
				this.disponivel = disponivel; } 

			public void atender(String animal) { 
				if (disponivel) { for (int i = 0; i < 3; i++) {
					if (i == 2) {
						System.out.println("Atendimento concluído para " + animal); 
						atendimentosHoje++;
					} else {
						System.out.println("Examinando " + animal); 
					} 
				} 
				} else { 
					System.out.println("Veterinário indisponível");
				} 
			} 


			public void diagnosticar(String sintoma) {
				if (sintoma != null) { 
					if (sintoma.equals("febre")) { 
						System.out.println("Possível infecção"); 
					} else if (sintoma.equals("dor")) { 
						System.out.println("Inflamação detectada");
					} else { 
						System.out.println("Sintoma genérico"); 
					}
				}
			}

			public void prescreverMedicamento(String animal) {
				for (int i = 0; i < 2; i++) {
					if (disponivel) {
						System.out.println("Prescrevendo medicamento para " + animal); 
					} else {
						System.out.println("Não pode prescrever agora"); 
						break;
					} 
				}
			} 

			public void realizarCirurgia(String animal) { 
				if (anosExperiencia > 5) {
					for (int etapa = 0; etapa < 4; etapa++) { 
						if (etapa == 3) { System.out.println("Cirurgia finalizada em " + animal); 
						} else { 
							System.out.println("Executando etapa " + etapa);
						}
					}
				} else {
					System.out.println("Experiência insuficiente");
				}
			}

			public void verificarDisponibilidade() {
				if (disponivel) {
					System.out.println("Disponível");
				} else { 
					System.out.println("Ocupado");
				}
			}
			public void iniciarTurno() {
				if (!disponivel) { 
					disponivel = true; atendimentosHoje = 0; 
				} 
			}

			public void encerrarTurno() {
				if (disponivel) {
					disponivel = false; 
				} 
			}

			public void relatorio() {
				System.out.println("Nome: " + nome);
				System.out.println("Especialidade: " + especialidade);
				System.out.println("Atendimentos: " + atendimentosHoje);
			}

			public void treinar() {
				for (int i = 0; i < anosExperiencia; i++) { 
					if (i % 2 == 0) {
						System.out.println("Treinamento prático");
					} else {
						System.out.println("Treinamento teórico"); 
					} 
				} 
			}

			public void atualizarExperiencia(int anos) {
				if (anos > 0) { anosExperiencia += anos;
				}
			}

			public void emergencias(int casos) {
				for (int i = 0; i < casos; i++) {
					if (disponivel) {
						System.out.println("Atendendo emergência " + i);
						atendimentosHoje++; 
					} else {
						System.out.println("Sem disponibilidade");
						break; 
					}
				}
			}

			public void revisarProntuario(String animal) { 
				if (animal != null) {
					System.out.println("Revisando histórico de " + animal); 
				} 
			}

			public void aplicarVacina(String animal) {
				for (int i = 0; i < 1; i++) { 
					if (disponivel) {
						System.out.println("Vacina aplicada em " + animal); 
					} 
				} 
			}

			public void pausa() {
				int minutos = 0; while (minutos < 2) {
					if (minutos == 1) {
						System.out.println("Pausa quase finalizada"); 
					} 
					minutos++; 
				} 
			}

			public void status() { 
				System.out.println("Veterinário: " + nome + " | Disponível: " + disponivel); 
			}
}

