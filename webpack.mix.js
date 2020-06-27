const mix = require('laravel-mix');
const webpackConfig = require('./webpack.config');

/*
 |--------------------------------------------------------------------------
 | Mix Asset Management
 |--------------------------------------------------------------------------
 |
 | Mix provides a clean, fluent API for defining some Webpack build steps
 | for your Laravel application. By default, we are compiling the Sass
 | file for the application as well as bundling up all the JS files.
 |
 */

mix
	.webpackConfig(webpackConfig)
	.version()
	.js('assets/js/app.js', 'src/main/resources/static/js')
    .sass('assets/sass/app.scss', 'src/main/resources/static/css');
