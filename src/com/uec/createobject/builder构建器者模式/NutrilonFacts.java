package com.uec.createobject.builder构建器者模式;

public class NutrilonFacts {

	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;
	
	public static class Builder{
		private final int servingSize ;
		private final int servings;
		private  int calories = 0;
		private  int fat = 0;
		private  int sodium = 0;
		private  int carbohydrate = 0;
		public Builder(int servingSize, int servings) {
			super();
			this.servingSize = servingSize;
			this.servings = servings;
		}
		public Builder setCalories(int val){
			this.calories = val;
			return this;
		}
		public Builder setFat(int val){
			fat = val;
			return this;
		}
		public Builder setSodium(int val){
			sodium = val;
			return this;
		}
		public Builder setCarbohydrate(int val){
			carbohydrate = val;
			return this;
		}
		public NutrilonFacts build(){
			return new NutrilonFacts(this);
		}
	}
	private NutrilonFacts(Builder builder){
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}
}
