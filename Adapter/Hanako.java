//これは委譲を利用したAdapterパターン
public class Hanako implements Chairperson{
	Taro taro;
	Hanako(){
		taro = new Taro();
	}

	@Override
	public void organizeClass(){
		taro.enjoyWithAllClassmate();
	}

}
