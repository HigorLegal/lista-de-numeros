package NanbersV2;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Numerus {

    public ArrayList<Integer> numeros = new ArrayList<Integer>();

    public void adi(int num) {
        numeros.add(num);
        JOptionPane.showMessageDialog(null, "numero adicionado com sucesso ");
    }

    public void editar(int indice, int editar) {
        indice = indice - 1;
        if (indice <= numeros.size()) {
            numeros.set(indice, editar);
            JOptionPane.showMessageDialog(null, "Número da "
                    + (indice + 1) + "º posição, alterado com sucesso:");
        } else {
            JOptionPane.showMessageDialog(null, "Número da "
                    + (indice + 1) + "º posição não existe");
        }
    }

    public void excluir(int indice) {
        indice = indice - 1;
        if (indice <= numeros.size()) {
            numeros.remove(indice);
            JOptionPane.showMessageDialog(null, "Número da "
                    + (indice + 1) + "º posição, apagado com sucesso:");
        } else {
            JOptionPane.showMessageDialog(null, "Número da "
                    + (indice + 1) + "º posição, apagado com sucesso:");
        }
    }

    public String buscar(int num) {

        String nsei = "Não existe este número na lista";

        for (int l = 0; l < numeros.size(); l++) {
            if (num == numeros.get(l)) {
                nsei = "Este número esta na posição " + (l + 1);
            }
        }
        return nsei;
    }

    public String listar() {
        String list = "Lista de todos os numeros\n\n";
        if (!numeros.isEmpty()) {
            for (int i = 0; i < numeros.size(); i++) {
                list += (i + 1) + "° " + numeros.get(i) + "\n";
            }
        } else {
            list = "Está vazio";
        }
        return list;
    }

    public String listarPar() {
        String list = "Lista de todos os numeros pares\n\n";
        if (!numeros.isEmpty()) {

            for (int i = 0; i < numeros.size(); i++) {
                if (numeros.get(i) % 2 == 0) {
                    list += numeros.get(i) + "\n";
                }
            }

        } else {
            list = "Não tem pares";
        }

        return list;
    }

    public String listarImpar() {
        String list = "Lista de todos os numeros impares\n\n";
        if (!numeros.isEmpty()) {
            for (int i = 0; i < numeros.size(); i++) {
                if (numeros.get(i) % 2 != 0) {
                    list += numeros.get(i) + "\n";
                }
            }

        } else {
            list = "Não tem impares";
        }

        return list;
    }

    public void exibirMedia() {
        int med = 0;

        for (int l = 0; l < numeros.size(); l++) {
            med += numeros.get(l);

        }
        med = med / numeros.size();
        JOptionPane.showMessageDialog(null, "A média é de " + med);
    }

    public void exibirMaiorMenor() {
        int maior = numeros.get(0);
        int menor = numeros.get(0);

        for (int l = 0; l < numeros.size(); l++) {

            if (maior < numeros.get(l)) {
                maior = numeros.get(l);
            }

            if (menor > numeros.get(l)) {
                menor = numeros.get(l);
            }
        }

        if (numeros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não existe número na lista");
        } else {
            JOptionPane.showMessageDialog(null, "O maior "
                    + "número é: " + maior + "\nO menor número é: " + menor);
        }
    }

    public String ordenarC() {
    
    ArrayList<Integer> numeras = new ArrayList<Integer>();
    
        for (int l = 0; l < numeros.size(); l++) {
            numeras.add(numeros.get(l));
        }
        Collections.sort(numeras);
        String list = "Lista de todos os numeros\n\n";

        for (int l = 0; l < numeras.size(); l++) {
            list += (l + 1) + "° " + numeras.get(l) + "\n";
        }
        return list;
    }

    public String ordenarD() {
        
    ArrayList<Integer> numeras = new ArrayList<Integer>();
        
        for (int l = 0; l < numeros.size(); l++) {
            numeras.add(l, numeros.get(l));
        }

        Collections.sort(numeras, Collections.reverseOrder());
        String list = "Lista de todos os numeros\n\n";

        for (int l = 0; l < numeras.size(); l++) {
            list += (l + 1) + "° " + numeras.get(l) + "\n";
        }
        return list;
    }
}
