package vn.de.example.parkingregistration.service;

import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = Throwable.class)
public class BaseTransactionalService {

}
