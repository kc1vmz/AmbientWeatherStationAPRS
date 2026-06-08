# Running as a service

To run this program as a service, do the following:

1) Modify the AmbientWeatherStationAPRS.service file to change
    the user
    the working directory
    the environment variables (AW_CALLSIGN, AW_LAT, AW_LON, AW_HTTP_PORT (default is 8888))

2) Copy AmbientWeatherStationAPRS.service to /etc/systemd/system

3) Register the service with the following commands:
    sudo systemctl daemon-reload
    sudo systemctl enable AmbientWeatherStationAPRS
    sudo systemctl start AmbientWeatherStationAPRS

# Running from a terminal

To run this program from a terminal, do the following:

1) make sure to set the following environment variables:
    AW_CALLSIGN
    AW_LAT
    AW_LON
    AW_HTTP_PORT (default is 8888)

2) Make sure the permissions on the ambientweatheragent-1.6.jar file are set for execution

3) Run the following command:
    java -jar ambientweatheragent-1.6.jar

