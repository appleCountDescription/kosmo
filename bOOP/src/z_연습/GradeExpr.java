package z_연습;

import java.util.Arrays;

public class GradeExpr {
	
	private int[] jumsu;
	
	public GradeExpr(int[] jumsu) {		// 기본생성자 함수 하나 만들어 주는 습관 기르자!
		this.jumsu = jumsu;
	}
	
	/*  *****************앞으로 이런 거 필기해 두기
	 * 	메소드명	: getTotal
	 * 	인자		: 없음
	 * 	리턴값	: int
	 * 	역할		: 배열의 총합을 반환
	 */
	public int getTotal() {
		int sum = 0;
		for(int i=0; i<jumsu.length; i++) {
			sum += jumsu[i];
		}
		return sum;
	}
	
	/*
	 *   메소드명	: getAverage
	 * 	인자		: 없음
	 * 	리턴값	: double
	 * 	역할		: 배열의 평균을 반환
	 */
	public double getAverage() {
		return (double)getTotal()/jumsu.length;
	}
	
	/*
	 *  메소드명	: getGoodScore
	 * 	인자		: 없음
	 * 	리턴값	: int
	 * 	역할		: 배열 중 최대값을 반환
	 */
	public int getGoodScore() {
		for(int i=0; i<jumsu.length; i++) {
			for(int j=0; j<jumsu.length; j++) {
				if(i != j & jumsu[i] > jumsu[j]) {
					int changeJumsu;
					changeJumsu = jumsu[j];
					jumsu[j] = jumsu[i];
					jumsu[i] = changeJumsu;
				}
			}
		}
		return jumsu[0];
	}
	
	/*
	 *  메소드명	: getBadScore
	 * 	인자		: 없음
	 * 	리턴값	: int
	 * 	역할		: 배열 중 최소값을 반환
	 */
	public int getBadScore() {
		for(int i=0; i<jumsu.length ; i++) {
			for(int j=0; j<jumsu.length; j++) {
				if(i != j & jumsu[i] < jumsu[j]) {
					int changeJumsu;
					changeJumsu = jumsu[j];
					jumsu[j] = jumsu[i];
					jumsu[i] = changeJumsu;
				}
			}
		}
		return jumsu[0];
	}


	public String toString() {
		return Arrays.toString(jumsu);
	}

}

	
