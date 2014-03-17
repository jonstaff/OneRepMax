package com.jonathonstaff.android.onerepmax.app;

//  Created by jonstaff on 3/11/14.

/**
 * Class containing various formulae for calculating an estimated one repetition maximum. These have all come from
 * http://en.wikipedia.org/wiki/One-repetition_maximum.
 */
public class OneRepMax {

	/**
	 * Calculates an estimated one rep max using the Epley Formula.
	 * 
	 * @param w
	 *            weight
	 * @param r
	 *            reps
	 * @return estimated 1RM
	 */
	public static float epley(float w, float r) {
		return w * (1 + r / 30);
	}

	/**
	 * Calculates an estimated one rep max using the Brzycki Formula.
	 * 
	 * @param w
	 *            weight
	 * @param r
	 *            reps
	 * @return estimated 1RM
	 */
	public static float brzycki(float w, float r) {
		return w * 36 / (37 - r);
	}

	/**
	 * Calculates an estimated one rep max using the Lander Formula.
	 * 
	 * @param w
	 *            weight
	 * @param r
	 *            reps
	 * @return estimated 1RM
	 */
	public static float lender(float w, float r) {
		return (float) (100 * w / (101.3 - 2.67123 * r));
	}

	/**
	 * Calculates an estimated one rep max using the Lombardi Formula.
	 * 
	 * @param w
	 *            weight
	 * @param r
	 *            reps
	 * @return estimated 1RM
	 */
	public static float lombardi(float w, float r) {
		return (float) (w * Math.pow(r, 0.1f));
	}

	/**
	 * Calculates an estimated one rep max using the Mayhew et al. Formula.
	 * 
	 * @param w
	 *            weight
	 * @param r
	 *            reps
	 * @return estimated 1RM
	 */
	public static float mayhew(float w, float r) {
		return (float) (100 * w / 52.2 + 41.9 * Math.exp(-0.055 * r));
	}

	/**
	 * Calculates an estimated one rep max using the O'Conner et al. Formula.
	 * 
	 * @param w
	 *            weight
	 * @param r
	 *            reps
	 * @return estimated 1RM
	 */
	public static float oConner(float w, float r) {
		return (float) (w * (1 + 0.025 * r));
	}

	/**
	 * Calculates an estimated one rep max using the Wathan Formula.
	 * 
	 * @param w
	 *            weight
	 * @param r
	 *            reps
	 * @return estimated 1RM
	 */
	public static float wathan(float w, float r) {
		return (float) (100 * w / (48.8 + 53.8 * Math.exp(-0.075 * r)));
	}
}