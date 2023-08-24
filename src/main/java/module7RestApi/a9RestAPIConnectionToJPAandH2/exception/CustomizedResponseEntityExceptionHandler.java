package module7RestApi.a9RestAPIConnectionToJPAandH2.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorDetails> handleAllException( Exception ex, WebRequest request) throws Exception{
        ErrorDetails errorDetails = new ErrorDetails ( LocalDateTime.now (),
                ex.getMessage (), request.getDescription ( false ));

        return new ResponseEntity<ErrorDetails> ( errorDetails, HttpStatus.INTERNAL_SERVER_ERROR );
    }

    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity<ErrorDetails> handleUserNotFoundException( Exception ex, WebRequest request) throws Exception{
        ErrorDetails errorDetails = new ErrorDetails ( LocalDateTime.now (),
                ex.getMessage (), request.getDescription ( false ));

        return new ResponseEntity<ErrorDetails> ( errorDetails, HttpStatus.NOT_FOUND );
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {

        ErrorDetails errorDetails = new ErrorDetails ( LocalDateTime.now (),
                ex.getMessage (), request.getDescription ( false ));

        // we can customize a long error message also, as
        ex.getFieldError ().getDefaultMessage ();
        return new ResponseEntity( errorDetails, HttpStatus.NOT_FOUND );
    }

}
