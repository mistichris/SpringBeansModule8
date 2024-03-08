package module8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import module8.beans.Company;

/**
 * @author Misti Christianson - mchristianson
 * CIS175 - Spring 2024
 * Mar 7, 2024
 */
@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
