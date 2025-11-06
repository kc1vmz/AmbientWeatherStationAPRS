# Ambient Weather Agent

## What is this?

This software was created to send supported Ambient Weather Station's weather data to CWOP via the https://cwop.rest service.

When supported devices are configured, they will send weather data as an HTTP GET to an enpoint you configure.  This service listens on that endpoint, converts the data as necessary, and sends it to CWOP via https://cwop.rest.


## Configuration notes

In this software, change the application.properties file to include your station id / callsign, longitude and latitude to use when sending data to CWOP via https://cwop.rest.

On supported Ambient Weather Stations, you can configure a Customization server to send weather data to this service.

Provide the IP address of the host running this software, with a port of 8888 and a path of '/report/fix=1'.
The port number can be changed in application.properties, or set using the AW_HTTP_PORT environment variable.

Note: Customization layer on the Ambient Weather Station is "broken" in that it does not start the query parameters with a '?'
Make sure the URL for customization is set to AmbientWeather and the add path is '/report?fix=1'

Just using /report will not work as the URL sent in the GET will be /report&weatherdata... not /report?fix=1&weatherdata...


## License

The MIT License (MIT)

Copyright © 2025 John Rokicki

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

