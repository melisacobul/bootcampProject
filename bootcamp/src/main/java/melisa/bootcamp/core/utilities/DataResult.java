package melisa.bootcamp.core.utilities;

import com.sun.net.httpserver.Authenticator.Result;

public class DataResult<T> extends Result{
	private T data;
	
	public DataResult( T data, boolean success, String message) {
		super();
		this.data = data;
	}
	public DataResult(T data, boolean success) {
		super();
		this.data = data;
	}
	public T getData() {
		return this.data;
	}
}
