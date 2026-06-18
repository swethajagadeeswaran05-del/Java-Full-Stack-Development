package com.example.frontendbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class CalcController {
    @GetMapping("/calc/add/{num1}/{num2}")
    public Map<String,Object> add(@PathVariable int num1, @PathVariable int num2){
        return Map.of("operation","addition","result",num1+num2);
    }
    @GetMapping("/calc/sin/{num}")
    public String sin(@PathVariable int num){
        Double value= Math.sin(num);
        value = Math.round(value * 100.0) / 100.0;
        return "Sin Value: "+value;
    }
    @GetMapping("/calc/cos/{num}")
    public String cos(@PathVariable int num){
        Double value= Math.cos(num);
        value = Math.round(value * 100.0) / 100.0;
        return "Cos Value: "+value;
    }
    @GetMapping("/calc/tan/{num}")
    public String tan(@PathVariable int num){
        Double value= Math.tan(num);
        value = Math.round(value * 100.0) / 100.0;
        return "Tan Value: "+value;
    }
    @GetMapping("/calc/log/{num}")
    public String log(@PathVariable double num){
        double value = Math.log10(num);
        value = Math.round(value * 100.0) / 100.0;
        return "Log Value: " + value;
    }
    @GetMapping("/calc/spiral")
    public String spiral() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        StringBuilder result = new StringBuilder();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                result.append(matrix[top][j]).append(" ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result.append(matrix[i][right]).append(" ");
            }
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.append(matrix[bottom][j]).append(" ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.append(matrix[i][left]).append(" ");
                }
                left++;
            }
        }
        return result.toString();
    }
}
