package testastring;

/**
 *  23-03-2021
 * @author Mateus
 */
import javax.swing.JOptionPane;
public class TestaString {
    
    public static void main(String[] args) {
        String numero_voo, peso_bagagem, titulo, msg;        
        float peso = 0, temp = 0;
        int i;
        
        //numero_voo = "";
        
        do{
            numero_voo = JOptionPane.showInputDialog(null, "Entre com o número do Vôo:   ", "Airport Program", JOptionPane.INFORMATION_MESSAGE);
            if ((numero_voo == null) || ("".equals(numero_voo))){
                JOptionPane.showMessageDialog(null, "O número do vôo é obrigatório!");
            }
        }while(((numero_voo == null) || ("".equals(numero_voo))));  
        
        
        for (i = 1; i <= 4; i++){
            msg = "Entre com o peso da bagagem (" + i + ")";
            titulo = "Luggage weight(" +  i  +  ")";
            peso_bagagem = JOptionPane.showInputDialog(null, msg , titulo, JOptionPane.PLAIN_MESSAGE);
            if (peso_bagagem == null){
                JOptionPane.showMessageDialog(null, "O item peso é obrigatório!");
                i = i - 1;
                continue;
            }
            if ("".equals(peso_bagagem)){
                JOptionPane.showMessageDialog(null, "Assumindo como valor 0");
            }
            //System.out.println("peso da bagagem é:" + peso_bagagem); DEBUG
            for (int j = 0; j < peso_bagagem.length(); j++) {
                if (Character.isAlphabetic(peso_bagagem.charAt(j))==true)
                {
                    JOptionPane.showInputDialog(null, "Digite apenas valores numéricos!" ,"Não digite caracteres literários!",  JOptionPane.QUESTION_MESSAGE);
                    i = i - 1;
                    break;
                }else{
                    temp = Float.parseFloat(peso_bagagem);
                    if (temp < 0){
                        JOptionPane.showInputDialog(null, "Sua bagagem não pode ter peso negativo!" ,"Digite um peso válido:",  JOptionPane.QUESTION_MESSAGE);
                        temp = 0;
                        i = i - 1;
                        break;
                    }
                    //System.out.println("Valor de temp: " + temp); DEBUG
                } 
            }                
        peso = peso + temp; 
        //System.out.println("valor final: " + peso); DEBUG
        
        }
        
        titulo = "Vôo nº " + numero_voo;
        msg = "O peso total em bagagens na aeronave é: " + peso + " kg\nA média é de " + peso/4 + "kg";
            
        JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
}
