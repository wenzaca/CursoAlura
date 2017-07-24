package br.com.estudoweb.conf;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//Esta classe faz o papel do persistence.xml
//Hibernate pede que toda operação seja feita através de uma transação, mas gerenciar todas essas transações é bem trabalhoso
@EnableTransactionManagement
public class JPAConfiguration {

	// Método que cria o EntityManager usado pelo DAO
	// Nesta classe estamos criando um único médoto, que será usado pelo Spring
	// para gerar o EntityManager. Este precisa de um adapter e estamos passando
	// um que o Hibernate disponibiliza.
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		factoryBean.setJpaVendorAdapter(vendorAdapter);

		// Criamos também um DataSource que contém as configurações de banco de
		// dados.
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/aluraweb");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");

		factoryBean.setDataSource(dataSource);

		// Criamos um objeto do tipo Properties para podermos setar
		// algumas configurações, como por exemplo o dialeto usado para a
		// comunicação com o banco de dados.
		// Propriedades para uso do Hibernate, 1° setando que está sendo
		// utilizando o MySQl, 2° para poder ver o SQL gerado, 3° Habilita o
		// mapeamento do JPA para realizar atualizações automatica no banco de
		// dados
		Properties props = new Properties();
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		props.setProperty("hibernate.show_sql", "true");
		props.setProperty("hibernate.hbm2ddl.auto", "update");

		factoryBean.setJpaProperties(props);

		// Setamos também onde o EntityManager encontrará nossos Models. Feito
		// isso retornamos nossas configurações para o Spring poder utiliza-las.
		factoryBean.setPackagesToScan("br.com.estudoweb.models");

		return factoryBean;
	}

	// É o gerenciador das transações, isto é, a partir desse bean o Spring
	// fornecerá as transações para o EntityManager.
	@Bean
	public JpaTransactionManager jpaTransactionManager(EntityManagerFactory emf) {
		return new JpaTransactionManager(emf);
	}

}
