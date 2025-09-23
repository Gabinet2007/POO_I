package lista07;

public class PessoaMain {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Gabriel", "Bela Alianca");
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica("Gabriel", "Bela Alianca");
		pf.setCpf("119.848.959-66");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica("Gabriel", "Bela Alianca");
		pj.setCnpj("12.345.678/0001-95");
		System.out.println(pj);
	}
}
