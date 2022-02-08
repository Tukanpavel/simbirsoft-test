<h1>This is my take on a Simbirsoft's test.</h1>
<h3>Here's how to start it:</h3>
<p>I used Oracle's 17 JDK, but didn't tested with any others, so I can't really expect it to work with other JDKs.</p>
<p>The database is postgres, and I used 14th version of it, other settings you can find in docker-compose file or in application.properties. The purpose of docker compose is purely to set up a database, the app is started separately, by command like <code>mvn deploy</code>; it worked just fine for me.</p>
<h3>Testing</h3>
<p>If you want to test this app, I highly recommend that you use Swagger.(<a href = http://localhost:8080/swagger-ui.html>http://localhost:8080/swagger-ui.html</a>)
</p>
