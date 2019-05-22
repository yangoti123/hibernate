package in.javahome.orm;

import in.javahome.orm.entity.Product;
import in.javahome.orm.entity.ProductPk;

import org.hibernate.Session;

public class CompositPkFetch {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		ProductPk pk = new ProductPk();
		pk.setCustomerId(1);
		pk.setProductId(2);
		
		Product p = (Product) session.get(Product.class, pk);
		System.out.println(p.getProductName());
		System.out.println(p.getCost());
		System.out.println(p.getPk().getCustomerId());
		System.out.println(p.getPk().getProductId());
		session.close();
	}
}
