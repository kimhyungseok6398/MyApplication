import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ProductAdater extends BaseAdapter {
    //row_item을 배열을 통해서 여려개 배치

    // 상품명, 상품가격, 상품이미지, 상품 갯수
    String[] pdt_name;
    int[] pdt_price;
    int[] pdt_image;
    int[] pdt_count;
    // 어댑터 설정
    Context context;
    LayoutInflater inflater;

    // 생성자
    public ProductAdapter(Context context, String[] pdt_name, int[] pdt_price, int[] pdt_image, int[] pdt_count) {
        // 생성자를 통해서 배열의 값을 받아온다
        this.context = context;
        this.pdt_name = pdt_name;
        this.pdt_image = pdt_image;
        this.pdt_price = pdt_price;
        this.pdt_count = pdt_count;
    }

    @Override
    public int getCount() {
        // 총 갯수가 몇개냐
        return pdt_name.length;
    }
}
//각각의 아이템 보여주기
    public view geView(int i , View view, ViewGroup viewGroup){
    if (inflater == null){
        inflater = (LayoutInflater) CON
    }
    }