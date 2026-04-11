# Running as a service

To run this program as a service, do the following:

1) Make any changes to applications.properties and rebuild the jar file with "mvn clean install"

2) Modify the AmbientWeatherStationAPRS.service file to change the user and working directory.

3) Copy AmbientWeatherStationAPRS.service to /etc/systemd/system

4) Register the service with the following commands:
    sudo systemctl daemon-reload
    sudo systemctl enable AmbientWeatherStationAPRS
    sudo systemctl start AmbientWeatherStationAPRS

