package it.akademija.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DBUserDao {
// implements UserDao
//	@PersistenceContext
//	private EntityManager entityManager;
//
//	@Override
//	public List<User> getUsers() {
//		return entityManager.createQuery("SELECT u from User u", User.class).getResultList();
//	}
//
//	@Override
//	public void createUser(User user) {
//		entityManager.persist(user);
//
//	}
//
//	@Override
//	public void deleteUser(String username) {
//		User user = entityManager.createQuery("SELECT u from User u where username = :un", User.class)
//				.setParameter("un", username).getSingleResult();
//		if (entityManager.contains(user)) {
//			entityManager.remove(user);
//		} else {
//			entityManager.remove(entityManager.merge(user));
//		}
//
//	}

}
