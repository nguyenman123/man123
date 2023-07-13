package com.hoclaptrinhjavaweb;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hoclaptrinhjavaweb.dto.NewDTO;


/*
 * @Controller: định nghĩa NewAPI từ 1 java class thành 1 API web service trong spring boot, hiểu đơn giản là biến 1 java class thông thường thành 1 API trong restful web service của spring boot

@RequestMapping: tìm kiếm theo đúng URL của request từ client

RequestMethod.POST: là 1 trong 4 HTTP method, POST được dùng trong các trường hợp thêm dữ liệu vào trong database

Khi viết API, bắt buộc chúng ta phải định nghĩa HTTP method cho API đó

@RequestBody: nhận dữ liệu json được truyền từ client vào server

@ResponseBody: trả kết quả json từ server về client

@RestController thay thế cho @Controller + @ResponseBody
 */
@RestController
public class NewAPI {
	//@PostMapping thay thế cho @RequestMapping + RequestMethod.POST
	//@RequestMapping(value = "/new", method = RequestMethod.POST)
	@PostMapping(value = "/new")
	public NewDTO createNew(@RequestBody NewDTO model) {
		return model;
	}
	
	@PutMapping(value = "/new")
	public NewDTO updateNew(@RequestBody NewDTO model) {
		return model;
	}
	
	@DeleteMapping(value = "/new")
	public void deleteNew(@RequestBody long[] ids) {

	}
}
