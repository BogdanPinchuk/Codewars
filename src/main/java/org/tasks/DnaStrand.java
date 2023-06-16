package org.tasks;

public class DnaStrand {
    public static String makeComplement(String dna) {
//        StringBuilder builder = new StringBuilder();
//        byte[] array = dna.getBytes();
//
//        for (byte b : array) {
//            switch (b) {
//                case 'A' -> builder.append('T');
//                case 'T' -> builder.append('A');
//                case 'C' -> builder.append('G');
//                case 'G' -> builder.append('C');
//            }
//        }
//        return builder.toString();

        // 1 realization
//        return dna.chars()
//                .mapToObj(val -> {
//                    switch (val) {
//                        case 'A' -> { return "T"; }
//                        case 'T' -> { return "A"; }
//                        case 'C' -> { return "G"; }
//                        case 'G' -> { return "C"; }
//                    }
//                    return null;
//                })
//                .collect(Collectors.joining(""));
        // 2 realization
        char[] array = dna.toCharArray();
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 'A' -> array[i] = 'T';
                case 'T' -> array[i] = 'A';
                case 'C' -> array[i] = 'G';
                case 'G' -> array[i] = 'C';
            }
        }
        return String.valueOf(array);

        // 3 realization
//        dna.replace('A', 't')
//                .replace('T', 'a')
//                .replace('G', 'c')
//                .replace('C', 'g')
//                .toUpperCase();
    }
}
