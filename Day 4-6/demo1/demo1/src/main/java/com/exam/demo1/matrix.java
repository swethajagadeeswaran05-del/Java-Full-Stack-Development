package com.exam.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class matrix {

    @GetMapping("/rotate/{choice}")
    public String rotateMatrix(@PathVariable int choice) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = matrix.length;
        int[][] result = new int[n][n];

        switch (choice) {

            case 1: // 90° Clockwise
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        result[j][n - 1 - i] = matrix[i][j];
                    }
                }
                break;

            case 2: // 90° Anti-Clockwise
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        result[n - 1 - j][i] = matrix[i][j];
                    }
                }
                break;

            case 3: // 180° Clockwise
            case 4: // 180° Anti-Clockwise
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        result[n - 1 - i][n - 1 - j] = matrix[i][j];
                    }
                }
                break;

            default:
                return "Invalid Choice! Use 1, 2, 3, or 4.";
        }

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                output.append(result[i][j]).append(" ");
            }
            output.append("<br>");
        }

        return output.toString();
    }
}