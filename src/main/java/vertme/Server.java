package vertme;

import io.vertx.core.Vertx;

import java.io.IOException;

public class Server {

	public static void main(String[] args) throws IOException {
		final Vertx vertx = Vertx.vertx();
		for(int i=0;i<8;i++){
			vertx.createHttpServer().requestHandler(req->{
				req.response().end("hello world!");
			}).listen(8080);
		}
		System.in.read();
	}
}