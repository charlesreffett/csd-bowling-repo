const path = require('path');
const webpack = require('webpack');

module.exports = {
	resolve: {
		alias: {
			'@js': path.resolve(__dirname, 'assets/js'),
			'@sass': path.resolve(__dirname, 'assets/sass'),
		},
	}
};
