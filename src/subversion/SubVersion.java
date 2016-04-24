/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subversion;

import java.util.Arrays;

/**
 *
 * @author Jose
 */
public class SubVersion {

    /**
     * @param args the command line arguments
     */

	//Comentari modificat ara diumenge 
	//nou comentari
    public static void main(String[] args) {
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10);

        }
        System.out.println("Array" + Arrays.toString(nums));
        int menor = nums[0];
	int mayor = nums[0];
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] < menor) {
                menor = nums[j];
            }
		else if(nums[j]> mayor){
		mayor = nums[j];
		}
        }

        System.out.println("El numero mes petit és " + menor);
	System.out.println("El numero mes gran és " + mayor);
    }
}
