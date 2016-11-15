This is a Java API for the programming game Screeps.

A detailed Readme will probably be added later. But for now here's a short explanation on how it works:

* A typescript definition was converted to a Java / JSweet API via
  http://www.jsweet.org/online-typescript-to-java-api-translator/
* A maven project holds everything together
* JSweet is used to transpile the java code back to javascript.
* NodeJS and NPM is locally installed and Gulp is used for the rest of the process.
* module.exports.loop get's added to the transpiled code, which runs the loop method of the Main class
* Gulp pushes the target/screeps/main.js to Screeps, according to the credentials in the local.js.

Typescript defintions taken from
https://github.com/screepers/Screeps-Typescript-Declarations/

Current TODOs:

* Allow for local folder deployment instead of Gulp (for local servers)
* Finish and include demo project
* Update this README