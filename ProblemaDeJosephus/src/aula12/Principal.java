//	Atividade 1) Problema de Josephus.  Imagine uma roda de 20 pessoas numeradas de 1 a 20 no sentido horário.
//	Cada pessoa possui nome, telefone, endereço e CPF. Começando com a pessoa de número 1, percorra a roda no 
//	sentido horário e elimine cada m-ésima pessoa escolhida aleatoriamente enquanto a roda tiver uma ou mais
//	pessoas. Qual o número é a pessoa sobrevivente que ainda está na lista? 

package aula12;

public class Principal {

	public static void main(String[] args) {

		ListaLigada lista = new ListaLigada();

		Pessoa p1 = new Pessoa("Lucas", "(11) 1234-5678", "Rua Augusta, 123", "111.222.333-44", 1);
		Pessoa p2 = new Pessoa("Ana", "(21) 9876-5432", "Avenida Brasil, 456", "222.333.444-55", 2);
		Pessoa p3 = new Pessoa("Marcos", "(19) 98765-4321", "Rua São Paulo, 789", "333.444.555-66", 3);
		Pessoa p4 = new Pessoa("Camila", "(31) 1234-5678", "Avenida Copacabana, 101", "444.555.666-77", 4);
		Pessoa p5 = new Pessoa("Gustavo", "(85) 9876-5432", "Rua da Paz, 1111", "555.666.777-88", 5);
		Pessoa p6 = new Pessoa("Carla", "(27) 98765-4321", "Rua dos Girassóis, 222", "666.777.888-99", 6);
		Pessoa p7 = new Pessoa("Rafael", "(71) 1234-5678", "Avenida Paulista, 333", "777.888.999-00", 7);
		Pessoa p8 = new Pessoa("Julia", "(84) 9876-5432", "Rua das Flores, 444", "888.999.000-11", 8);
		Pessoa p9 = new Pessoa("Pedro", "(61) 98765-4321", "Avenida Ipiranga, 555", "999.000.111-22", 9);
		Pessoa p10 = new Pessoa("Mariana", "(48) 1234-5678", "Rua do Sol, 666", "000.111.222-33", 10);
		Pessoa p11 = new Pessoa("Tiago", "(65) 9876-5432", "Avenida Rio Branco, 777", "111.222.333-44", 11);
		Pessoa p12 = new Pessoa("Fernanda", "(98) 98765-4321", "Rua das Árvores, 888", "222.333.444-55", 12);
		Pessoa p13 = new Pessoa("Rodrigo", "(92) 1234-5678", "Avenida das Nações, 999", "333.444.555-66", 13);
		Pessoa p14 = new Pessoa("Isabela", "(51) 9876-5432", "Rua das Pedras, 1010", "444.555.666-77", 14);
		Pessoa p15 = new Pessoa("Vinícius", "(95) 98765-4321", "Avenida das Flores, 1111", "555.666.777-88", 15);
		Pessoa p16 = new Pessoa("Márcia", "(68) 1234-5678", "Rua dos Passarinhos, 1212", "666.777.888-99", 16);
		Pessoa p17 = new Pessoa("Leonardo", "(79) 9876-5432", "Avenida dos Andradas, 1313", "777.888.999-00", 17);
		Pessoa p18 = new Pessoa("Thaís", "(98) 98765-4321", "Rua dos Coqueiros, 1414", "888.999.000-11", 18);
		Pessoa p19 = new Pessoa("Kaysson", "(64) 992111111", "Jardim América, rua 3, n 666", "000.111.222-12", 19);
		Pessoa p20 = new Pessoa("João Silva", "9999-9999", "Rua das Flores, 123", "123.456.789-00", 20);

		lista.p.add(p1);
		lista.p.add(p2);
		lista.p.add(p3);
		lista.p.add(p4);
		lista.p.add(p5);
		lista.p.add(p6);
		lista.p.add(p7);
		lista.p.add(p8);
		lista.p.add(p9);
		lista.p.add(p10);
		lista.p.add(p11);
		lista.p.add(p12);
		lista.p.add(p13);
		lista.p.add(p14);
		lista.p.add(p15);
		lista.p.add(p16);
		lista.p.add(p17);
		lista.p.add(p18);
		lista.p.add(p19);
		lista.p.add(p20);

		lista.Josephus();

	}

}
