package ae.skiply.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ae.skiply.model.Receipt;
import ae.skiply.service.IReceiptService;

@RestController
@RequestMapping("api/receipts")
public class ReceiptController {

	@Autowired
	private IReceiptService receiptService;

	// Create Receipt Rest API
	@PostMapping
	public ResponseEntity<Receipt> saveReceipt(@RequestBody Receipt receipt) {
		return new ResponseEntity<Receipt>(receiptService.saveReceipt(receipt), HttpStatus.CREATED);
	}

	// get All Receipts Rest API
	@GetMapping
	public List<Receipt> getAllReceipt() {
		return receiptService.getAllReceipt();
	}

	// get Receipt by Id Rest API
	@GetMapping("{id}")
	public ResponseEntity<Receipt> getReceiptById(@PathVariable("id") Long receiptId) {
		return new ResponseEntity<Receipt>(receiptService.getReceiptById(receiptId), HttpStatus.OK);
	}

	// update Receipt by Id Rest API
	@PutMapping("{id}")
	public ResponseEntity<Receipt> updateReceipt(@PathVariable("id") Long receiptId, @RequestBody Receipt receipt) {
		return new ResponseEntity<Receipt>(receiptService.updateReceipt(receipt, receiptId), HttpStatus.OK);
	}
	
	//delete Receipt by Id Rest API
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteReceipt(@PathVariable("id") Long id){
		
		receiptService.deleteReceiptById(id);
		return new ResponseEntity<String>("Receipt deleted successfully.", HttpStatus.OK);
	}

}
