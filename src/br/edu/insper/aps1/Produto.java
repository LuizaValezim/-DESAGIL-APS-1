package br.edu.insper.aps1;

public class Produto {
	private int c�digo;
	private String nome;
	private double pre�o;
	
	public Produto(int c�digo, String nome, double pre�o) {
        this.c�digo = c�digo;
        this.nome = nome;
        this.pre�o = pre�o;
    }

	public int getC�digo() {
		return this.c�digo;
	}

	public String getNome() {
		return this.nome;
	}

	public double getPre�o() {
		return this.pre�o;
	}
	
}
