package arraysReales;

import java.util.Iterator;

public class ArraysReales implements Estadisticas{
	private double[] array ;
	
	private final double MINIMO = Double.MIN_VALUE;
	private final double MAXIMO = Double.MAX_VALUE;
	
	public ArraysReales() {
		this.array = new double[5];
		for (int i = 0; i < array.length; i++) {
			array[i]=Math.random()*10;
		}
	}

	@Override
	public double minimo() {
		double num = MAXIMO;
		for (int i = 0; i < array.length; i++) {
			if(array[i]<num) {
				num = array[i];
			}
		}
		return num;
	}

	@Override
	public double maximo() {
		double num = MINIMO;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>num) {
				num = array[i];
			}
		}
		return num;
	}

	@Override
	public double sumatorio() {
		int num =0;
		for (int i = 0; i < array.length; i++) {
			num +=array[i];
		}
		return num;
	}

}
