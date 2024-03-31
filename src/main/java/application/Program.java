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
package application;

import entities.Cafeteria;
import java.util.Scanner;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 31/03/2024
 * @brief Class Program
 */

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cafeteria cafeteria = new Cafeteria();

        while (true) {
            System.out.println("Escolha uma opção: \n"
                    + "1 - Latte \n"
                    + "2 - Capuccino \n"
                    + "3 - Café com Leite \n"
                    + "4 - Finalizar e pagar");

            int opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    cafeteria.adicionarLatte();
                    break;
                case 2:
                    cafeteria.adicionarCapuccino();
                    break;
                case 3:
                    cafeteria.adicionarCafeComLeite();
                    break;
                case 4:
                    cafeteria.realizarPagamentoTotal();
                    ler.close();
                    return; // Encerra o programa após o pagamento total
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            System.out.println("Deseja realizar o pagamento agora ou continuar acumulando? \n"
                    + "1 - Pagar agora \n"
                    + "2 - Continuar acumulando");
            int pagamentoOpcao = ler.nextInt();

            if (pagamentoOpcao == 1) {
                cafeteria.realizarPagamentoParcial();
            }
        }
    }
}
