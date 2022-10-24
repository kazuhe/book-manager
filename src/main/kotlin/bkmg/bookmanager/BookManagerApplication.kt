package bkmg.bookmanager

import database.UserMapper
import database.selectByPrimaryKey
import org.apache.ibatis.io.Resources
import org.apache.ibatis.session.SqlSessionFactory
import org.apache.ibatis.session.SqlSessionFactoryBuilder
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookManagerApplication

//fun main(args: Array<String>) {
//	runApplication<BookManagerApplication>(*args)
//}

fun main() {
	getUserByPrimaryKey()
}

fun createSessionFactory(): SqlSessionFactory {
	val resource = "mybatis-config.xml"
	val inputStream = Resources.getResourceAsStream(resource)
	return SqlSessionFactoryBuilder().build(inputStream)
}

fun getUserByPrimaryKey() {
	createSessionFactory().openSession().use { session ->
		val mapper = session.getMapper(UserMapper::class.java)
		val user = mapper.selectByPrimaryKey(100)
		println(user)
	}
}
