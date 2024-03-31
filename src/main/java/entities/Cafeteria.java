/*
 * Copyright (C) 2024 Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package entities;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 31/03/2024
 * @brief Class Cafeteria
 */

public class Cafeteria {

    private final double precoLatte = 3.5;
    private final double precoCapuccino = 4.0;
    private final double precoCafeComLeite = 2.5;
    private int qtdLatte = 0;
    private int qtdCapuccino = 0;
    private int qtdCafeComLeite = 0;

    public void adicionarLatte() {
        qtdLatte++;
        System.out.println("Latte adicionado. Preço: R$ " + String.format("%.2f", precoLatte));
    }

    public void adicionarCapuccino() {
        qtdCapuccino++;
        System.out.println("Capuccino adicionado. Preço: R$ " + String.format("%.2f", precoCapuccino));
    }

    public void adicionarCafeComLeite() {
        qtdCafeComLeite++;
        System.out.println("Café com Leite adicionado. Preço: R$ " + String.format("%.2f", precoCafeComLeite));
    }

    public void realizarPagamentoParcial() {
        System.out.println("Pagamento parcial realizado: R$ " + String.format("%.2f", totalDaConta()));
        // Zerar as quantidades após o pagamento parcial
        qtdLatte = 0;
        qtdCapuccino = 0;
        qtdCafeComLeite = 0;
    }

    public void realizarPagamentoTotal() {
        System.out.println("Resumo do pedido:");
        System.out.println("Latte: " + qtdLatte + " x R$ " + String.format("%.2f", precoLatte) + " = R$ " + String.format("%.2f", subtotalLatte()));
        System.out.println("Capuccino: " + qtdCapuccino + " x R$ " + String.format("%.2f", precoCapuccino) + " = R$ " + String.format("%.2f", subtotalCapuccino()));
        System.out.println("Café com Leite: " + qtdCafeComLeite + " x R$ " + String.format("%.2f", precoCafeComLeite) + " = R$ " + String.format("%.2f", subtotalCafeComLeite()));
        System.out.println("Total a pagar: R$ " + String.format("%.2f", totalDaConta()));
        System.out.println("Pagamento total realizado. Volte Sempre!");

        // Zerar as quantidades após o pagamento total
        qtdLatte = 0;
        qtdCapuccino = 0;
        qtdCafeComLeite = 0;
    }

    private double subtotalLatte() {
        return qtdLatte * precoLatte;
    }

    private double subtotalCapuccino() {
        return qtdCapuccino * precoCapuccino;
    }

    private double subtotalCafeComLeite() {
        return qtdCafeComLeite * precoCafeComLeite;
    }

    private double totalDaConta() {
        return subtotalLatte() + subtotalCapuccino() + subtotalCafeComLeite();
    }
}




