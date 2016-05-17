package adages2;

import org.restlet.data.MediaType;
import org.restlet.data.Status;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class PlainResource extends ServerResource {
    public PlainResource() { }
    @Get
    public Representation toPlain() {
	String adages = Adages.toPlain();
	Status status = Status.SUCCESS_OK;
	setStatus(status);
	return new StringRepresentation(adages, MediaType.TEXT_PLAIN);
    }

}
