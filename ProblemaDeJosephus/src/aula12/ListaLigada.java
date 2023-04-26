package aula12;

import java.util.LinkedList;
import java.util.Random;

public class ListaLigada {
	Random rand = new Random();
	LinkedList<Pessoa> p = new LinkedList<Pessoa>();

	public void Josephus() {
		for (int i = 0; i < p.size(); i++) {
			while (p.size() > 1) {
				int num = rand.nextInt(100) + 1;
				int posicaoParaRemover;
				if (num < p.size()) {
					posicaoParaRemover = num;
					p.remove(posicaoParaRemover);
				} else if (num == p.size()) {
					posicaoParaRemover = num;
					p.removeLast();
				} else {
					posicaoParaRemover = num % p.size();
					p.remove(posicaoParaRemover);
				}
			}
		}

		System.out.println(p.getFirst());

	}

	@Override
	public String toString() {
		return super.toString();
	}

}
