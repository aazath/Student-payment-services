package ae.skiply.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ae.skiply.exception.ResourceNotFoundException;
import ae.skiply.model.Receipt;
import ae.skiply.repository.IReceiptRepo;

@Service
public class ReceiptServiceImpl implements IReceiptService {

	@Autowired
	private IReceiptRepo receiptRepo;

	@Override
	public Receipt saveReceipt(Receipt receipt) {
		return receiptRepo.save(receipt);
	}

	@Override
	public List<Receipt> getAllReceipt() {
		return receiptRepo.findAll();
	}

	@Override
	public Receipt getReceiptById(Long id) {
		return receiptRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Receipt", "id", id));
	}

	@Override
	public Receipt updateReceipt(Receipt receipt, Long id) {

		// Check whether the receipt with the Id exists nor not
		Receipt existingReceipt = receiptRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Receipt", "id", id));

		// update the values
		existingReceipt.setStudent_id(receipt.getStudent_id());
		existingReceipt.setStudent_name(receipt.getStudent_name());
		existingReceipt.setCard_no(receipt.getCard_no());
		existingReceipt.setCard_type(receipt.getCard_type());
		existingReceipt.setReference_no(receipt.getReference_no());

		// save receipt with updated values
		receiptRepo.save(existingReceipt);
		return existingReceipt;
	}

	@Override
	public void deleteReceiptById(Long id) {
		// Check whether the receipt with the Id exists nor not
		Receipt existingReceipt = receiptRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Receipt", "id", id));

		// Delete the student
		receiptRepo.deleteById(id);
	}

}
