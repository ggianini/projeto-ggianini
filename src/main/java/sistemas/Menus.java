package sistemas;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import sistemas.DB;
import funcionarios.DevJr;
import funcionarios.DevPleno;
import funcionarios.Gerente;
import funcionarios.Supervisor;

public class Menus {
	public DB db = new DB();

	Scanner scan = new Scanner(System.in);

	public void menuinicial() {
		this.painelinicial();
		String menuinicial = scan.nextLine();

		switch (menuinicial) {

		case "1":

			this.painelcriar();
			this.menucriar();
			this.menuinicial();
			break;

		case "2":

			this.paineldeletar();
			this.menudeletar();
			this.menuinicial();
			break;

		case "3":

			this.paineleditar();
			this.menueditar();
			this.menuinicial();
			break;

		case "4":

			this.painellistar();
			this.menulistar();
			this.menuinicial();
			break;

		case "5":

			this.painelbuscar();
			this.menubuscar();
			this.menuinicial();


		case "9":

			System.out.println("Obrigado por usar o nosso sistema!...\n\n Saindo...");
			System.exit(0);
		default:
			System.out.println("\nVALOR DIGITADO É INVÁLIDO!!\nTENTE NOVAMENTE\n");
			this.menuinicial();
		}
	}

	public void painelinicial() {
		System.out.println("-------------------------------------");
		System.out.println("Esse é o painel do administrador\nSelecione a opção desejada");
		System.out.println("-------------------------------------");
		System.out.println("1 - Criar Funcionário");
		System.out.println("2 - Deletar Funcionário");
		System.out.println("3 - Editar Funcionário");
		System.out.println("4 - Listar Funcionários");
		System.out.println("5 - Buscar Funcionário");
		System.out.println("9 - Sair");
	}

	public void painelcriar() {
		System.out.println("Qual o cargo do Funcionário?");
		System.out.println("1 - Criar Gerente");
		System.out.println("2 - Criar Supervisor");
		System.out.println("3 - Criar Dev Pleno");
		System.out.println("4 - Criar Dev Júnior");
		System.out.println("9 - Voltar");
	}

	public void paineldeletar() {
		System.out.println("Qual o cargo do Funcionário?");
		System.out.println("1 - Deletar Gerente");
		System.out.println("2 - Deletar Supervisor");
		System.out.println("3 - Deletar Dev Pleno");
		System.out.println("4 - Deletar Dev Júnior");
		System.out.println("9 - Voltar");
	}

	public void paineleditar() {
		System.out.println("Qual o cargo do Funcionário?");
		System.out.println("1 - Editar Gerente");
		System.out.println("2 - Editar Supervisor");
		System.out.println("3 - Editar Dev Pleno");
		System.out.println("4 - Editar Dev Júnior");
		System.out.println("9 - Voltar");
	}

	public void painellistar() {
		System.out.println("Qual o cargo do Funcionário?");
		System.out.println("1 - Listar Gerentes");
		System.out.println("2 - Listar Supervisores");
		System.out.println("3 - Listar Devs Plenos");
		System.out.println("4 - Listar Devs Júniors");
		System.out.println("5 - Listar Todos"); //AQ
		System.out.println("9 - Voltar");
	}

	public void painelbuscar() {
		System.out.println("Qual o cargo do Funcionário?");
		System.out.println("1 - Buscar Gerente");
		System.out.println("2 - Buscar Supervisor");
		System.out.println("3 - Buscar Dev Pleno");
		System.out.println("4 - Buscar Dev Júnior");
		System.out.println("9 - Voltar");
	}

	public void menucriar() {
		String menucriar = scan.nextLine();

		switch (menucriar) {

		case "1":
			try {
				System.out.println("Nome do Gerente: ");
				String gerentenome = scan.nextLine();

				System.out.println("Sobrenome do Gerente: ");
				String gerentesobrenome = scan.nextLine();

				System.out.println("Salário do Gerente: ");
				double gerentesalario = Double.parseDouble(scan.nextLine());

				Gerente gerente = new Gerente(gerentenome, gerentesobrenome, gerentesalario);
				db.gerenteList.add(gerente);
			} catch (Exception e) {
				System.out.println("\nVALOR DIGITADO É INVÁLIDO!!\n\nException: " + e);
			}
			break;

		case "2":
			try {
				System.out.println("Nome do Supervisor: ");
				String supervisornome = scan.nextLine();

				System.out.println("Sobrenome do Supervisor: ");
				String supervisorsobrenome = scan.nextLine();


				System.out.println("Salário do Supervisor: ");
				double supervisorsalario = Double.parseDouble(scan.nextLine());
				Supervisor supervisor = new Supervisor(supervisornome, supervisorsobrenome, supervisorsalario);
				db.supervisorList.add(supervisor);
			} catch (Exception e) {
				System.out.println("\nVALOR DIGITADO É INVÁLIDO!!\n\nException: " + e);
			}


			break;

		case "3":
			try {
				System.out.println("Nome do Dev Pleno: ");
				String devplenonome = scan.nextLine();

				System.out.println("Sobrenome do Dev Pleno: ");
				String devplenosobrenome = scan.nextLine();

				System.out.println("Salário do Dev Pleno: ");
				double devplenosalario = Double.parseDouble(scan.nextLine());

				DevPleno devpleno = new DevPleno(devplenonome, devplenosobrenome, devplenosalario);
				db.devplenoList.add(devpleno);
			} catch (Exception e) {
				System.out.println("\nVALOR DIGITADO É INVÁLIDO!!\n\nException: " + e);
			}
			break;

		case "4":
			try {
				System.out.println("Nome do Dev Júnior: ");
				String devjrnome = scan.nextLine();

				System.out.println("Sobrenome do Dev Júnior: ");
				String devjrsobrenome = scan.nextLine();

				System.out.println("Salário do Dev Júnior: ");
				double devjrsalario = Double.parseDouble(scan.nextLine());

				DevJr devjr = new DevJr(devjrnome, devjrsobrenome, devjrsalario);
				db.devjrList.add(devjr);

			} catch (Exception e) {
				System.out.println("\nVALOR DIGITADO É INVÁLIDO!!\n\nException: " + e);
			}

			break;

		case "9":

			this.menuinicial();
		default:
			System.out.println("\nVALOR DIGITADO É INVÁLIDO!!\nTENTE NOVAMENTE\n");
			this.painelcriar();
			this.menucriar();
		}
	}

	public void menudeletar() {
		String menudeletar = scan.nextLine();
		switch (menudeletar) {

		case "1":

			System.out.println("Nome do Gerente a ser deletado: ");
			String gerentenome = scan.nextLine();

			for (int i = 0; i < db.gerenteList.size(); i++) {
				if (db.gerenteList.get(i).getNome().equals(gerentenome)) {
					db.gerenteList.remove(i);
					break;
				}
			}

			break;

		case "2":

			System.out.println("Nome do Supervisor a ser deletado: ");
			String supervisornome = scan.nextLine();

			for (int i = 0; i < db.supervisorList.size(); i++) {
				if (db.supervisorList.get(i).getNome().equals(supervisornome)) {
					db.supervisorList.remove(i);
					break;
				}
			}

			break;

		case "3":

			System.out.println("Nome do Dev Pleno a ser deletado: ");
			String devplenonome = scan.nextLine();

			for (int i = 0; i < db.devplenoList.size(); i++) {
				if (db.devplenoList.get(i).getNome().equals(devplenonome)) {
					db.devplenoList.remove(i);
					break;
				}
			}
			break;

		case "4":

			System.out.println("Nome do Dev Júnior a ser deletado: ");
			String devjrnome = scan.nextLine();

			for (int i = 0; i < db.devjrList.size(); i++) {
				if (db.devjrList.get(i).getNome().equals(devjrnome)) {
					db.devjrList.remove(i);
					break;
				}
			}
			break;

		case "9":

			this.menuinicial();
		default:
			System.out.println("\nVALOR DIGITADO É INVÁLIDO!!\nTENTE NOVAMENTE\n");
			this.paineldeletar();
			this.menudeletar();
		}
	}

	public void menueditar() {
		String menueditar = scan.nextLine();
		switch (menueditar) {

		case "1":

			System.out.println("Nome do Gerente a ser editado: ");
			String gerentenome = scan.nextLine();
			System.out.println("Atributos: nome, sobrenome, salario, endereço, tel, cel senha, dependentes");
			System.out.println("Atributo do Gerente a ser editado: ");
			String gerenteatributo = scan.nextLine();
			System.out.println("Novo valor para " + gerenteatributo + ": ");
			String gerentevaloratributo = scan.nextLine();

			for (int i = 0; i < db.gerenteList.size(); i++) {
				if (db.gerenteList.get(i).getNome().equals(gerentenome)) {
					if (gerenteatributo.equals("nome")) {
						db.gerenteList.get(i).setNome(gerentevaloratributo);
					} else if (gerenteatributo.equals("sobrenome")) {
						db.gerenteList.get(i).setSobreNome(gerentevaloratributo);
					} else if (gerenteatributo.equals("salario")) {
						db.gerenteList.get(i).setSalario(Double.parseDouble(gerentevaloratributo));
					} else if (gerenteatributo.equals("endereço")) {
						db.gerenteList.get(i).setEndereço(gerentevaloratributo);
					} else if (gerenteatributo.equals("tel")) {
						db.gerenteList.get(i).setTel(gerentevaloratributo);
					} else if (gerenteatributo.equals("cel")) {
						db.gerenteList.get(i).setCel(gerentevaloratributo);
					} else if (gerenteatributo.equals("senha")) {
						db.gerenteList.get(i).setSenha(gerentevaloratributo);
					} else if (gerenteatributo.equals("cel")) {
						db.gerenteList.get(i).setCel(gerentevaloratributo);
					} else if (gerenteatributo.equals("dependentes")) {
						List < String > gerentedependentesList = Arrays.asList(gerentevaloratributo.split("\\s*,\\s*"));
						db.gerenteList.get(i).setDependentes(gerentedependentesList);
					}

				}
			}
			break;

		case "2":

			System.out.println("Nome do Supervisor a ser editado: ");
			String supervisornome = scan.nextLine();
			System.out.println("Atributos: nome, sobrenome, salario, endereço, tel, cel senha, setor, equipe, dependentes");
			System.out.println("Atributo do Supervisor a ser editado: ");
			String supervisoratributo = scan.nextLine();
			System.out.println("Novo valor para " + supervisoratributo + ": ");
			String supervisorvaloratributo = scan.nextLine();

			for (int i = 0; i < db.supervisorList.size(); i++) {
				if (db.supervisorList.get(i).getNome().equals(supervisornome)) {
					if (supervisoratributo.equals("nome")) {
						db.supervisorList.get(i).setNome(supervisorvaloratributo);
					} else if (supervisoratributo.equals("sobrenome")) {
						db.supervisorList.get(i).setSobreNome(supervisorvaloratributo);
					} else if (supervisoratributo.equals("salario")) {
						db.supervisorList.get(i).setSalario(Double.parseDouble(supervisorvaloratributo));
					} else if (supervisoratributo.equals("endereço")) {
						db.supervisorList.get(i).setEndereço(supervisorvaloratributo);
					} else if (supervisoratributo.equals("tel")) {
						db.supervisorList.get(i).setTel(supervisorvaloratributo);
					} else if (supervisoratributo.equals("cel")) {
						db.supervisorList.get(i).setCel(supervisorvaloratributo);
					} else if (supervisoratributo.equals("senha")) {
						db.supervisorList.get(i).setSenha(supervisorvaloratributo);
					} else if (supervisoratributo.equals("cel")) {
						db.supervisorList.get(i).setCel(supervisorvaloratributo);
					} else if (supervisoratributo.equals("dependentes")) {
						List < String > supervisordependentesList = Arrays.asList(supervisorvaloratributo.split("\\s*,\\s*"));
						db.supervisorList.get(i).setDependentes(supervisordependentesList);
					} else if (supervisoratributo.equals("equipe")) {
						db.supervisorList.get(i).setEquipe(supervisorvaloratributo);
					} else if (supervisoratributo.equals("setor")) {
						db.supervisorList.get(i).setSetor(supervisorvaloratributo);
					}
				}
			}
			break;

		case "3":

			System.out.println("Nome do Dev Pleno a ser editado: ");
			String devplenonome = scan.nextLine();
			System.out.println("Atributos: nome, sobrenome, salario, endereço, tel, cel senha, setor, equipe, dependentes, linguagens");
			System.out.println("Atributo do Dev Pleno a ser editado: ");
			String devplenoatributo = scan.nextLine();
			System.out.println("Novo valor para " + devplenoatributo + ": ");
			String devplenovaloratributo = scan.nextLine();

			for (int i = 0; i < db.devplenoList.size(); i++) {
				if (db.devplenoList.get(i).getNome().equals(devplenonome)) {
					if (devplenoatributo.equals("nome")) {
						db.devplenoList.get(i).setNome(devplenovaloratributo);
					} else if (devplenoatributo.equals("sobrenome")) {
						db.devplenoList.get(i).setSobreNome(devplenovaloratributo);
					} else if (devplenoatributo.equals("salario")) {
						db.devplenoList.get(i).setSalario(Double.parseDouble(devplenovaloratributo));
					} else if (devplenoatributo.equals("endereço")) {
						db.devplenoList.get(i).setEndereço(devplenovaloratributo);
					} else if (devplenoatributo.equals("tel")) {
						db.devplenoList.get(i).setTel(devplenovaloratributo);
					} else if (devplenoatributo.equals("cel")) {
						db.devplenoList.get(i).setCel(devplenovaloratributo);
					} else if (devplenoatributo.equals("senha")) {
						db.devplenoList.get(i).setSenha(devplenovaloratributo);
					} else if (devplenoatributo.equals("cel")) {
						db.devplenoList.get(i).setCel(devplenovaloratributo);
					} else if (devplenoatributo.equals("equipe")) {
						db.supervisorList.get(i).setEquipe(devplenovaloratributo);
					} else if (devplenoatributo.equals("setor")) {
						db.supervisorList.get(i).setSetor(devplenovaloratributo);
					} else if (devplenoatributo.equals("dependentes")) {


						List < String > devplenodependentesList = Arrays.asList(devplenovaloratributo.split("\\s*,\\s*"));

						db.devplenoList.get(i).setDependentes(devplenodependentesList);
					} else if (devplenoatributo.equals("linguagens")) {

						List < String > devplenolinguagensList = Arrays.asList(devplenovaloratributo.split("\\s*,\\s*"));

						db.devplenoList.get(i).setLinguagens(devplenolinguagensList);
					}

				}
			}
			break;

		case "4":

			System.out.println("Nome do Dev Júnior a ser editado: ");
			String devjrnome = scan.nextLine();

			System.out.println("Atributos: nome, sobrenome, salario, endereço, tel, cel senha, setor, equipe, dependentes, linguagens");
			System.out.println("Atributo do Dev Júnior a ser editado: ");
			String devjratributo = scan.nextLine();

			System.out.println("Novo valor para " + devjratributo + ": ");
			String devjrvaloratributo = scan.nextLine();

			for (int i = 0; i < db.devjrList.size(); i++) {
				if (db.devjrList.get(i).getNome().equals(devjrnome)) {
					if (devjratributo.equals("nome")) {
						db.devjrList.get(i).setNome(devjrvaloratributo);
					} else if (devjratributo.equals("sobrenome")) {
						db.devjrList.get(i).setSobreNome(devjrvaloratributo);
					} else if (devjratributo.equals("salario")) {
						db.devjrList.get(i).setSalario(Double.parseDouble(devjrvaloratributo));
					} else if (devjratributo.equals("endereço")) {
						db.devjrList.get(i).setEndereço(devjrvaloratributo);
					} else if (devjratributo.equals("tel")) {
						db.devjrList.get(i).setTel(devjrvaloratributo);
					} else if (devjratributo.equals("cel")) {
						db.devjrList.get(i).setCel(devjrvaloratributo);
					} else if (devjratributo.equals("senha")) {
						db.devjrList.get(i).setSenha(devjrvaloratributo);
					} else if (devjratributo.equals("cel")) {
						db.devjrList.get(i).setCel(devjrvaloratributo);
					} else if (devjratributo.equals("equipe")) {
						db.supervisorList.get(i).setEquipe(devjrvaloratributo);
					} else if (devjratributo.equals("setor")) {
						db.supervisorList.get(i).setSetor(devjrvaloratributo);
					} else if (devjratributo.equals("dependentes")) {

						List < String > devjrdependentesList = Arrays.asList(devjrvaloratributo.split("\\s*,\\s*"));

						db.devjrList.get(i).setDependentes(devjrdependentesList);
					} else if (devjratributo.equals("linguagens")) {

						List < String > devjrlinguagensList = Arrays.asList(devjrvaloratributo.split("\\s*,\\s*"));

						db.devjrList.get(i).setLinguagens(devjrlinguagensList);
					}
				}
			}
			break;

		case "9":
			this.menuinicial();
		default:
			System.out.println("\nVALOR DIGITADO É INVÁLIDO!!\nTENTE NOVAMENTE\n");
			this.paineleditar();
			this.menueditar();
		}
	}

	@SuppressWarnings("rawtypes")
	public void menulistar() {
		Iterator gerenteitr = db.gerenteList.iterator();
		Iterator supervisoritr = db.supervisorList.iterator();
		Iterator devplenoitr = db.devplenoList.iterator();
		Iterator devjritr = db.devjrList.iterator();
		String menulistar = scan.nextLine();

		switch (menulistar) {

		case "1":

			if (!db.gerenteList.isEmpty()) {
				System.out.println("-------------------------------------\nGerentes: ");
				while (gerenteitr.hasNext()) {
					Gerente showgerente = (Gerente) gerenteitr.next();
					System.out.println("-------------------------------------");
					System.out.println("Nome: " + showgerente.getNome() + " " + showgerente.getSobreNome());
					System.out.println("\nSalário: " + showgerente.getSalario());

					if (showgerente.getEndereço() != null)
						System.out.println("\nEndereço: " + showgerente.getEndereço());

					if (showgerente.getTel() != null)
						System.out.println("\nTelefone: " + showgerente.getTel());

					if (showgerente.getCel() != null)
						System.out.println("\nCelular: " + showgerente.getCel());

					if (showgerente.getSenha() != null)
						System.out.println("\nSenha: " + showgerente.getSenha());

					if (showgerente.getSenha() != null)
						System.out.println("\nSenha: " + showgerente.getSenha());

					if (showgerente.getDependentes() != null)
						System.out.println("\nDependentes: " + showgerente.getDependentes());
				}
				break;
			} else
				System.out.println("-------------------------------------");
			System.out.println("Não há gerentes no sistema");
			break;

		case "2":
			if (!db.supervisorList.isEmpty()) {
				System.out.println("-------------------------------------\nSupervisores: ");
				while (supervisoritr.hasNext()) {
					Supervisor showsupervisor = (Supervisor) supervisoritr.next();
					System.out.println("-------------------------------------");
					System.out.println("Nome: " + showsupervisor.getNome() + " " + showsupervisor.getSobreNome());
					System.out.println("\nSalário: " + showsupervisor.getSalario());
					if (showsupervisor.getEndereço() != null)
						System.out.println("\nEndereço: " + showsupervisor.getEndereço());
					if (showsupervisor.getTel() != null)
						System.out.println("\nTelefone: " + showsupervisor.getTel());

					if (showsupervisor.getCel() != null)
						System.out.println("\nCelular: " + showsupervisor.getCel());

					if (showsupervisor.getSenha() != null)
						System.out.println("\nSenha: " + showsupervisor.getSenha());

					if (showsupervisor.getSetor() != null)
						System.out.println("\nSetor: " + showsupervisor.getSetor());

					if (showsupervisor.getEquipe() != null)
						System.out.println("\nEquipe: " + showsupervisor.getEquipe());

					if (showsupervisor.getDependentes() != null)
						System.out.println("\nDependentes: " + showsupervisor.getDependentes());
				}
				break;
			} else
				System.out.println("-------------------------------------");
			System.out.println("Não há supervisores no sistema");
			break;

		case "3":
			if (!db.devplenoList.isEmpty()) {
				System.out.println("-------------------------------------\nDevs Plenos: ");
				while (devplenoitr.hasNext()) {
					DevPleno showdevpleno = (DevPleno) devplenoitr.next();
					System.out.println("-------------------------------------");
					System.out.println("Nome: " + showdevpleno.getNome() + " " + showdevpleno.getSobreNome());
					System.out.println("\nSalário: " + showdevpleno.getSalario());

					if (showdevpleno.getEndereço() != null)
						System.out.println("\nEndereço: " + showdevpleno.getEndereço());

					if (showdevpleno.getTel() != null)
						System.out.println("\nTelefone: " + showdevpleno.getTel());

					if (showdevpleno.getCel() != null)
						System.out.println("\nCelular: " + showdevpleno.getCel());

					if (showdevpleno.getSenha() != null)
						System.out.println("\nSenha: " + showdevpleno.getSenha());

					if (showdevpleno.getSetor() != null)
						System.out.println("\nSetor: " + showdevpleno.getSetor());

					if (showdevpleno.getEquipe() != null)
						System.out.println("\nEquipe: " + showdevpleno.getEquipe());

					if (showdevpleno.getDependentes() != null)
						System.out.println("\nDependentes: " + showdevpleno.getDependentes());
				}
				break;
			} else
				System.out.println("-------------------------------------");
			System.out.println("Não há devs plenos no sistema");
			break;

		case "4":
			if (!db.devjrList.isEmpty()) {
				System.out.println("-------------------------------------\nDevs Júniores: ");
				while (devjritr.hasNext()) {
					DevJr showdevjr = (DevJr) devjritr.next();
					System.out.println("-------------------------------------");
					System.out.println("Nome: " + showdevjr.getNome() + " " + showdevjr.getSobreNome());
					System.out.println("\nSalário: " + showdevjr.getSalario());

					if (showdevjr.getEndereço() != null)
						System.out.println("\nEndereço: " + showdevjr.getEndereço());

					if (showdevjr.getTel() != null)
						System.out.println("\nTelefone: " + showdevjr.getTel());

					if (showdevjr.getCel() != null)
						System.out.println("\nCelular: " + showdevjr.getCel());

					if (showdevjr.getSenha() != null)
						System.out.println("\nSenha: " + showdevjr.getSenha());

					if (showdevjr.getSetor() != null)
						System.out.println("\nSetor: " + showdevjr.getSetor());

					if (showdevjr.getEquipe() != null)
						System.out.println("\nEquipe: " + showdevjr.getEquipe());

					if (showdevjr.getDependentes() != null)
						System.out.println("\nDependentes: " + showdevjr.getDependentes());
				}
				break;
			} else
				System.out.println("-------------------------------------");
			System.out.println("Não há devs júniors no sistema");
			break;

		case "5":
			if (!db.gerenteList.isEmpty()) {
				System.out.println("-------------------------------------\nGerentes: ");
				while (gerenteitr.hasNext()) {
					Gerente showgerente = (Gerente) gerenteitr.next();
					System.out.println("-------------------------------------");
					System.out.println("Nome: " + showgerente.getNome() + " " + showgerente.getSobreNome());
					System.out.println("\nSalário: " + showgerente.getSalario());

					if (showgerente.getEndereço() != null)
						System.out.println("\nEndereço: " + showgerente.getEndereço());

					if (showgerente.getTel() != null)
						System.out.println("\nTelefone: " + showgerente.getTel());

					if (showgerente.getCel() != null)
						System.out.println("\nCelular: " + showgerente.getCel());

					if (showgerente.getSenha() != null)
						System.out.println("\nSenha: " + showgerente.getSenha());

					if (showgerente.getDependentes() != null)
						System.out.println("\nDependentes: " + showgerente.getDependentes());
				}
			}
			if (!db.supervisorList.isEmpty()) {
				System.out.println("-------------------------------------\nSupervisores: ");
				while (supervisoritr.hasNext()) {
					Supervisor showsupervisor = (Supervisor) supervisoritr.next();
					System.out.println("-------------------------------------");
					System.out.println("Nome: " + showsupervisor.getNome() + " " + showsupervisor.getSobreNome());
					System.out.println("\nSalário: " + showsupervisor.getSalario());

					if (showsupervisor.getEndereço() != null)
						System.out.println("\nEndereço: " + showsupervisor.getEndereço());

					if (showsupervisor.getTel() != null)
						System.out.println("\nTelefone: " + showsupervisor.getTel());

					if (showsupervisor.getCel() != null)
						System.out.println("\nCelular: " + showsupervisor.getCel());

					if (showsupervisor.getSenha() != null)
						System.out.println("\nSenha: " + showsupervisor.getSenha());

					if (showsupervisor.getSetor() != null)
						System.out.println("\nSetor: " + showsupervisor.getSetor());

					if (showsupervisor.getEquipe() != null)
						System.out.println("\nEquipe: " + showsupervisor.getEquipe());

					if (showsupervisor.getDependentes() != null)
						System.out.println("\nDependentes: " + showsupervisor.getDependentes());
				}
			}
			if (!db.devplenoList.isEmpty()) {
				System.out.println("-------------------------------------\nDevs Plenos: ");
				while (devplenoitr.hasNext()) {
					DevPleno showdevpleno = (DevPleno) devplenoitr.next();
					System.out.println("-------------------------------------");
					System.out.println("Nome: " + showdevpleno.getNome() + " " + showdevpleno.getSobreNome());
					System.out.println("\nSalário: " + showdevpleno.getSalario());

					if (showdevpleno.getEndereço() != null)
						System.out.println("\nEndereço: " + showdevpleno.getEndereço());

					if (showdevpleno.getTel() != null)
						System.out.println("\nTelefone: " + showdevpleno.getTel());

					if (showdevpleno.getCel() != null)
						System.out.println("\nCelular: " + showdevpleno.getCel());

					if (showdevpleno.getSenha() != null)
						System.out.println("\nSenha: " + showdevpleno.getSenha());

					if (showdevpleno.getSetor() != null)
						System.out.println("\nSetor: " + showdevpleno.getSetor());

					if (showdevpleno.getEquipe() != null)
						System.out.println("\nEquipe: " + showdevpleno.getEquipe());

					if (showdevpleno.getDependentes() != null)
						System.out.println("\nDependentes: " + showdevpleno.getDependentes());
				}
			}
			if (!db.devjrList.isEmpty()) {
				System.out.println("-------------------------------------\nDevs Júniores: ");
				while (devjritr.hasNext()) {
					DevJr showdevjr = (DevJr) devjritr.next();
					System.out.println("-------------------------------------");
					System.out.println("Nome: " + showdevjr.getNome() + " " + showdevjr.getSobreNome());
					System.out.println("\nSalário: " + showdevjr.getSalario());
					if (showdevjr.getEndereço() != null)
						System.out.println("\nEndereço: " + showdevjr.getEndereço());
					if (showdevjr.getTel() != null)
						System.out.println("\nTelefone: " + showdevjr.getTel());
					if (showdevjr.getCel() != null)
						System.out.println("\nCelular: " + showdevjr.getCel());
					if (showdevjr.getSenha() != null)
						System.out.println("\nSenha: " + showdevjr.getSenha());

					if (showdevjr.getSetor() != null)
						System.out.println("\nSetor: " + showdevjr.getSetor());

					if (showdevjr.getEquipe() != null)
						System.out.println("\nEquipe: " + showdevjr.getEquipe());

					if (showdevjr.getDependentes() != null)
						System.out.println("\nDependentes: " + showdevjr.getDependentes());
				}
			}
			break;
		case "9":

			this.menuinicial();
		default:
			System.out.println("\nVALOR DIGITADO É INVÁLIDO!!\nTENTE NOVAMENTE\n");
			this.painellistar();
			this.menulistar();
		}
	}
	public void menubuscar() {
		String menubuscar = scan.nextLine();
		switch (menubuscar) {

		case "1":

			System.out.println("Nome do Gerente a ser buscado: ");
			String gerentenome = scan.nextLine();

			for (int i = 0; i < db.gerenteList.size(); i++) {
				if (db.gerenteList.get(i).getNome().equals(gerentenome)) {
					System.out.println("-------------------------------------\nDados: ");
					System.out.println("-------------------------------------");
					System.out.println("Nome: " + db.gerenteList.get(i).getNome() + " " + db.gerenteList.get(i).getSobreNome());
					System.out.println("\nSalário: " + db.gerenteList.get(i).getSalario());
					if (db.gerenteList.get(i).getEndereço() != null)
						System.out.println("\nEndereço: " + db.gerenteList.get(i).getEndereço());
					if (db.gerenteList.get(i).getTel() != null)
						System.out.println("\nTelefone: " + db.gerenteList.get(i).getTel());
					if (db.gerenteList.get(i).getCel() != null)
						System.out.println("\nCelular: " + db.gerenteList.get(i).getCel());
					if (db.gerenteList.get(i).getSenha() != null)
						System.out.println("\nSenha: " + db.gerenteList.get(i).getSenha());
					if (db.gerenteList.get(i).getDependentes() != null)
						System.out.println("\nDependentes: " + db.gerenteList.get(i).getDependentes());
				}
			}
			break;

		case "2":

			System.out.println("Nome do Supervisor a ser buscado: ");
			String supervisornome = scan.nextLine();

			for (int i = 0; i < db.supervisorList.size(); i++) {
				if (db.supervisorList.get(i).getNome().equals(supervisornome)) {
					System.out.println("-------------------------------------\nDados: ");
					System.out.println("-------------------------------------");
					System.out.println("Nome: " + db.supervisorList.get(i).getNome() + " " + db.supervisorList.get(i).getSobreNome());
					System.out.println("\nSalário: " + db.supervisorList.get(i).getSalario());
					if (db.supervisorList.get(i).getEndereço() != null)
						System.out.println("\nEndereço: " + db.supervisorList.get(i).getEndereço());
					if (db.supervisorList.get(i).getTel() != null)
						System.out.println("\nTelefone: " + db.supervisorList.get(i).getTel());
					if (db.supervisorList.get(i).getCel() != null)
						System.out.println("\nCelular: " + db.supervisorList.get(i).getCel());
					if (db.supervisorList.get(i).getSenha() != null)
						System.out.println("\nSenha: " + db.supervisorList.get(i).getSenha());

					if (db.supervisorList.get(i).getSetor() != null)
						System.out.println("\nSetor: " + db.supervisorList.get(i).getSetor());
					if (db.supervisorList.get(i).getEquipe() != null)
						System.out.println("\nEquipe: " + db.supervisorList.get(i).getEquipe());

					if (db.supervisorList.get(i).getDependentes() != null)
						System.out.println("\nDependentes: " + db.supervisorList.get(i).getDependentes());
				}
			}
			break;

		case "3":

			System.out.println("Nome do Dev Pleno a ser buscado: ");
			String devplenonome = scan.nextLine();

			for (int i = 0; i < db.devplenoList.size(); i++) {
				if (db.devplenoList.get(i).getNome().equals(devplenonome)) {
					System.out.println("-------------------------------------\nDados: ");
					System.out.println("Nome: " + db.devplenoList.get(i).getNome() + " " + db.devplenoList.get(i).getSobreNome());
					System.out.println("\nSalário: " + db.devplenoList.get(i).getSalario());
					if (db.devplenoList.get(i).getEndereço() != null)
						System.out.println("\nEndereço: " + db.devplenoList.get(i).getEndereço());
					if (db.devplenoList.get(i).getTel() != null)
						System.out.println("\nTelefone: " + db.devplenoList.get(i).getTel());
					if (db.devplenoList.get(i).getCel() != null)
						System.out.println("\nCelular: " + db.devplenoList.get(i).getCel());
					if (db.devplenoList.get(i).getSenha() != null)
						System.out.println("\nSenha: " + db.devplenoList.get(i).getSenha());

					if (db.devplenoList.get(i).getSetor() != null)
						System.out.println("\nSetor: " + db.devplenoList.get(i).getSetor());
					if (db.devplenoList.get(i).getEquipe() != null)
						System.out.println("\nEquipe: " + db.devplenoList.get(i).getEquipe());

					if (db.devplenoList.get(i).getDependentes() != null)
						System.out.println("\nDependentes: " + db.devplenoList.get(i).getDependentes());
				}
			}
			break;

		case "4":
			System.out.println("Nome do Dev Júnior a ser buscado: ");
			String devjrnome = scan.nextLine();

			for (int i = 0; i < db.devjrList.size(); i++) {
				if (db.devjrList.get(i).getNome().equals(devjrnome)) {
					System.out.println("-------------------------------------\nDados: ");
					System.out.println("Nome: " + db.devjrList.get(i).getNome() + " " + db.devjrList.get(i).getSobreNome());
					System.out.println("\nSalário: " + db.devjrList.get(i).getSalario());
					if (db.devjrList.get(i).getEndereço() != null)
						System.out.println("\nEndereço: " + db.devjrList.get(i).getEndereço());
					if (db.devjrList.get(i).getTel() != null)
						System.out.println("\nTelefone: " + db.devjrList.get(i).getTel());
					if (db.devjrList.get(i).getCel() != null)
						System.out.println("\nCelular: " + db.devjrList.get(i).getCel());
					if (db.devjrList.get(i).getSenha() != null)
						System.out.println("\nSenha: " + db.devjrList.get(i).getSenha());

					if (db.devjrList.get(i).getSetor() != null)
						System.out.println("\nSetor: " + db.devjrList.get(i).getSetor());
					if (db.devjrList.get(i).getEquipe() != null)
						System.out.println("\nEquipe: " + db.devjrList.get(i).getEquipe());

					if (db.devjrList.get(i).getDependentes() != null)
						System.out.println("\nDependentes: " + db.devjrList.get(i).getDependentes());
				}
			}
			break;

		case "9":
			this.menuinicial();
		default:
			System.out.println("\nVALOR DIGITADO É INVÁLIDO!!\nTENTE NOVAMENTE\n");
			this.painelbuscar();
			this.menubuscar();
		}
	}
}