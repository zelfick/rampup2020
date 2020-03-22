package mail2clients.util.exception;


public class BusinessException extends Exception{

    public BusinessException(BusinessExceptionEnum businessExceptionEnum){
        super(businessExceptionEnum.getMessage());
    }
}

