package mes_switch;

/**
 * 13/03/2021
 * @author Mateus
 */
import javax.swing.JOptionPane;
public class Mes_switch {

    public static void main(String[] args) {
        int mes;
        String opt;
        
        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com um número para indicar o mês [ 1 - 12 ]","Switch Case",JOptionPane.QUESTION_MESSAGE));
        
        switch(mes){
            case 1:
                opt = "Janeiro";
                break;
            case 2:
                opt = "Fevereiro";
                break;
            case 3:
                opt = "Março";
                break;
            case 4:
                opt = "Abril";
                break;
            case 5:
                opt = "Maio";
                break;
            case 6:
                opt = "Junho";
                break;
            case 7:
                opt = "Julho";
                break;
            case 8:
                opt = "Agosto";
                break;
            case 9:
                opt = "Setembro";
                break;
            case 10:
                opt = "Outubro";
                break;
            case 11:
                opt = "Novembro";
                break;
            case 12:
                opt = "Dezembro";
                break;
            default:
                opt = "Mês inválido!";               
           
        }
        if ("Mês inválido!".equals(opt)){
            JOptionPane.showMessageDialog(null, opt , "switch case - Valor default", JOptionPane.INFORMATION_MESSAGE );
        }else{
            JOptionPane.showMessageDialog(null, "O mês escolhido foi:  " + opt,  "Usando o switch case", JOptionPane.INFORMATION_MESSAGE );
        }
        
    }
    
}
