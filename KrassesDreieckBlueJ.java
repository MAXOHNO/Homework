public void krassesDreieck(int length) {
        for(int i = length; i > 0; i--) {
        
            // Erstellung der Leerzeichen vor den Buchstaben
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
                if (length > 9) {
                    System.out.print(" ");
                }
            }
        
            // mD = momentaner Durchlauf (fängt bei 0 an)
            int mD = length - i;
            if (mD != 0) {
                // aDWB = anzahl Der Wiederholenden Buchstaben
                int aDWB = mD + 2 * mD;

                // Ohne diesem Code wird jede 2. Zeile ein Buchstabe zuviel ausgegeben
                for(int q = 4; q < aDWB; q++) {
                    if (q % 2 != 0) {
                        aDWB --;
                    }   
                }

    
                for(int k = 0; k < aDWB; k++) {
                    System.out.print(i);
                    if (i < 10 && length > 9) {
                        System.out.print(i);
                    }
                }
            } else {
                System.out.print(i);
                if (i < 10) {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
