package ae.skiply.service;

import java.util.List;

import ae.skiply.model.Receipt;

public interface IReceiptService {
	Receipt saveReceipt(Receipt receipt); 
	List<Receipt> getAllReceipt(); 
	Receipt getReceiptById(Long id);
	Receipt updateReceipt(Receipt receipt, Long id);
	void deleteReceiptById(Long id);
}
