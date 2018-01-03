package controllers;

import akka.stream.javadsl.FileIO;
import akka.stream.javadsl.Source;
import akka.util.ByteString;
import play.*;
import play.api.http.HttpEntity;
import play.api.mvc.ResponseHeader;
import play.mvc.*;

import views.html.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Optional;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }
    public Result projects(){
        return ok(projects.render("Hey"));
    }
    public Result resume() throws FileNotFoundException {
        return ok(new FileInputStream("public/images/PrashantTanksali_resume.pdf")).as("application/pdf");
    }

}
