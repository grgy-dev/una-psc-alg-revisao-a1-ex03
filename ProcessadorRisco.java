public class ProcessadorRisco {
    
    
    public static void main(String[] args) {
 

        int[] notasRisco = {85, 92, 18, 40, 75, 33, 60, 10, 95, 70, 20, 45, 88, 15, 100};

        double somaPonderada = 0;
        int somaPesos = 0;

        for (int i=0; i < notasRisco.length; i++){
            int peso;
            if (i < 4){
                peso = 3;
            } else{
                peso = 1;
            }
            somaPonderada += notasRisco[i] * peso;
            somaPesos += peso;
        }
        double mediaPonderada = somaPonderada / somaPesos;
        //
        int otimistas = 0;
        int alarmantes = 0;

        for(int nota : notasRisco){
            if (nota <= 20){
                otimistas++;
            }else if(nota >= 90){
                alarmantes++;
            }    
        }
        System.out.println("===== ANÁLISE DE RISCO ECONÔMICO =====");
        System.out.println("Notas de Risco: ");
        for (int n : notasRisco) {
            System.out.print(n + " ");
        }
        System.out.println("\n--------------------------------------");
        System.out.println("Média Ponderada do Risco: " + String.format("%.2f", mediaPonderada));
        System.out.println("Analistas Otimistas (nota ≤ 20): " + otimistas);
        System.out.println("Analistas Alarmantes (nota ≥ 90): " + alarmantes);
        System.out.println("--------------------------------------");

        if (mediaPonderada > 70) {
            System.out.println("Parecer Final: Alto Risco → Venda ou reajuste de portfólio recomendado.");
        } else if (mediaPonderada >= 40 && mediaPonderada <= 70) {
            System.out.println("Parecer Final: Risco Moderado → Acompanhar de perto, mas manter os ativos.");
        } else {
            System.out.println("Parecer Final: Baixo Risco → Excelente momento para capitalização.");
        }       
    }
}
