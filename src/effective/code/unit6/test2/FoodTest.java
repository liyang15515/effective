package effective.code.unit6.test2;

import effective.code.unit6.test2.Food.Coffee;

public class FoodTest {

	public static void main(String[] args) {
		testImplementsInterface();
	}
	private static void testImplementsInterface() {
        for (Food.Dessert dessertEnum : Food.Dessert.values()) {
            System.out.print(dessertEnum + "====");
        }
        System.out.println();
        //����ط���ôд������Ϊ�����Լ����Ե�ʱ�򣬰����coffee������һ���ļ�ȥʵ���Ǹ�food�ӿڣ����������Ǹ��ӿڵ��ڲ���
        for (Coffee coffee : Coffee.values()) {
            System.out.print(coffee + "----");
        }
        System.out.println();
        //���ʵ�ֽӿڣ�����֯ö�٣��򵥽������Ƿ���ɡ��������ʹ��ö�ٵĻ�����ô�ɣ���д�����ʱ�򣬾ͺܷ����������
        //���о��Ǹ�����̬���Ĺ��ܰɣ�
        Food food = Food.Dessert.CAKE;
        System.out.println(food);
        food = Coffee.BLACK_COFFEE;
        System.out.println(food);
    }

}
