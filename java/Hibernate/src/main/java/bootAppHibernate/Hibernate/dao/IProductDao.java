package bootAppHibernate.Hibernate.dao;

import java.util.List;

import bootAppHibernate.Hibernate.entity.Product;


public interface IProductDao {

	List<Product> findAll();
	Product findById(Integer id);
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Integer id);
}
