package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Cliente cliente = new Cliente(123, "Cliente Original", new Endereco("Rua A", 1), "Juiz de Fora");

        Cliente clienteClone = cliente.clone();
        clienteClone.setMatricula(456);
        clienteClone.setNome("Cliente Clonado");
        clienteClone.getEndereco().setNumero(2);

        assertEquals("Cliente{matricula=123, nome='Cliente Original', endereco=Endereco{logradouro='Rua A', numero=1}, localNascimento='Juiz de Fora'}", cliente.toString());
        assertEquals("Cliente{matricula=456, nome='Cliente Clonado', endereco=Endereco{logradouro='Rua A', numero=2}, localNascimento='Juiz de Fora'}", clienteClone.toString());
    }
}
