package org.example;

public class Cliente implements Cloneable{
        private int matricula;
        private String nome;
        private Endereco endereco;
        private String localNascimento;

        public Cliente(int matricula, String nome, Endereco endereco, String localNascimento) {
            this.matricula = matricula;
            this.nome = nome;
            this.endereco = endereco;
            this.localNascimento = localNascimento;
        }

        public int getMatricula() {
            return matricula;
        }

        public void setMatricula(int matricula) {
            this.matricula = matricula;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Endereco getEndereco() {
            return endereco;
        }

        public void setEndereco(Endereco endereco) {
            this.endereco = endereco;
        }

        public String getLocalNascimento() {
            return localNascimento;
        }

        public void setLocalNascimento(String localNascimento) {
            this.localNascimento = localNascimento;
        }

        @Override
        public Cliente clone() throws CloneNotSupportedException {
            Cliente clienteClone = (Cliente) super.clone();
            clienteClone.endereco = (Endereco) clienteClone.endereco.clone();
            return clienteClone;
        }

        @Override
        public String toString() {
            return "Cliente{" +
                    "matricula=" + matricula +
                    ", nome='" + nome + '\'' +
                    ", endereco=" + endereco +
                    ", localNascimento='" + localNascimento + '\'' +
                    '}';
        }
}