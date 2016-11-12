var gulp = require('gulp');

var insert = require('gulp-insert');
var rename = require('gulp-rename');
var replace = require('gulp-replace');

var screeps = require('gulp-screeps');
var credentials = require('./local.js').credentials;

gulp.task('prepare', function () {
    return gulp
        .src('target/js/bundle.js')
        .pipe(rename("main.js"))
        .pipe(replace(/console.log\('EXPORT main='(.)*\s/, ''))
        .pipe(insert.append('module.exports.loop = function () {console.info = console.log;_exportedVar_main.loop();};'))
        .pipe(gulp.dest('target/screeps'));
});

gulp.task('screeps',['prepare'], () => {
    gulp.src('target/screeps/*.js')
        .pipe(screeps(credentials));
});

gulp.task('default', ['prepare', 'screeps']);