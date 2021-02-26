public static void main(String[] args) {
        
        int n = 6; // tamanho do vetor
        int numeros[] = new int[n];
        int h;
        Scanner scanner = new Scanner(System.in);
        
        for(h=0;h<6;h++) {
            System.out.println("Digite um numero");
            numeros[h] = scanner.nextInt();
        }
        
        
          for (int i = numeros.length; i >= 1; i--) {
                for (int j = 1; j < i; j++) {
                    if (numeros[j - 1] < numeros[j]) {
                        int aux = numeros[j];
                        numeros[j] = numeros[j - 1];
                        numeros[j - 1] = aux;
                    }
                }
            }
          
          
          for(h=0;h<6;h++) {
                System.out.println(numeros[h]);    
            }
          
        
        scanner.close();
        
