var gulp = require('gulp');

var insert = require('gulp-insert');
var replace = require('gulp-replace');
var concat = require('gulp-concat');

var screeps = require('gulp-screeps');
var localConfig = require('./local.js');

/** Temporary, once JSweet get's fixed, remove this and turn tsOnly off in pom.xml
    This removes all invalid empty, non-declared root namespaces from the bundle.d.ts
    and then compiles it **/
var ts = require("gulp-typescript");
gulp.task('prepare-ts', () => {
    return gulp
        .src('target/ts/bundle.d.ts')
        .pipe(replace(/^namespace (.*)? \{\s*?\}/gm, ''))
        .pipe(gulp.dest('target/ts'));
});
gulp.task('make-js', ['prepare-ts'], () => {
    return gulp.src(['target/ts/**/*.ts','.jsweet/candies/typings/**/*.ts'])
        .pipe(ts({
            out: 'bundle.js'
        }))
        .on('error', function (error) {
            process.exit(1);
        })
        .pipe(gulp.dest('target/js'));
});
/** End temporary **/

gulp.task('prepare-js', ['make-js'],  () => {
    return gulp
        .src(['target/js/bundle.js', 'target/candy/j4ts-*/bundle.js'])
        .pipe(concat("main.js"))
        .pipe(replace(/console.log\('EXPORT main='(.)*\s/, ''))
        .pipe(insert.append('module.exports.loop = function () {console.info = console.log;_exportedVar_main.loop();};'))
        .pipe(gulp.dest('target/screeps'));
});

gulp.task('screeps',['make-js', 'prepare-js'], () => {
    if (localConfig.method == 'gulp') {
        return gulp
            .src('target/screeps/*.js')
            .pipe(screeps(localConfig.credentials));
    } else {
        return gulp
            .src('target/screeps/*.js')
            .pipe(gulp.dest(localConfig.path));
    }
});

gulp.task('default', ['make-js', 'prepare-js', 'screeps']);