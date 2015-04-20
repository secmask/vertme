package vertme;

import io.vertx.core.Vertx;

import java.io.IOException;

public class Server {

	public static void main(String[] args) throws IOException {
		final Vertx vertx = Vertx.vertx();
		for(int i=0;i<8;i++){
			vertx.createHttpServer().requestHandler(req->{
				req.response().putHeader("content-type", "text/html").end("<html><body><h1>Hello</h1></body></html>");
			}).listen(8080);
		}
		System.in.read();
	}
}