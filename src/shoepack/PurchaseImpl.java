package shoepack;

import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class PurchaseImpl extends DelegatingIntroductionInterceptor
implements Purchase{
@Override
public void buyShoe() {
	System.out.println("buy shoe method called....");
}
}
