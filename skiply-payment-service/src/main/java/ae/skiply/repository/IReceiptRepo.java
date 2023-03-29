package ae.skiply.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ae.skiply.model.Receipt;

public interface IReceiptRepo extends JpaRepository<Receipt, Long> {

}
