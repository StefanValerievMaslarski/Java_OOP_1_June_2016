package Matrixes;


import com.sun.deploy.panel.ITreeNode;

import java.util.Arrays;
import java.util.Scanner;

public class pr015 {
    static Integer[][] matrix;
    static int matrixRows;
    static int matrixCols;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        int matrixRows = Integer.parseInt(input[0]);
        int matrixCols = Integer.parseInt(input[1]);
        Integer[][] matrix = new Integer[matrixRows][matrixCols];
        int filler = 1;


        for (int r = 0; r < matrixRows; r++) {
            for (int c = 0; c < matrixCols; c++) {
                matrix[r][c] = filler;
                filler++;
            }
        }

        Integer command = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < command; i++) {
            String[] inputCommands = sc.nextLine().split("\\s+");
            int whatToShift = Integer.parseInt(inputCommands[1]);
            String commandToDo = inputCommands[1];
            String NumbersToShift = inputCommands[2];

            if (commandToDo.equals("up")){
                shiftUp();

            } else if (commandToDo.equals("down")){
                shiftDown();


            } else if (commandToDo.equals("left")){
                shiftLeft();

            }
            else if (commandToDo.equals("right")){
                shiftRight();

            }

        }

        printMatrix(matrix, matrixRows, matrixCols);
    }

    public static void printMatrix(Integer[][] matrix, int matrixRows, int matrixCols) {
        for (int r = 0; r < matrixRows; r++) {
            for (int c = 0; c < matrixCols; c++) {
                System.out.printf(matrix[r][c] + " ");
            }

            System.out.print("\n");
        }
    }


    // up
    public static void shiftUp(){


    }



    // down
    public static void shiftDown(){


    }



    // left
    public static void shiftLeft(){


    }



    // right
    public static void shiftRight(){


    }




}
