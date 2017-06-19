package hanhan.I;

import java.util.List;
import hanhan.entity.orderEntity.AddRuCanFengZhuangNeiCeng;
import hanhan.entity.orderEntity.AddRuCanFengZhuangWaiCeng;

public interface OrderI {
	public String add(List<AddRuCanFengZhuangNeiCeng>addRuCanFengZhuangNeiCengList,AddRuCanFengZhuangWaiCeng addRuCanFengZhuangWaiCeng);
}
