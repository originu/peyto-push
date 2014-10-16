package peyto.push.server.http.controllers.result;

public class ResultDescription< T > {

	private String id;
	private String description;
	private T	body;

	public ResultDescription() {
		// TODO Auto-generated constructor stub
	}

	public ResultDescription(String id, String description, T body) {
		this.id = id;
		this.description = description;
		this.body = body;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "ResultDescription [id=" + id + ", description=" + description
				+ ", body=" + body + "]";
	}
	
}
