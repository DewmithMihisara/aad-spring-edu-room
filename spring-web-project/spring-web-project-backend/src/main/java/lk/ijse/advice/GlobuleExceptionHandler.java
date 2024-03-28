package lk.ijse.advice;

import lk.ijse.service.exception.DuplicateRecordException;
import lk.ijse.service.exception.NotFoundException;
import lk.ijse.service.exception.ServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Dewmith Mihisara
 * @date 2024-03-28
 * @since 1.0.0
 */
@RestControllerAdvice
public class GlobuleExceptionHandler {
    @ExceptionHandler(ServiceException.class)
    public ResponseEntity<Map<String,Object>>handleServiceException(ServiceException e){
        Map<String,Object>errorAttributes;
        if (e instanceof DuplicateRecordException){
            errorAttributes=getCommonErrorAttributes(HttpStatus.BAD_REQUEST);
        } else if (e instanceof NotFoundException){
            errorAttributes=getCommonErrorAttributes(HttpStatus.NOT_FOUND);
        }else {
            errorAttributes=getCommonErrorAttributes(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        errorAttributes.put("message",e.getMessage());
        return new ResponseEntity<>(errorAttributes, HttpStatus.valueOf((Integer) errorAttributes.get("code")));
    }
    public Map<String,Object> getCommonErrorAttributes(HttpStatus httpStatus){
        LinkedHashMap<String, Object> errorAttribute = new LinkedHashMap<>();
        errorAttribute.put("code",httpStatus.value());
        errorAttribute.put("status",httpStatus);
        return errorAttribute;
    }
}
