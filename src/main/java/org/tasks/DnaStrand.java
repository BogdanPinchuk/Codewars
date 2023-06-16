package org.tasks;

import java.util.stream.Collectors;

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
        return dna.chars()
                .mapToObj(val -> {
                    switch (val) {
                        case 'A' -> { return "T"; }
                        case 'T' -> { return "A"; }
                        case 'C' -> { return "G"; }
                        case 'G' -> { return "C"; }
                    }
                    return null;
                })
                .collect(Collectors.joining(""));
        // 2 realization
//        dna.replace('A', 't')
//                .replace('T', 'a')
//                .replace('G', 'c')
//                .replace('C', 'g')
//                .toUpperCase();
    }
}
