package vertme;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class MyHttpServer extends AbstractVerticle {

	@Override
	public void start(Future<Void> startFuture) throws Exception {
		vertx.createHttpServer().requestHandler(req -> {
		      req.response().putHeader("content-type", "text/html").end("<html><body><h1>Hello</h1></body></html>");
	    }).listen(8080);
		startFuture.complete();
	}
}