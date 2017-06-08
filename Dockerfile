FROM builder-base:latest

ADD target/IgniteService-1.jar /service.jar
ADD config.yml /config.yml

HEALTHCHECK CMD curl --fail http://localhost:4567/ping || exit 1

CMD [ "/run.sh" ]