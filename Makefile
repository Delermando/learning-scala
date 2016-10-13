up:
	docker-compose up -d

kill:
	docker-compose kill

rm: kill
	docker-compose rm -f

dev:
	docker exec -it scala /bin/bash