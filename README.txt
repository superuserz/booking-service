Deliverables Checklist

Github URL : https://github.com/superuserz/booking-service.git
Dockerfile : Provided
Docker Image : manmeetdevgun/booking-service:latest
Docker Repo URL : https://hub.docker.com/repository/docker/manmeetdevgun/booking-service/general

URL for service API Tier to view records from backend tier.

http://20.204.187.156:8080/
http://20.204.187.156:8080/booking/1

Other Details

1. Two PODs has been used. One for Spring Boot App and another to host mysql server.
2. Spring Boot Service has 4 replicas.
3. Spring Boot Service has been exposed with external IP using Load Balance Service Object.
4. MySQL Service POD has Service Object of type ClusterIP so the the Spring Boot Service Object can communicate with it.
5. Persistent volume claim has been setup for MYSQL Service which will allow Data to be saved in DB even if POD is recreated.
6. Database password has been stored as secret (Base 64 encoded).
7. POD IPs are NOT used for inter-Pod communication
8. Rolling Updates and Readiness probes have been setup.



NOTE : While evaluation if you require to access the service URL, please connect with me so that I can start the cluster. It will
probably be stored due to free subscription of azure cloud to avoid unnecessary credit cost. Although working demo video will be provide along
with the submission.
